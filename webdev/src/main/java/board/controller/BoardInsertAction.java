package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardInsertAction extends AbstractController {
	private Logger logger = Logger.getLogger(BoardInsertAction.class);

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		String title = req.getParameter("title");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String content = req.getParameter("content");
		
		BoardDto boardDto = new BoardDto();
		boardDto.setTitle(title);
		boardDto.setName(name);
		boardDto.setPassword(password);
		boardDto.setContent(content);
		logger.info(boardDto);
		
		BoardDao boardDao = BoardDao.getInstance();
		boolean result = boardDao.insertBoard(boardDto);
		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		if(result) {
//			mav.addObject("msg", "글이 등록되었습니다.");
//			mav.addObject("url", "BoardList.do");
			return new ModelAndView("redirect:BoardList.do");
		}else {
			mav.addObject("msg", "글 등록 실패.");
			mav.addObject("url", "javascript:history.back();");
		}
		
		return mav;
	}

}
