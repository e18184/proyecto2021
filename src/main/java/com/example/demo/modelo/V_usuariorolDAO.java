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

public class V_usuariorolDAO {
	public static V_usuariorol loadV_usuariorolByORMID(Long id) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadV_usuariorolByORMID(session, id);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol getV_usuariorolByORMID(Long id) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getV_usuariorolByORMID(session, id);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol loadV_usuariorolByORMID(Long id, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadV_usuariorolByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol getV_usuariorolByORMID(Long id, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getV_usuariorolByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol loadV_usuariorolByORMID(PersistentSession session, Long id) {
		try {
			return (V_usuariorol) session.load(com.example.demo.modelo.V_usuariorol.class, id);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol getV_usuariorolByORMID(PersistentSession session, Long id) {
		try {
			return (V_usuariorol) session.get(com.example.demo.modelo.V_usuariorol.class, id);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol loadV_usuariorolByORMID(PersistentSession session, Long id, org.hibernate.LockMode lockMode) {
		try {
			return (V_usuariorol) session.load(com.example.demo.modelo.V_usuariorol.class, id, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol getV_usuariorolByORMID(PersistentSession session, Long id, org.hibernate.LockMode lockMode) {
		try {
			return (V_usuariorol) session.get(com.example.demo.modelo.V_usuariorol.class, id, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryV_usuariorol(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryV_usuariorol(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryV_usuariorol(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryV_usuariorol(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol[] listV_usuariorolByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listV_usuariorolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol[] listV_usuariorolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listV_usuariorolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryV_usuariorol(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.V_usuariorol as V_usuariorol");
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
	
	public static List queryV_usuariorol(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.V_usuariorol as V_usuariorol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_usuariorol", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol[] listV_usuariorolByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryV_usuariorol(session, condition, orderBy);
			return (V_usuariorol[]) list.toArray(new V_usuariorol[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol[] listV_usuariorolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryV_usuariorol(session, condition, orderBy, lockMode);
			return (V_usuariorol[]) list.toArray(new V_usuariorol[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol loadV_usuariorolByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadV_usuariorolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol loadV_usuariorolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadV_usuariorolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static V_usuariorol loadV_usuariorolByQuery(PersistentSession session, String condition, String orderBy) {
		V_usuariorol[] v_usuariorols = listV_usuariorolByQuery(session, condition, orderBy);
		if (v_usuariorols != null && v_usuariorols.length > 0)
			return v_usuariorols[0];
		else
			return null;
	}
	
	public static V_usuariorol loadV_usuariorolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		V_usuariorol[] v_usuariorols = listV_usuariorolByQuery(session, condition, orderBy, lockMode);
		if (v_usuariorols != null && v_usuariorols.length > 0)
			return v_usuariorols[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateV_usuariorolByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateV_usuariorolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateV_usuariorolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateV_usuariorolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateV_usuariorolByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.V_usuariorol as V_usuariorol");
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
	
	public static java.util.Iterator iterateV_usuariorolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.V_usuariorol as V_usuariorol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("V_usuariorol", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.V_usuariorol v_usuariorol) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(v_usuariorol);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.V_usuariorol v_usuariorol) {
		try {
			UntitledPersistentManager.instance().getSession().evict(v_usuariorol);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
