package com.wei.controller;

import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.wei.model.User;
import com.wei.service.IUserService;
import com.wei.util.ResponseUtil;

@Controller
@SessionAttributes(value="user")
@RequestMapping("/userController")
public class UserController {

	@Resource
	private IUserService iUserService;
	private static final Logger log = Logger.getLogger(UserController.class);// 日志文件
	@RequestMapping("showUsers")
	public String showUser(Model model,Map<String,Object> map){
		List<User> users = iUserService.loadUsers();
		User user = new User();
		user.setName("session测试用户");
		user.setAge(20);
		map.put("user", user);
		model.addAttribute("users",users);
		return "/view/user/userManager";
	}
	
	
	@RequestMapping(value="listUsers",method = RequestMethod.POST)
	public String listUser(HttpServletRequest request,HttpServletResponse response,Map<String,Object> map,Model model,SessionStatus sessionStatus) throws Exception{
		List<User> users = iUserService.loadUsers();
        JSONObject result = new JSONObject();
        JSONArray jsonArray = JSONArray.fromObject(users);
        User userMap = (User)map.get("user");
        System.out.println("userMap:"+userMap.getName());
        userMap.setName("里斯");
        result.put("rows", jsonArray);
        result.put("total", users.size());
        log.info("userController/listUsers");
        ResponseUtil.write(request,response, result);
        //sessionStatus.setComplete();
        model.addAttribute("user", userMap);
        return "/view/user/userManager";
	}

	public IUserService getiUserService() {
		return iUserService;
	}
	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}
	
}
