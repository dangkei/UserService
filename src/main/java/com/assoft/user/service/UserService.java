package com.assoft.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assoft.user.entity.DataTable;
import com.assoft.user.entity.User;
import com.assoft.user.mapper.UserMapper;
import com.github.pagehelper.PageHelper;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
    public User Sel(int id){
        return userMapper.Sel(id);
    }

    public List<User> getUserList(){
        return userMapper.getUserList();
    }
    
    public DataTable getUserListByPage(int page,int limit){
    	DataTable dataTable = new DataTable();
    	//PageHelper.startPage(page,limit);
    	List<User>  users = userMapper.getUserListByPage(page,limit);
    	dataTable.setCount(userMapper.count(null));
    	dataTable.setData(users.toArray());
        return dataTable;
    }
    
}
