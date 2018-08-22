package com.model.dao.update;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.registration.RegistrationDTO;

@Repository
public class UpdateDAO 
{
	public UpdateDAO() 
	{
		System.out.println("Update DAO Created...");
	}
	
	@Autowired
	private SessionFactory factory;
	
	public RegistrationDTO updateDetails(RegistrationDTO dto)
	{
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try
		{
			RegistrationDTO rdto = (RegistrationDTO) session.merge(dto);
			tx.commit();
			return rdto;
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
		return null;
	}
}
