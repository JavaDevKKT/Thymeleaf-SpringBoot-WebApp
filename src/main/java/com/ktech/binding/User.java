package com.ktech.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
	@NotBlank(message = "Username is required")
	@Size(min = 6, message = "Username must be at least 6 characters")
	private String name;

	@NotEmpty(message = "Password is required")
	@Size(min = 6, message = "Password must be at least 6 characters")
	private String pass;

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + "]";
	}

	public User() {
		super();
	}

	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
