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

public class AutoresDAO {
	public static Autores loadAutoresByORMID(int coda) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAutoresByORMID(session, coda);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores getAutoresByORMID(int coda) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getAutoresByORMID(session, coda);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores loadAutoresByORMID(int coda, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAutoresByORMID(session, coda, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores getAutoresByORMID(int coda, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getAutoresByORMID(session, coda, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores loadAutoresByORMID(PersistentSession session, int coda) {
		try {
			return (Autores) session.load(com.example.demo.modelo.Autores.class, new Integer(coda));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores getAutoresByORMID(PersistentSession session, int coda) {
		try {
			return (Autores) session.get(com.example.demo.modelo.Autores.class, new Integer(coda));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores loadAutoresByORMID(PersistentSession session, int coda, org.hibernate.LockMode lockMode) {
		try {
			return (Autores) session.load(com.example.demo.modelo.Autores.class, new Integer(coda), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores getAutoresByORMID(PersistentSession session, int coda, org.hibernate.LockMode lockMode) {
		try {
			return (Autores) session.get(com.example.demo.modelo.Autores.class, new Integer(coda), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAutores(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryAutores(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAutores(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryAutores(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores[] listAutoresByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listAutoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores[] listAutoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listAutoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAutores(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Autores as Autores");
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
	
	public static List queryAutores(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Autores as Autores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autores", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores[] listAutoresByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryAutores(session, condition, orderBy);
			return (Autores[]) list.toArray(new Autores[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores[] listAutoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryAutores(session, condition, orderBy, lockMode);
			return (Autores[]) list.toArray(new Autores[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores loadAutoresByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAutoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores loadAutoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadAutoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores loadAutoresByQuery(PersistentSession session, String condition, String orderBy) {
		Autores[] autoreses = listAutoresByQuery(session, condition, orderBy);
		if (autoreses != null && autoreses.length > 0)
			return autoreses[0];
		else
			return null;
	}
	
	public static Autores loadAutoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Autores[] autoreses = listAutoresByQuery(session, condition, orderBy, lockMode);
		if (autoreses != null && autoreses.length > 0)
			return autoreses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAutoresByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateAutoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAutoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateAutoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAutoresByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Autores as Autores");
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
	
	public static java.util.Iterator iterateAutoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Autores as Autores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autores", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Autores createAutores() {
		return new com.example.demo.modelo.Autores();
	}
	
	public static boolean save(com.example.demo.modelo.Autores autores) {
		try {
			UntitledPersistentManager.instance().saveObject(autores);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Autores autores) {
		try {
			UntitledPersistentManager.instance().deleteObject(autores);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Autores autores) {
		try {
			com.example.demo.modelo.Textos[] lCodts = autores.codt.toArray();
			for(int i = 0; i < lCodts.length; i++) {
				lCodts[i].coda.remove(autores);
			}
			return delete(autores);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Autores autores, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Textos[] lCodts = autores.codt.toArray();
			for(int i = 0; i < lCodts.length; i++) {
				lCodts[i].coda.remove(autores);
			}
			try {
				session.delete(autores);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Autores autores) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(autores);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Autores autores) {
		try {
			UntitledPersistentManager.instance().getSession().evict(autores);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
