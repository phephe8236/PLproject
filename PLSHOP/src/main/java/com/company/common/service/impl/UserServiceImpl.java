package com.company.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.common.dao.UserDao;
import com.company.common.service.UserService;
import com.company.common.vo.UserVo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public void selectUser() {
		userDao.selectUser();
		
	}

	@Override
	public void insertUser(UserVo userVo) {
		userDao.insertUser(userVo);		
	}
	
	

}
