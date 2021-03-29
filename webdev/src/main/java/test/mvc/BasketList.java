package test.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasketList {
	
	public String getBasketList(HttpServletRequest req, HttpServletResponse res) {
		List<BasketMember> list = new ArrayList<>();
		list.add(new BasketMember("서태웅", "SF", 11, 30.1));
		list.add(new BasketMember("강백호", "PF", 10, 7.0));
		list.add(new BasketMember("채치수", "C", 4, 26.1));
		list.add(new BasketMember("정대만", "SG", 14, 27.1));
		
		req.setAttribute("list", list);
		return "/WEB-INF/view/basket.jsp";
	}

}
