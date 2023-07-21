package Filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Type.Role;

public class C04Permission_Filter implements Filter{

	//�������� �������� ���� Map
	// /user.do - Role.ROLE_USER
	// /admin.do - Role.ROLE_ADMIN
	Map<String,Role> pageGradeMap = new HashMap();
	
	public void init(FilterConfig filterConfig) throws ServletException {
		String Path = filterConfig.getServletContext().getContextPath();
		pageGradeMap.put(Path+"/user.do", Role.ROLE_USER);	//0
		pageGradeMap.put(Path+"/admin.do", Role.ROLE_ADMIN);//1
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//��
		System.out.println("C04Permission_Filter start------");
		
		//���ǿ��� Role ��������
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		Role userRole = (Role) session.getAttribute("ROLE");
		if(userRole==null) {
			throw new ServletException("ROLE�� ���� �͸� �����Դϴ�..");
		}
		//Map���� Page��  Role ��������
		String reqUri = req.getRequestURI();	//URL : http://localhost:8080/C01JSP/index.html
												//URI : /C01JSP/index.html
		Role pageRole = pageGradeMap.get(reqUri);
		if(userRole.ordinal()<pageRole.ordinal()) {
			throw new ServletException("������ ������ �������� ������ ��û�� �մϴ�..");
		}
		chain.doFilter(request, response);
		//��
		System.out.println("C04Permission_Filter end ------");
	}

	

	
}
