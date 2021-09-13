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

public class MprestamoDAO {
	public static Mprestamo loadMprestamoByORMID(int codp) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMprestamoByORMID(session, codp);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo getMprestamoByORMID(int codp) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getMprestamoByORMID(session, codp);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo loadMprestamoByORMID(int codp, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMprestamoByORMID(session, codp, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo getMprestamoByORMID(int codp, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getMprestamoByORMID(session, codp, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo loadMprestamoByORMID(PersistentSession session, int codp) {
		try {
			return (Mprestamo) session.load(com.example.demo.modelo.Mprestamo.class, new Integer(codp));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo getMprestamoByORMID(PersistentSession session, int codp) {
		try {
			return (Mprestamo) session.get(com.example.demo.modelo.Mprestamo.class, new Integer(codp));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo loadMprestamoByORMID(PersistentSession session, int codp, org.hibernate.LockMode lockMode) {
		try {
			return (Mprestamo) session.load(com.example.demo.modelo.Mprestamo.class, new Integer(codp), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo getMprestamoByORMID(PersistentSession session, int codp, org.hibernate.LockMode lockMode) {
		try {
			return (Mprestamo) session.get(com.example.demo.modelo.Mprestamo.class, new Integer(codp), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMprestamo(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryMprestamo(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMprestamo(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryMprestamo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo[] listMprestamoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listMprestamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo[] listMprestamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listMprestamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMprestamo(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mprestamo as Mprestamo");
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
	
	public static List queryMprestamo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mprestamo as Mprestamo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mprestamo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo[] listMprestamoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryMprestamo(session, condition, orderBy);
			return (Mprestamo[]) list.toArray(new Mprestamo[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo[] listMprestamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryMprestamo(session, condition, orderBy, lockMode);
			return (Mprestamo[]) list.toArray(new Mprestamo[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo loadMprestamoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMprestamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo loadMprestamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMprestamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo loadMprestamoByQuery(PersistentSession session, String condition, String orderBy) {
		Mprestamo[] mprestamos = listMprestamoByQuery(session, condition, orderBy);
		if (mprestamos != null && mprestamos.length > 0)
			return mprestamos[0];
		else
			return null;
	}
	
	public static Mprestamo loadMprestamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Mprestamo[] mprestamos = listMprestamoByQuery(session, condition, orderBy, lockMode);
		if (mprestamos != null && mprestamos.length > 0)
			return mprestamos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMprestamoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateMprestamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateMprestamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateMprestamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateMprestamoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mprestamo as Mprestamo");
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
	
	public static java.util.Iterator iterateMprestamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mprestamo as Mprestamo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mprestamo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mprestamo createMprestamo() {
		return new com.example.demo.modelo.Mprestamo();
	}
	
	public static boolean save(com.example.demo.modelo.Mprestamo mprestamo) {
		try {
			UntitledPersistentManager.instance().saveObject(mprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Mprestamo mprestamo) {
		try {
			UntitledPersistentManager.instance().deleteObject(mprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Mprestamo mprestamo) {
		try {
			if (mprestamo.getCi() != null) {
				mprestamo.getCi().mprestamo.remove(mprestamo);
			}
			
			if (mprestamo.getLogin() != null) {
				mprestamo.getLogin().mprestamo.remove(mprestamo);
			}
			
			com.example.demo.modelo.Dprestamo[] lDprestamos = mprestamo.dprestamo.toArray();
			for(int i = 0; i < lDprestamos.length; i++) {
				lDprestamos[i].setCodp(null);
			}
			com.example.demo.modelo.Mdevol[] lMdevols = mprestamo.mdevol.toArray();
			for(int i = 0; i < lMdevols.length; i++) {
				lMdevols[i].setCodp(null);
			}
			return delete(mprestamo);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Mprestamo mprestamo, org.orm.PersistentSession session) {
		try {
			if (mprestamo.getCi() != null) {
				mprestamo.getCi().mprestamo.remove(mprestamo);
			}
			
			if (mprestamo.getLogin() != null) {
				mprestamo.getLogin().mprestamo.remove(mprestamo);
			}
			
			com.example.demo.modelo.Dprestamo[] lDprestamos = mprestamo.dprestamo.toArray();
			for(int i = 0; i < lDprestamos.length; i++) {
				lDprestamos[i].setCodp(null);
			}
			com.example.demo.modelo.Mdevol[] lMdevols = mprestamo.mdevol.toArray();
			for(int i = 0; i < lMdevols.length; i++) {
				lMdevols[i].setCodp(null);
			}
			try {
				session.delete(mprestamo);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Mprestamo mprestamo) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(mprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Mprestamo mprestamo) {
		try {
			UntitledPersistentManager.instance().getSession().evict(mprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
