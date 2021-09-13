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

public class TiposDAO {
	public static Tipos loadTiposByORMID(int codtipo) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTiposByORMID(session, codtipo);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos getTiposByORMID(int codtipo) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTiposByORMID(session, codtipo);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos loadTiposByORMID(int codtipo, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTiposByORMID(session, codtipo, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos getTiposByORMID(int codtipo, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTiposByORMID(session, codtipo, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos loadTiposByORMID(PersistentSession session, int codtipo) {
		try {
			return (Tipos) session.load(com.example.demo.modelo.Tipos.class, new Integer(codtipo));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos getTiposByORMID(PersistentSession session, int codtipo) {
		try {
			return (Tipos) session.get(com.example.demo.modelo.Tipos.class, new Integer(codtipo));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos loadTiposByORMID(PersistentSession session, int codtipo, org.hibernate.LockMode lockMode) {
		try {
			return (Tipos) session.load(com.example.demo.modelo.Tipos.class, new Integer(codtipo), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos getTiposByORMID(PersistentSession session, int codtipo, org.hibernate.LockMode lockMode) {
		try {
			return (Tipos) session.get(com.example.demo.modelo.Tipos.class, new Integer(codtipo), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipos(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTipos(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipos(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTipos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos[] listTiposByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTiposByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos[] listTiposByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTiposByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipos(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipos as Tipos");
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
	
	public static List queryTipos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipos as Tipos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos[] listTiposByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryTipos(session, condition, orderBy);
			return (Tipos[]) list.toArray(new Tipos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos[] listTiposByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryTipos(session, condition, orderBy, lockMode);
			return (Tipos[]) list.toArray(new Tipos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos loadTiposByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTiposByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos loadTiposByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTiposByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos loadTiposByQuery(PersistentSession session, String condition, String orderBy) {
		Tipos[] tiposes = listTiposByQuery(session, condition, orderBy);
		if (tiposes != null && tiposes.length > 0)
			return tiposes[0];
		else
			return null;
	}
	
	public static Tipos loadTiposByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Tipos[] tiposes = listTiposByQuery(session, condition, orderBy, lockMode);
		if (tiposes != null && tiposes.length > 0)
			return tiposes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTiposByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTiposByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTiposByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTiposByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTiposByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipos as Tipos");
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
	
	public static java.util.Iterator iterateTiposByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipos as Tipos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipos createTipos() {
		return new com.example.demo.modelo.Tipos();
	}
	
	public static boolean save(com.example.demo.modelo.Tipos tipos) {
		try {
			UntitledPersistentManager.instance().saveObject(tipos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Tipos tipos) {
		try {
			UntitledPersistentManager.instance().deleteObject(tipos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Tipos tipos) {
		try {
			com.example.demo.modelo.Tipotext[] lTipotexts = tipos.tipotext.toArray();
			for(int i = 0; i < lTipotexts.length; i++) {
				lTipotexts[i].setCodtipo(null);
			}
			return delete(tipos);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Tipos tipos, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Tipotext[] lTipotexts = tipos.tipotext.toArray();
			for(int i = 0; i < lTipotexts.length; i++) {
				lTipotexts[i].setCodtipo(null);
			}
			try {
				session.delete(tipos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Tipos tipos) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(tipos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Tipos tipos) {
		try {
			UntitledPersistentManager.instance().getSession().evict(tipos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
