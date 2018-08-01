package com.wei.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.wei.model.User;
import com.wei.service.IUserService;
import com.wei.util.ResponseUtil;

@Controller
@RequestMapping("/userController")
public class UserController {

	@Resource
	private IUserService iUserService;
	private static final Logger log = Logger.getLogger(UserController.class);// 日志文件
	@RequestMapping("showUsers")
	public String showUser(Model model){
		List<User> users = iUserService.loadUsers();
		model.addAttribute("users",users);
		return "/view/user/userManager";
	}
	@RequestMapping(value="listUsers",method = RequestMethod.POST)
	public String listUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		List<User> users = iUserService.loadUsers();
        JSONObject result = new JSONObject();
        JSONArray jsonArray = JSONArray.fromObject(users);
        result.put("rows", jsonArray);
        result.put("total", users.size());
        log.info("userController/listUsers");
        ResponseUtil.write(request,response, result);
        return null;
	}

	public IUserService getiUserService() {
		return iUserService;
	}
	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}
	
}
