package com.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.login.LoginDTO;
import com.dto.registration.RegistrationDTO;
import com.model.service.login.LoginService;

@Controller()
@RequestMapping("/")
public class LoginController 
{
	public LoginController() 
	{
		System.out.println("Login Controller Created...");
	}
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute LoginDTO dto,HttpServletRequest req)
	{
		if(dto!=null)
		{
			RegistrationDTO rdto = service.save(dto);
			if(rdto!=null)
			{
				HttpSession session=req.getSession();
				session.setAttribute("DTOfrmDB", rdto);
				return new ModelAndView("/Account.jsp","name","Logged in with  "+rdto.getName());
			}
			else
			{
				return new ModelAndView("/Login.jsp","login_error","Invalid Credentials..");
			}
		}
	return null;
	}
}
