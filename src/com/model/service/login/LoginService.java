package com.model.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.login.LoginDTO;
import com.dto.registration.RegistrationDTO;
import com.model.dao.login.LoginDAO;

@Service()
public class LoginService 
{
	public LoginService() 
	{
		System.out.println("Login Service Created...");
	}
	
	@Autowired
	private LoginDAO dao;
	
	public RegistrationDTO save(LoginDTO dto)
	{
		if(dto!=null)
		{
			RegistrationDTO rdto = dao.check(dto);
			return rdto;
		}
		else
		{
			System.out.println("Login credentials not provided");
		}
	return null;
	}
}
