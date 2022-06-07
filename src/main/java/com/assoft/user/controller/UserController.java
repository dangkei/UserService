package com.assoft.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assoft.user.entity.DataTable;
import com.assoft.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("getUser/{id}")
	public String getUser(@PathVariable int id) {
		return userService.Sel(id).toString();
	}
	

	@RequestMapping("/getUserList")
	public DataTable getUserList(@RequestParam int page,@RequestParam int limit){
		DataTable table = new DataTable();
		table.setCode(0);
		table.setData(userService.getUserList().toArray());		
		return table;
	}
	
	@RequestMapping("/getUserListByPage")
	public DataTable getUserByPage(@RequestParam int page,@RequestParam int limit){
		return userService.getUserListByPage(page, limit);
		
	}
}
