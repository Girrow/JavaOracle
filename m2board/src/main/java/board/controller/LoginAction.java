package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginAction extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		return new ModelAndView("/WEB-INF/board/login.jsp");
	}
	
    
}
