package db;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import db.table.T2;

public class DAOT2 extends GenericDAO
{
	public List<T2> getAll(Class clazz)
	{
		Session hibernateSession = this.getSession();
		List<T2> items = null;
		
		Query query = hibernateSession.createQuery("from " + clazz.getName());
		items = query.list();
		
		return items;
	}
}
