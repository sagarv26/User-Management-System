package com.model.service.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.registration.RegistrationDTO;
import com.model.dao.update.UpdateDAO;

@Service
public class UpdateService 
{
	public UpdateService() 
	{
		System.out.println("Update Service Created...");
	}

	@Autowired
	private UpdateDAO dao;
	
	public RegistrationDTO updateService(RegistrationDTO dto)
	{
		RegistrationDTO rdto = dao.updateDetails(dto);
		return rdto;
	}
	
}
