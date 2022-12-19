package com.stream.service;

import com.stream.entity.Registration;

import reactor.core.publisher.Mono;

public interface RegistrationService {
    
    public Mono<Registration> registereUser(Mono<Registration> reg);
}
