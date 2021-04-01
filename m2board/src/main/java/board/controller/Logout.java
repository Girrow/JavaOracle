package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.MemberDto;

public class Logout extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		MemberDto userInfo = (MemberDto) session.getAttribute("userInfo");
		
		if(userInfo == null) {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "먼저 로그인 하셔야 합니다");
			mav.addObject("url", "Login.do");
		}
		
		String logoutInfo = userInfo.getName()+"("+userInfo.getId()+") 님이 로그아웃";
		session.invalidate();
		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		mav.addObject("msg", logoutInfo);
		mav.addObject("url", "Login.do");
		return mav;
	}

}
