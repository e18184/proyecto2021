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

public class DprestamoDAO {
	public static Dprestamo loadDprestamoByORMID(com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDprestamoByORMID(session, codp, codinv);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo getDprestamoByORMID(com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getDprestamoByORMID(session, codp, codinv);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo loadDprestamoByORMID(com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDprestamoByORMID(session, codp, codinv, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo getDprestamoByORMID(com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getDprestamoByORMID(session, codp, codinv, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo loadDprestamoByORMID(PersistentSession session, com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv) {
		try {
			DprestamoPK dprestamo = new com.example.demo.modelo.DprestamoPK();
			dprestamo.setCodp(codp);
			dprestamo.setCodinv(codinv);
			
			return (Dprestamo) session.load(com.example.demo.modelo.Dprestamo.class, dprestamo);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo getDprestamoByORMID(PersistentSession session, com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv) {
		try {
			DprestamoPK dprestamo = new com.example.demo.modelo.DprestamoPK();
			dprestamo.setCodp(codp);
			dprestamo.setCodinv(codinv);
			
			return (Dprestamo) session.get(com.example.demo.modelo.Dprestamo.class, dprestamo);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo loadDprestamoByORMID(PersistentSession session, com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv, org.hibernate.LockMode lockMode) {
		try {
			DprestamoPK dprestamo = new com.example.demo.modelo.DprestamoPK();
			dprestamo.setCodp(codp);
			dprestamo.setCodinv(codinv);
			
			return (Dprestamo) session.load(com.example.demo.modelo.Dprestamo.class, dprestamo, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo getDprestamoByORMID(PersistentSession session, com.example.demo.modelo.Mprestamo codp, com.example.demo.modelo.Ejemplares codinv, org.hibernate.LockMode lockMode) {
		try {
			DprestamoPK dprestamo = new com.example.demo.modelo.DprestamoPK();
			dprestamo.setCodp(codp);
			dprestamo.setCodinv(codinv);
			
			return (Dprestamo) session.get(com.example.demo.modelo.Dprestamo.class, dprestamo, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDprestamo(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryDprestamo(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDprestamo(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryDprestamo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo[] listDprestamoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listDprestamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo[] listDprestamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listDprestamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDprestamo(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Dprestamo as Dprestamo");
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
	
	public static List queryDprestamo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Dprestamo as Dprestamo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dprestamo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo[] listDprestamoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryDprestamo(session, condition, orderBy);
			return (Dprestamo[]) list.toArray(new Dprestamo[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo[] listDprestamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryDprestamo(session, condition, orderBy, lockMode);
			return (Dprestamo[]) list.toArray(new Dprestamo[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo loadDprestamoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDprestamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo loadDprestamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDprestamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo loadDprestamoByQuery(PersistentSession session, String condition, String orderBy) {
		Dprestamo[] dprestamos = listDprestamoByQuery(session, condition, orderBy);
		if (dprestamos != null && dprestamos.length > 0)
			return dprestamos[0];
		else
			return null;
	}
	
	public static Dprestamo loadDprestamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Dprestamo[] dprestamos = listDprestamoByQuery(session, condition, orderBy, lockMode);
		if (dprestamos != null && dprestamos.length > 0)
			return dprestamos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDprestamoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateDprestamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDprestamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateDprestamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDprestamoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Dprestamo as Dprestamo");
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
	
	public static java.util.Iterator iterateDprestamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Dprestamo as Dprestamo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dprestamo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Dprestamo createDprestamo() {
		return new com.example.demo.modelo.Dprestamo();
	}
	
	public static boolean save(com.example.demo.modelo.Dprestamo dprestamo) {
		try {
			UntitledPersistentManager.instance().saveObject(dprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Dprestamo dprestamo) {
		try {
			UntitledPersistentManager.instance().deleteObject(dprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Dprestamo dprestamo) {
		try {
			com.example.demo.modelo.Mprestamo codp = dprestamo.getCodp();
			if (dprestamo.getCodp() != null) {
				dprestamo.getCodp().dprestamo.remove(dprestamo);
			}
			dprestamo.setORM_Codp(codp);
			
			com.example.demo.modelo.Ejemplares codinv = dprestamo.getCodinv();
			if (dprestamo.getCodinv() != null) {
				dprestamo.getCodinv().dprestamo.remove(dprestamo);
			}
			dprestamo.setORM_Codinv(codinv);
			
			return delete(dprestamo);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Dprestamo dprestamo, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Mprestamo codp = dprestamo.getCodp();
			if (dprestamo.getCodp() != null) {
				dprestamo.getCodp().dprestamo.remove(dprestamo);
			}
			dprestamo.setORM_Codp(codp);
			
			com.example.demo.modelo.Ejemplares codinv = dprestamo.getCodinv();
			if (dprestamo.getCodinv() != null) {
				dprestamo.getCodinv().dprestamo.remove(dprestamo);
			}
			dprestamo.setORM_Codinv(codinv);
			
			try {
				session.delete(dprestamo);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Dprestamo dprestamo) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(dprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Dprestamo dprestamo) {
		try {
			UntitledPersistentManager.instance().getSession().evict(dprestamo);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
