package Listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class C04SessionAttributeListener implements HttpSessionAttributeListener{

	  @Override
	    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener �Ӽ� �߰�: " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue() +
	                " (����: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }

	    @Override
	    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener �Ӽ� ����: " + httpSessionBindingEvent.getName() +
	                " (����: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }

	    @Override
	    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener �Ӽ� ��ü: " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue() +
	                " (����: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }
	    
}