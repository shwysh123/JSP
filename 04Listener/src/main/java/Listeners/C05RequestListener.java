package Listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class C05RequestListener implements ServletRequestListener{
	  @Override
	    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
	        System.out.println("��û ����: " + request.getRequestURI());
	    }

	    @Override
	    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
	        System.out.println("��û ����: " + request.getRequestURI());
	    }
}