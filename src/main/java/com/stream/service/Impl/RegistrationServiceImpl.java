package com.stream.service.Impl;

import org.springframework.stereotype.Service;

import com.stream.entity.Registration;
import com.stream.service.RegistrationService;

import reactor.core.publisher.Mono;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    

    @Override
    public Mono<Registration> registereUser(Mono<Registration> reg) {
        
        return reg;
    }
    
}
