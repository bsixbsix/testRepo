package org.bsix.example.spring3;

import org.bsix.example.spring3.action.UserAction;
import org.bsix.example.spring3.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class UserActionTest {

	@Test
	public void testAdd() {
		ApplicationContext context = SpringUtil.getContext(); 
		UserAction userAction1 = context.getBean("userAction", UserAction.class); 
		User user1 = new User("X01","小明");
		userAction1.setUser(user1);
		userAction1.add();
		
		UserAction userAction2 = context.getBean("userAction", UserAction.class); 
		User user2 = new User("X02","小红");
		userAction2.setUser(user2);
		userAction2.add();

	}

}
