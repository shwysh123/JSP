package Listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class C06RequestAttributeListener implements ServletRequestAttributeListener{
	
	  @Override
	    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener �Ӽ� �߰�: " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue() +
	                " (��û: " + request.getRequestURI() + ")");
	    }

	    @Override
	    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener �Ӽ� ����: " + servletRequestAttributeEvent.getName() + " (��û: " + request.getRequestURI() + ")");
	    }

	    @Override
	    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener �Ӽ� ��ü: " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue() +
	                " (��û: " + request.getRequestURI() + ")");
	    }
}