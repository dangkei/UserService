package com.assoft.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assoft.user.entity.User;
import com.assoft.user.service.UserService;

@Controller
public class StaticController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/css")
	public String css() {
		return "css";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/list")
    public String list(HttpServletRequest request,Model model){
        model.addAttribute("user","传值");
        List<User> userList=userService.getUserList();
        model.addAttribute("userList",userList);
        return "list";
        }
}
