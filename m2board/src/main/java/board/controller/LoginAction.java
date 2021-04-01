package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import board.model.MemberDao;
import board.model.MemberDto;


public class LoginAction extends AbstractController {
	private static Logger logger = Logger.getLogger(LoginAction.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		memberDto.setPassword(password);
		logger.info(memberDto);
		
		MemberDao memberDao = MemberDao.getInstance();
		MemberDto userInfo = memberDao.getUser(memberDto);
		if(userInfo!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("userInfo", userInfo);
			return new ModelAndView("redirect:BoardList.do");
		}else {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "login fail!");
			mav.addObject("url", "Login.do?id="+id);
			return mav;
		}
	}
	
    
}
