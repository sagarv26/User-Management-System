package com.model.dao.registration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.registration.RegistrationDTO;

@Repository()
public class RegistrationDAO 
{
	public RegistrationDAO() 
	{
		System.out.println("Registartion DAO Created...");
	}
	
	@Autowired
	private SessionFactory factory;
	
	public void create(RegistrationDTO dto)
	{
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try
		{
			session.save(dto);
			tx.commit();
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			tx.rollback();
		}
		finally
		{
			session.close();
		}
	} 

}
