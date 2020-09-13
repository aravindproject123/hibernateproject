package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dto.GameDto;

public class GetSessionObject 
{
	private GetSessionObject() {}
	static private SessionFactory session=null;

	public static SessionFactory getSessionObject() 
	{
		if(session==null) session=new Configuration().configure().addAnnotatedClass(GameDto.class).buildSessionFactory();
		return session;
		
	}

}
