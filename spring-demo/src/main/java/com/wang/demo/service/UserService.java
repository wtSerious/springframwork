package com.wang.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	private InterviceService interviceService;

	public UserService(){
		System.out.println("construct UserService");
	}
}
