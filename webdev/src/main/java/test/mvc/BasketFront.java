package test.mvc;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasketFront extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		BasketList list = new BasketList();
//		String view = list.getBasketList(req,res);
		ModelAndView mav = list.getBasketList(req, res);
		Map<String, Object> model = mav.getModel();
		for(String key: model.keySet()) 
			req.setAttribute(key, model.get(key));	
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(mav.getViewName());
		dispatcher.forward(req, res);
		
	}
}
