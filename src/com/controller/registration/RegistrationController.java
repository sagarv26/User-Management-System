package com.controller.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.dto.registration.RegistrationDTO;
import com.model.service.registration.RegistrationService;

@Controller()
@RequestMapping("/")
public class RegistrationController 
{
	public RegistrationController() 
	{
		System.out.println("Registration Controller Created...");
	}

	@Autowired
	private RegistrationService service;
	
	@RequestMapping(value="/registration.do",method=RequestMethod.POST)
	public ModelAndView create(RegistrationDTO dto)
	{
		System.out.println(dto);
		service.save(dto);
		return new ModelAndView("/Login.jsp","email","Registration Succesfull with  "+dto.getEmail());
		
	}
}
