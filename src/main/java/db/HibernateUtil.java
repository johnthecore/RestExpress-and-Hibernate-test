package db;

import org.hibernate.Session;
// import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil
{
	private static final SessionFactory sessionFactory;
	
	static {
		try
		{
			// Create the SessionFactory from standard (hibernate.cfg.xml)
			// config file.
			// sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			
			// Create configuration instance
			Configuration configuration = new Configuration();
			
			// Pass hibernate configuration file
			configuration.configure("hibernate.cfg.xml");
			
			// Since version 4.x, service registry is being used
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties()).build();

			// Create session factory instance
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		catch (Throwable e)
		{
			// Log the exception.
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public static Session beginTransaction()
	{
		Session hibernateSession = HibernateUtil.getSession();
		hibernateSession.beginTransaction();
		return hibernateSession;
	}
	
	public static void commitTransaction()
	{
		HibernateUtil.getSession().getTransaction().commit();
	}
	
	public static void rollbackTransaction()
	{
		HibernateUtil.getSession().getTransaction().rollback();
	}
	
	public static void closeSession()
	{
		HibernateUtil.getSession().close();
	}
	
	public static Session getSession()
	{
		Session hibernateSession = null;
		try {         
			hibernateSession = sessionFactory.getCurrentSession();  
		}
		catch (org.hibernate.HibernateException e)
		{  
			hibernateSession = sessionFactory.openSession();
		}
		return hibernateSession;
	}
}