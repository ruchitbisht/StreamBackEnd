package com.stream.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class Registration{

    long id;
    String manualId;
    String firstName;
    String lastName;
    String fullName;
    String email;
    String mobileNo;
    String userType;


}