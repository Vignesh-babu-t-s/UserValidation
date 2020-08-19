package com.validation.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.user.mapper.Mapper;
import com.validation.user.model.UserModel;

@Service
public class DemoService {
	
	@Autowired
	Mapper mapper;

	public UserModel getdetails(String userId) {
		UserModel userModel=mapper.getUserModel();
		if(userModel.getUserId().equals(userId)) {
			return userModel;
		}
		else
			return null;
			
	}
}
