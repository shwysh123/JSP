package Listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class C02ServletContextAttrListner implements ServletContextAttributeListener{

	
	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		 //�Ӽ� �߰��� ���� 
		System.out.println("C02ServletContextAttrListner's attributeAdded call!");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		 //�Ӽ� ���Ž� ����
		System.out.println("C02ServletContextAttrListner's attributeRemoved call!");

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		 //�Ӽ� ����� ���� 
		System.out.println("C02ServletContextAttrListner's attributeReplaced call!");

	}

	
	
}