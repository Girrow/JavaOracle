package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet("/CheckID")
public class CheckID extends HttpServlet {
	private static final Logger logger = Logger.getLogger(CheckID.class);
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		logger.info(id);
		
		UserDao userDao = UserDao.getInstance();
		int count = userDao.countId(id);
		logger.info("count :"+count);
		
		req.setAttribute("count", count);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/ajax01/checkid.jsp");
		dispatcher.forward(req, res);
	}
}
