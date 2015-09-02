package org.bsix.example.spring3.service;

import org.bsix.example.spring3.entity.User;

public interface IUserService {
	public User load(String id);
	public void add(User user);
	public void delete(String id);
}
