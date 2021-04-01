package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.MemberDao;
import board.model.MemberDto;


public class MemberRegisterAction extends AbstractController {
	private static Logger logger = Logger.getLogger(MemberRegisterAction.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		
		String id = req.getParameter("user_id");
		String password = req.getParameter("user_pw");
		String name = req.getParameter("user_name");
		String birth = req.getParameter("user_birth");
		String phone = req.getParameter("user_phone");
		String zipcode = req.getParameter("zipcode");
		String address1 = req.getParameter("address1");
		String address2 = req.getParameter("address2");

		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		memberDto.setPassword(password);
		memberDto.setName(name);
		memberDto.setBirth(birth);
		memberDto.setPhone(phone);
		memberDto.setZipcode(zipcode);
		memberDto.setAddress1(address1);
		memberDto.setAddress2(address2);
		
		logger.info(memberDto);
		
		MemberDao memberDao = MemberDao.getInstance();
		boolean result = memberDao.registerMember(memberDto);
//		memberDao.abc(memberDto);
		if(result) {
			return new ModelAndView("/WEB-INF/board/success.jsp","memberDto",memberDto);
		}else {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", id+"회원 등록에 실패했습니다");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
	}
	
    
}
