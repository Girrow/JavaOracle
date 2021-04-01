package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class Zipcode extends AbstractController{
	private static Logger logger = Logger.getLogger(Zipcode.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		String area = req.getParameter("area");
		logger.info("Area : "+area);
		return new ModelAndView("/WEB-INF/board/zipcode.jsp");
	}

}
