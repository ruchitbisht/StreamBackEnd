package com.stream.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class User {
	
	private long id;
	private String name;
	private String email;
	private long mobile;

}
