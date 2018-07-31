package com.wei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wei.dao.UserMapper;
import com.wei.model.User;
import com.wei.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	private UserMapper userMapper;
	
	public List<User> loadUsers() {
		
		return userMapper.queryAll();
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	
	
	
}
