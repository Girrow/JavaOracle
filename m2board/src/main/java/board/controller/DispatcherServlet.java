package board.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class DispatcherServlet extends HttpServlet {
	private Logger logger= Logger.getLogger(DispatcherServlet.class);
	private Map<String,AbstractController> actionMap = new HashMap<>();
	
	/*
	public DispatcherServlet() {
		logger.info("DispatcherServlet 생성");
	}
	@Override
	public void destroy() {
		logger.info("Destroy Dispatcher");
	}
*/
	@Override
	public void init() throws ServletException {
//		logger.info("init() Method 수행");
		String props = this.getClass().getResource("dispatcher.properties").getPath();
		Properties pr = new Properties();
		try (FileInputStream fi = new FileInputStream(props)){
			pr.load(fi);
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Object obj : pr.keySet()) {
			String key = ((String)obj).trim();
			String className = pr.getProperty(key).trim();
			
			try {
				Class<?> actionClass = Class.forName(className);
				AbstractController controller = (AbstractController) actionClass.getConstructor().newInstance();
				actionMap.put(key, controller);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		logger.info("service() Method 수행");
		String requestURI = req.getRequestURI();
		String action =requestURI.substring(req.getContextPath().length()); 
		logger.info(requestURI);
		logger.info(action);
		
		AbstractController controller = null;
		ModelAndView mav = null;
		
		controller = actionMap.get(action);
		mav = controller.handleRequestInternal(req,res);
		
		
		if(mav!=null) {
			String viewName=mav.getViewName();
			if(viewName.startsWith("redirect")) {
				res.sendRedirect(viewName.substring("redirect:".length()));
				return;
			}
			
			Map<String, Object> model = mav.getModel();
			for(String key : model.keySet()) {
				req.setAttribute(key, model.get(key));
			}
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(mav.getViewName());
			dispatcher.forward(req, res);
		}else {
			logger.info("MAV is null");
		}
//		/BoardInsert.do
//		/BoardInsertAction.do
//		/BoardList.do
//		/BoardView.do
//		/BoardUpdate.do
//		/BoardUpdateAction.do
//		/BoardDelete.do
//		/BoardDeleteAction.do
		
	}

}
