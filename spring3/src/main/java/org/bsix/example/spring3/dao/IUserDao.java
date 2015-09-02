package org.bsix.example.spring3.dao;

import org.bsix.example.spring3.entity.User;

public interface IUserDao {
	public User load(String id);
	public void add(User user);
	public void delete(String id);
	
}
