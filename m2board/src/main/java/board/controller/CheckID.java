package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.MemberDao;

public class CheckID extends AbstractController{
	private static Logger logger = Logger.getLogger(CheckID.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("user_id");
		logger.info(id);
		MemberDao memberDao = MemberDao.getInstance();
		int count = memberDao.checkID(id);
		logger.info("cnt : "+count);
		return new ModelAndView("/WEB-INF/board/checkid.jsp","count",count);
	}

}
