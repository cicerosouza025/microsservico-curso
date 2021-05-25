package com.cicero.hroauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	private String email;
	private String password;

	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(Long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
