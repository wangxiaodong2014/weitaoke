package com.wei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wei.model.User;
import com.wei.service.IUserService;

@Controller
@RequestMapping("/userController")
public class UserController {

	
	private IUserService iUserService;

	@RequestMapping("showUsers")
	public String showUser(Model model){
		List<User> users = iUserService.loadUsers();
		model.addAttribute(users);
		return "showUsers";
	}
	
	
	
	public IUserService getiUserService() {
		return iUserService;
	}
	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}
	
}
