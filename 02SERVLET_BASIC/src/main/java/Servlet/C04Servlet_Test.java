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
import javax.servlet.http.HttpSession;

@WebServlet("/join.do")
public class C04Servlet_Test extends HttpServlet {
	//join������ ���ٽ�
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET /join.do ");
		req.getRequestDispatcher("/WEB-INF/join.jsp").forward(req, resp);
	}
	//join�������� ����ϼ��� ���Կ�û��
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST /join.do ");
		//�Ķ����
		String email= req.getParameter("email");
		String pwd = req.getParameter("pwd");
	
		String path = req.getContextPath();
			//��ȿ��
		if(email==null||pwd==null) {
			resp.sendRedirect("join.do");
			return;
		}
		//����
		
		//view�� �̵�(Forward/Redirect)����/���ο� ��û
		HttpSession session = req.getSession();
		session.setAttribute("email", email);
		resp.sendRedirect(path+"/C03Main.jsp");
	}

	

}
