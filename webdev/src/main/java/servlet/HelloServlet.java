package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		res.setContentType("text/html;charset=UTF-8");
		
		
		try(PrintWriter out = res.getWriter();) {
			out.println("헬로");
			out.println(name+"Service 월드");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		res.setContentType("text/html;charset=UTF-8");
		
//		System.out.println("doGet call : HelloServlet");
//		res.setContentType("text/html;charset=UTF-8");
		
		try(PrintWriter out = res.getWriter();) {
//			out.append("<html><head><title>Hello,</title></head>");
			out.println("헬로");
			out.println("Get 월드");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		res.setContentType("text/html;charset=UTF-8");
		
		
//		System.out.println("doGet call : HelloServlet");
//		res.setContentType("text/html;charset=UTF-8");
		
		try(PrintWriter out = res.getWriter();) {
//			out.append("<html><head><title>Hello,</title></head>");
			out.println("헬로");
			out.println("Post 월드");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
