package db;

import org.hibernate.Session;

public abstract class GenericDAO
{
	protected Session getSession()
	{
		return HibernateUtil.getSession();
	}
}
