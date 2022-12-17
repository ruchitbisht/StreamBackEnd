package com.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stream.entity.User;
import com.stream.service.MainService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("api/main")
public class MainController {

	@Autowired
	MainService mainService;
	
	@GetMapping("/user")
	public Flux<User> getAllUser(){
		
		return mainService.save();
	}
}
