package org.bsix.example.spring3.action;

import java.text.DateFormat;
import java.util.Date;

import org.bsix.example.spring3.SpringUtil;
import org.bsix.example.spring3.dao.OtherDao;
import org.bsix.example.spring3.entity.LogMsg;
import org.bsix.example.spring3.entity.User;
import org.bsix.example.spring3.service.ILogMsgService;
import org.bsix.example.spring3.service.IUserService;

public class UserAction {
	private User user;
	private IUserService userService;
	private ILogMsgService logMsgService;
	private OtherDao otherDao;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	public ILogMsgService getLogMsgService() {
		return logMsgService;
	}

	public void setLogMsgService(ILogMsgService logMsgService) {
		this.logMsgService = logMsgService;
	}

	public void add() {
		otherDao = SpringUtil.getContext().getBean("otherDao", OtherDao.class);
		
		userService.add(user);
		logMsgService.add(new LogMsg(DateFormat.getDateInstance().format(new Date()), "增加了一个User" + user));
		otherDao.doSomething();
	};
}
