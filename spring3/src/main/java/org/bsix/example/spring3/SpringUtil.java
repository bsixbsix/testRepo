package org.bsix.example.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	private static ApplicationContext CONTEXT;
	
	static {
		CONTEXT = new ClassPathXmlApplicationContext(new String[] { "bean.xml" });
	}
	
	
	
	/***/
	public static ApplicationContext getContext(){
		return CONTEXT;
	}
}
