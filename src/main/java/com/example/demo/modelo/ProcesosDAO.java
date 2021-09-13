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

public class ProcesosDAO {
	public static Procesos loadProcesosByORMID(int codp) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadProcesosByORMID(session, codp);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos getProcesosByORMID(int codp) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getProcesosByORMID(session, codp);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos loadProcesosByORMID(int codp, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadProcesosByORMID(session, codp, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos getProcesosByORMID(int codp, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getProcesosByORMID(session, codp, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos loadProcesosByORMID(PersistentSession session, int codp) {
		try {
			return (Procesos) session.load(com.example.demo.modelo.Procesos.class, new Integer(codp));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos getProcesosByORMID(PersistentSession session, int codp) {
		try {
			return (Procesos) session.get(com.example.demo.modelo.Procesos.class, new Integer(codp));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos loadProcesosByORMID(PersistentSession session, int codp, org.hibernate.LockMode lockMode) {
		try {
			return (Procesos) session.load(com.example.demo.modelo.Procesos.class, new Integer(codp), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos getProcesosByORMID(PersistentSession session, int codp, org.hibernate.LockMode lockMode) {
		try {
			return (Procesos) session.get(com.example.demo.modelo.Procesos.class, new Integer(codp), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryProcesos(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryProcesos(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryProcesos(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryProcesos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos[] listProcesosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listProcesosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos[] listProcesosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listProcesosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryProcesos(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Procesos as Procesos");
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
	
	public static List queryProcesos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Procesos as Procesos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Procesos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos[] listProcesosByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryProcesos(session, condition, orderBy);
			return (Procesos[]) list.toArray(new Procesos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos[] listProcesosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryProcesos(session, condition, orderBy, lockMode);
			return (Procesos[]) list.toArray(new Procesos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos loadProcesosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadProcesosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos loadProcesosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadProcesosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos loadProcesosByQuery(PersistentSession session, String condition, String orderBy) {
		Procesos[] procesoses = listProcesosByQuery(session, condition, orderBy);
		if (procesoses != null && procesoses.length > 0)
			return procesoses[0];
		else
			return null;
	}
	
	public static Procesos loadProcesosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Procesos[] procesoses = listProcesosByQuery(session, condition, orderBy, lockMode);
		if (procesoses != null && procesoses.length > 0)
			return procesoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProcesosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateProcesosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateProcesosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateProcesosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateProcesosByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Procesos as Procesos");
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
	
	public static java.util.Iterator iterateProcesosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Procesos as Procesos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Procesos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Procesos createProcesos() {
		return new com.example.demo.modelo.Procesos();
	}
	
	public static boolean save(com.example.demo.modelo.Procesos procesos) {
		try {
			UntitledPersistentManager.instance().saveObject(procesos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Procesos procesos) {
		try {
			UntitledPersistentManager.instance().deleteObject(procesos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Procesos procesos) {
		try {
			com.example.demo.modelo.Menus[] lCodms = procesos.codm.toArray();
			for(int i = 0; i < lCodms.length; i++) {
				lCodms[i].codp.remove(procesos);
			}
			return delete(procesos);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Procesos procesos, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Menus[] lCodms = procesos.codm.toArray();
			for(int i = 0; i < lCodms.length; i++) {
				lCodms[i].codp.remove(procesos);
			}
			try {
				session.delete(procesos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Procesos procesos) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(procesos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Procesos procesos) {
		try {
			UntitledPersistentManager.instance().getSession().evict(procesos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
