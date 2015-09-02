package org.bsix.example.spring3.dao;

import org.bsix.example.spring3.entity.User;

public class UserDao implements IUserDao {

	@Override
	public User load(String id) {
		return null;
	}

	@Override
	public void add(User user) {
		System.out.println("增加了User:" + user);
	}

	@Override
	public void delete(String id) {
		System.out.println("删除了User:" + id);
	}

}
