package com.stream.service;

import com.stream.entity.User;

import reactor.core.publisher.Flux;

public interface MainService {

	Flux<User> save();

}
