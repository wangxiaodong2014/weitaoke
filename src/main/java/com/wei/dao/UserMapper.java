package com.wei.dao;

import java.util.List;

import com.wei.model.User;

public interface UserMapper {

	public void insert(User user);
	
	public List<User> queryAll();
}
