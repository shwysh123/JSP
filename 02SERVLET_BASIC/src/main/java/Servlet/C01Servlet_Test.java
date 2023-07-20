package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/Servlet_Test01")
public class C01Servlet_Test extends HttpServlet {
	int i = 1;
	
	@Override
	public void init() throws ServletException {
		//���� 1ȸ ����
		System.out.println("INIT");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		//��û�ø��� ����_!
		//arg0�� ����� ��ü�� HttpServletRequest�� ������� request��ü�� �ּ��̴�.
		//�� HttpServletRequset��ü�� �����������̽� ���������� arg0�� �޴� �Ķ����
		HttpServletResponse response = (HttpServletResponse)arg1;
		PrintWriter out = response.getWriter();
		out.write("HELLO SMELL"+(i++));
		System.out.println("SERVICE!");
	}

	@Override
	public void destroy() {
		//���� ����, �����, �ڵ������
		System.out.println("DESTROY!");
	}

	
	

}
