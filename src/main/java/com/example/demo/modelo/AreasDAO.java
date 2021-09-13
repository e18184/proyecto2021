/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.example.demo.modelo;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AreasDAO {
	public static Areas loadAreasByORMID(int coda) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAreasByORMID(session, coda);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas getAreasByORMID(int coda) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getAreasByORMID(session, coda);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas loadAreasByORMID(int coda, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAreasByORMID(session, coda, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas getAreasByORMID(int coda, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getAreasByORMID(session, coda, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas loadAreasByORMID(PersistentSession session, int coda) {
		try {
			return (Areas) session.load(com.example.demo.modelo.Areas.class, new Integer(coda));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas getAreasByORMID(PersistentSession session, int coda) {
		try {
			return (Areas) session.get(com.example.demo.modelo.Areas.class, new Integer(coda));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas loadAreasByORMID(PersistentSession session, int coda, org.hibernate.LockMode lockMode) {
		try {
			return (Areas) session.load(com.example.demo.modelo.Areas.class, new Integer(coda), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas getAreasByORMID(PersistentSession session, int coda, org.hibernate.LockMode lockMode) {
		try {
			return (Areas) session.get(com.example.demo.modelo.Areas.class, new Integer(coda), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAreas(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryAreas(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAreas(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryAreas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas[] listAreasByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listAreasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas[] listAreasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listAreasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAreas(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Areas as Areas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAreas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Areas as Areas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Areas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas[] listAreasByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryAreas(session, condition, orderBy);
			return (Areas[]) list.toArray(new Areas[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas[] listAreasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryAreas(session, condition, orderBy, lockMode);
			return (Areas[]) list.toArray(new Areas[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas loadAreasByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAreasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas loadAreasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAreasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas loadAreasByQuery(PersistentSession session, String condition, String orderBy) {
		Areas[] areases = listAreasByQuery(session, condition, orderBy);
		if (areases != null && areases.length > 0)
			return areases[0];
		else
			return null;
	}
	
	public static Areas loadAreasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Areas[] areases = listAreasByQuery(session, condition, orderBy, lockMode);
		if (areases != null && areases.length > 0)
			return areases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAreasByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateAreasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAreasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateAreasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAreasByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Areas as Areas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAreasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Areas as Areas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Areas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Areas createAreas() {
		return new com.example.demo.modelo.Areas();
	}
	
	public static boolean save(com.example.demo.modelo.Areas areas) {
		try {
			UntitledPersistentManager.instance().saveObject(areas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Areas areas) {
		try {
			UntitledPersistentManager.instance().deleteObject(areas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Areas areas) {
		try {
			com.example.demo.modelo.Textos[] lTextoss = areas.textos.toArray();
			for(int i = 0; i < lTextoss.length; i++) {
				lTextoss[i].setCoda1(null);
			}
			return delete(areas);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Areas areas, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Textos[] lTextoss = areas.textos.toArray();
			for(int i = 0; i < lTextoss.length; i++) {
				lTextoss[i].setCoda1(null);
			}
			try {
				session.delete(areas);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Areas areas) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(areas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Areas areas) {
		try {
			UntitledPersistentManager.instance().getSession().evict(areas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
