package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardUpdateAction extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		String title = req.getParameter("title");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String content = req.getParameter("content");
		Long no = Long.parseLong(req.getParameter("no"));  
		
		BoardDto boardDto = new BoardDto();
		boardDto.setNo(no);
		boardDto.setTitle(title);
		boardDto.setName(name);
		boardDto.setPassword(password);
		boardDto.setContent(content);
		
		BoardDao boardDao = BoardDao.getInstance();
		boolean result = boardDao.updateBoard(boardDto);
		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		if(result) {
//			mav.addObject("msg", "글이 등록되었습니다.");
//			mav.addObject("url", "BoardList.do");
			return new ModelAndView("redirect:BoardView.do?no="+no);
		}else {
			mav.addObject("msg", "글 수정 실패.");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
	}

}
