package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardUpdate extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		BoardDao boardDao = BoardDao.getInstance();
		BoardDto boardDto = boardDao.getBoardView(Long.parseLong(req.getParameter("no")) );
		
		return new ModelAndView("/WEB-INF/board/update.jsp", "boardDto", boardDto);
	}

}
