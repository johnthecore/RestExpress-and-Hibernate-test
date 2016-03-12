package db;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import db.table.T1;

public class DAOT1 extends GenericDAO
{
	public List<T1> getAll(Class clazz)
	{
		Session hibernateSession = this.getSession();
		List<T1> items = null;
		
		Query query = hibernateSession.createQuery("from " + clazz.getName());
		items = query.list();
		
		return items;
	}
}
