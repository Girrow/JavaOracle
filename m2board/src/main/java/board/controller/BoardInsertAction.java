package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import board.model.BoardDto;
import board.model.MemberDao;
import board.model.MemberDto;

public class BoardInsertAction extends AbstractController {
	private static Logger logger = Logger.getLogger(BoardInsertAction.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		MemberDto userInfo = (MemberDto) session.getAttribute("userInfo");
		if(userInfo == null) {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "먼저 로그인 하셔야 합니다");
			mav.addObject("url", "Login.do");
			return mav;
		}
		
		String title=req.getParameter("title");
		String content = req.getParameter("content");
		MemberDao memberDao = MemberDao.getInstance();
		
		BoardDto boardDto = new BoardDto();
		boardDto.setMemberDto(userInfo);
		boardDto.setTitle(title);
		boardDto.setContent(content);
		
		logger.info(boardDto);
		boolean result = memberDao.insertWrite(boardDto);
		
		
		if(result) {
			return new ModelAndView("redirect:BoardList.do");
		}else {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "글쓰기 실패");
			mav.addObject("url", "javascript:history.back()");
			return mav;
		}
	}

}
