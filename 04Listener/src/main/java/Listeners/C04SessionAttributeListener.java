package Listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class C04SessionAttributeListener implements HttpSessionAttributeListener{

	  @Override
	    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener 加己 眠啊: " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue() +
	                " (技记: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }

	    @Override
	    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener 加己 力芭: " + httpSessionBindingEvent.getName() +
	                " (技记: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }

	    @Override
	    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener 加己 措眉: " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue() +
	                " (技记: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }
	    
}