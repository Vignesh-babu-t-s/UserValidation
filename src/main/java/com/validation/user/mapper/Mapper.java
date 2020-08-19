package com.validation.user.mapper;

import org.springframework.stereotype.Component;

import com.validation.user.model.UserModel;

@Component
public class Mapper {

	public UserModel getUserModel() {
		UserModel userModel=new UserModel();
		userModel.setSalary("10000");
		userModel.setUserId("1");
		userModel.setUserName("Vignesh");
		return userModel;
	}
}
