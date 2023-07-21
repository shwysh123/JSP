package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login_do")
public class C03Servlet_Test extends HttpServlet {

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGET!!");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		System.out.println("email : "+email+ "pwd : "+ pwd);
		
		//request�� ��������
		req.setAttribute("email", email);
		req.setAttribute("pwd", pwd);
		
		
		//Forward
		req.getRequestDispatcher("/C03Main.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPOST!!");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		System.out.println("email : "+email+ "pwd : "+ pwd);
		
		//request�� ��������
		req.setAttribute("email", email);
		req.setAttribute("pwd", pwd);
		
		
		//Forward
		req.getRequestDispatcher("/C03Main.jsp").forward(req, resp);
	}


	@Override
	public void init() throws ServletException {
		//���� 1ȸ ����
		System.out.println("INIT");
	}
	/*
	 * @Override public void service(ServletRequest arg0, ServletResponse arg1)
	 * throws ServletException, IOException {
	 * 
	 * System.out.println("SERVICE!"); }
	 */

	@Override
	public void destroy() {
		//���� ����, �����, �ڵ������
		System.out.println("DESTROY!");
	}

	
	

}
