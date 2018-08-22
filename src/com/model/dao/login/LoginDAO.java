package com.model.dao.login;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.login.LoginDTO;
import com.dto.registration.RegistrationDTO;

@Repository()
public class LoginDAO 
{
	public LoginDAO() 
	{
		System.out.println("Login DAO Cretaed...");
	}

	@Autowired
	private SessionFactory factory;
	
	public RegistrationDTO check(LoginDTO dto)
	{
		Session session = factory.openSession();
		String syntax = "select p from RegistrationDTO p where p.email=:em and p.password=:pwd";
		try
		{
			Query query = session.createQuery(syntax);
			query.setParameter("em", dto.getEmail());
			query.setParameter("pwd", dto.getPassword());
			RegistrationDTO rdto = (RegistrationDTO) query.uniqueResult();
			if(rdto!=null)
			{
				return rdto;
			}
			else
			{
				return null;
			}
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return null;
	}
}
