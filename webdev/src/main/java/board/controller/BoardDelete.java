package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardDelete extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		Long no = Long.parseLong(req.getParameter("no"));
		/*
		 * BoardView를 가져와서 값을 줘야 하는지?
		 */
		return new ModelAndView("/WEB-INF/board/delete.jsp", "no", no);
	}

}
