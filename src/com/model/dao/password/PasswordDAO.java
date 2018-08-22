package com.model.dao.password;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PasswordDAO 
{
	public PasswordDAO() 
	{
		System.out.println("Password DAO Created...");
	}
	
	@Autowired
	private SessionFactory factory;
	
	public String check(String email)
	{
		Session session = factory.openSession();
		String syntax = "select p.name from RegistrationDTO p where p.email=:em";
		try
		{
			Query query = session.createQuery(syntax);
			query.setParameter("em",email);
			String name = (String) query.uniqueResult();
			return name;
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
	
	public int randomPasswordDAO(String email, String pwd)
	{
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
			String syntax = "update RegistrationDTO r set r.password=:pwd,r.confirmPassword=:cpwd where r.email=:em";
			Query query = session.createQuery(syntax);
			query.setParameter("em",email);
			query.setParameter("pwd", pwd);
			query.setParameter("cpwd", pwd);
			int i = query.executeUpdate();
			tx.commit();
			return i;
		}
		catch(HibernateException he)
		{
			tx.rollback();
			he.printStackTrace();
			
		}
		finally
		{
			session.close();
		}
		return 0;
	}
}
