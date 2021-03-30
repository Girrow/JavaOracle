package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardDeleteAction extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		Long no = Long.parseLong(req.getParameter("no"));  
		String password = req.getParameter("password");
		
		BoardDto boardDto = new BoardDto();
		boardDto.setNo(no);
		boardDto.setPassword(password);
		
		BoardDao boardDao = BoardDao.getInstance();
		boolean result = boardDao.deleteBoard(boardDto);
		
		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		if(result) {
			mav.addObject("msg", "글이 삭제되었습니다.");
			mav.addObject("url", "BoardList.do");
//			return new ModelAndView("redirect:BoardList.do");
		}else {
			mav.addObject("msg", "글 삭제 실패.");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
	}
	

}
