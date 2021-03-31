package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


public class Iam extends HttpServlet {
	private static Logger logger = Logger.getLogger(Iam.class);
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		logger.info("name : "+name+", age : "+age);
		
		String iam = say(name,age);
		
		req.setAttribute("iam", iam);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/ajax01/iam2.jsp");
		dispatcher.forward(req, res);
		
	}

	private String say(String name, int age) {
		String msg =null;
		if (name.equals("송태섭"))
			msg =age+"세,"+ name + ", 도내 No.1 가드 <br>";
		else if (name.equals("서태웅"))
			msg =age+"세,"+ name + ", 도내 No.1 에이스 <br>";
		else if (name.equals("강백호"))
			msg =age+"세,"+ name + ", 도내 No.1 멍청이 <br>";
		else
			msg =age+"세,"+ name + ", 가끔 포기함 <br>";
		return msg;
	}
	
	

}
