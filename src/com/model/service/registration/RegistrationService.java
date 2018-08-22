package com.model.service.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.dao.registration.RegistrationDAO;
import com.dto.registration.RegistrationDTO;

@Service()
public class RegistrationService 
{
	public RegistrationService() 
	{
		System.out.println("Registration Service Created...");
	}
	
	@Autowired
	private RegistrationDAO dao;
	
	public void save(RegistrationDTO dto)
	{
		if(dto!=null)
		{
			dao.create(dto);
		}
		else
		{
			System.out.println("Registration Unsuccessful");
		}
	}
}
