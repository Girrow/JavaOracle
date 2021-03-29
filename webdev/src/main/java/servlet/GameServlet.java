package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GameServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		super.service(arg0, arg1);
		int you = Integer.parseInt(req.getParameter("you"));
		int com = (int) (Math.random() * 3);
//		System.out.println(you + " , " + com);
		req.setAttribute("you", whatMethod(you));
		req.setAttribute("com", whatMethod(com));
		String conc = you == com 
				? "무승부"
				:((com+1) % 3 == you)
						?"컴퓨터가 이겼습니다"
						:"내가 이겼습니다";
		req.setAttribute("conc", conc);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/game/game_action.jsp");
		dispatcher.forward(req, res);
	}

	private String whatMethod(int key) {
		switch (key) {
		case 0:
			return "바위";
		case 1:
			return "가위";
		case 2:
			return "보";
		default:
			return "에러";
		}
	}
}
