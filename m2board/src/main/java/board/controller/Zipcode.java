package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.MemberDao;
import board.model.ZipcodeDto;

public class Zipcode extends AbstractController{
	private static Logger logger = Logger.getLogger(Zipcode.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) {
		String area = req.getParameter("area");
		logger.info("Area : "+area);
		
		if(area==null) {
			return new ModelAndView("/WEB-INF/board/zipcode.jsp");
		}else { // 동이름 검색 시
			MemberDao memberDao = MemberDao.getInstance();
			List<ZipcodeDto> list = memberDao.searchZipcode(area);
			
//			for(ZipcodeDto zip : list) {
//				logger.info(zip);
//			}
			ModelAndView mav = new ModelAndView("/WEB-INF/board/zipcode.jsp", "list", list);
			mav.addObject("list", list);
			mav.addObject("area", area);
			return mav;
		}
		
	}

}
