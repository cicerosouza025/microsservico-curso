package com.cicero.hroauth.entities;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String roleName;

	public Role() {
	}

	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
}
