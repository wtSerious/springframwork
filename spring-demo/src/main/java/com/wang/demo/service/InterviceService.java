package com.wang.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InterviceService {
	@Autowired
	private UserService userService;

	public InterviceService(){
		System.out.println("construct Interservice");
	}
}
