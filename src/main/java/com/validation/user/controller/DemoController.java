package com.validation.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.user.model.UserModel;
import com.validation.user.service.DemoService;
import com.validation.user.util.ApplicationUtil;

import org.springframework.security.oauth2.jwt.JwtDecoder;

@RestController
@RequestMapping("/UserDetails")
public class DemoController {

	@Autowired
	private JwtDecoder jwtDecoder;
	
	@Autowired
	private DemoService demoService;
	
	@GetMapping
	public ResponseEntity<UserModel> getData(@RequestHeader(value="Authorization") String header) {
		String userId=ApplicationUtil.extractUserId(jwtDecoder,header);
		return new ResponseEntity<>(demoService.getdetails(userId),HttpStatus.OK);
	}
}
