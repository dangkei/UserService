package com.assoft.user.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.assoft.user.entity.User;

@Repository
public interface UserMapper {


    User Sel(int id);
    
    int count(User user);
    
    List<User>  getUserList();
    
    List<User>  getUserListByPage(int page, int limit);

}
