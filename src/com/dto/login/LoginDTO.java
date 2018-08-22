package com.dto.login;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginDTO implements Serializable
{
	
	public LoginDTO() 
	{
		System.out.println("Login DTO Created...");
	}
	
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", password=" + password + "]";
	}
}
