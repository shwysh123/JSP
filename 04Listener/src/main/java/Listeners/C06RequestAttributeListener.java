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
	        System.out.println("ServletRequestAttributeListener 加己 眠啊: " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue() +
	                " (夸没: " + request.getRequestURI() + ")");
	    }

	    @Override
	    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener 加己 力芭: " + servletRequestAttributeEvent.getName() + " (夸没: " + request.getRequestURI() + ")");
	    }

	    @Override
	    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener 加己 措眉: " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue() +
	                " (夸没: " + request.getRequestURI() + ")");
	    }
}