package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class C03UTF_8_EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("C03UTF_8_EncodingFilter Start------");
		
		// ��û�� ������ ���ڵ��� UTF-8�� ����
					req.setCharacterEncoding("UTF-8");
					resp.setCharacterEncoding("UTF-8");
					resp.setContentType("text/html; charset=UTF-8");
					
					chain.doFilter(req, resp);
					
					System.out.println("C03UTF_8_EncodingFilter end------");
		
	}

	
}