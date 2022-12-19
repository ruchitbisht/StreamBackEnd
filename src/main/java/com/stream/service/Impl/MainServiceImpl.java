package com.stream.service.Impl;

import org.springframework.stereotype.Service;

import com.stream.entity.User;
import com.stream.service.MainService;

import reactor.core.publisher.Flux;

@Service
public class MainServiceImpl implements MainService{

	@Override
	public Flux<User> save() {
		
		// User user= new User();
//		user.
		
		return null;
	}

}
