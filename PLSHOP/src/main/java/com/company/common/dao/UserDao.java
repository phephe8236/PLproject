package com.company.common.dao;

import org.springframework.stereotype.Repository;

import com.company.common.vo.UserVo;

@Repository
public class UserDao extends AbstractDAO{

	public void selectUser() {

		selectList("selectUser");
		
	}

	public void insertUser(UserVo userVo) {
		insert("insertUser", userVo);
		
	}

}
