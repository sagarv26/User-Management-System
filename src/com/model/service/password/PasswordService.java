package com.model.service.password;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.model.dao.password.PasswordDAO;

@Service
public class PasswordService 
{
	public PasswordService() 
	{
		System.out.println("Password Service Created...");
	}

	@Autowired
	private PasswordDAO dao;
	
	@Autowired
	JavaMailSenderImpl sender;
	
	public String resetPasswordService(String email)
	{
		String name = dao.check(email);
		return name;
	}
	
	public String randomPasswordService(String email)
	{
		//creating random password
		String characters = "0123456789";
		String pwd = RandomStringUtils.random(6, characters );
		System.out.println( pwd );
		
		int i = dao.randomPasswordDAO(email,pwd);
		if(i!=0)
		{
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(email);
			msg.setSubject("Password Reset");
			msg.setText("Your passord has been reset. You can login with your new password\n"
					+ "Your new password is : "+ pwd);
			sender.send(msg);
			return pwd;
		}
		else
		{
			return null;
		}
	}
}

