package org.bsix.example.spring3.service;

import org.bsix.example.spring3.dao.IUserDao;
import org.bsix.example.spring3.entity.User;

public class UserService implements IUserService {
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User load(String id) {
		return userDao.load(id);
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void delete(String id) {
		userDao.delete(id);
	}

}
