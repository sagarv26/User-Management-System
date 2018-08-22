package com.controller.password;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.model.service.password.PasswordService;

@Controller
@RequestMapping("/")
public class PasswordController 
{
	public PasswordController() 
	{
		System.out.println("Password Controller Created...");
	}
	
	@Autowired
	private PasswordService service;
	
	@RequestMapping(value="/reset.do",method=RequestMethod.POST)
	public ModelAndView resetPassword(@RequestParam String email)
	{
		String name = service.resetPasswordService(email);
		if(name!=null)
		{
			service.resetPasswordService(email);
			return new ModelAndView("redirect:random.do?email="+email);
		}
		else
		{
			return new ModelAndView("/ResetPassword.jsp","not_reg","Please Register, Email not found..");
		}
	}
	
	@RequestMapping(value="/random.do",method=RequestMethod.GET)
	public ModelAndView randomPassword(@RequestParam String email)
	{
		String res = service.randomPasswordService(email);;
		if(res!=null)
		{
			return new ModelAndView("/ResetPassword.jsp","reset_success","Password reset success..\n"
					+ "\nCheck your mail for a new password");	
		}
		else
		{
			return new ModelAndView("/ResetPassword.jsp","not_reg","Please Register, Email not found..");
		}
	}
}
