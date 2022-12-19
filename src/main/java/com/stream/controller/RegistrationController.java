package com.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stream.entity.Registration;
import com.stream.service.RegistrationService;

import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/signUp")
public class RegistrationController{

    @Autowired
    RegistrationService registraionService;

    @PostMapping()
    public Mono<Registration> registereUser(@RequestBody Mono<Registration> reg){

       return registraionService.registereUser(reg);

    }
}