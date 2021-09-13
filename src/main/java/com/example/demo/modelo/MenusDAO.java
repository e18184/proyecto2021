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

public class MenusDAO {
	public static Menus loadMenusByORMID(int codm) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMenusByORMID(session, codm);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus getMenusByORMID(int codm) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getMenusByORMID(session, codm);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus loadMenusByORMID(int codm, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMenusByORMID(session, codm, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus getMenusByORMID(int codm, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getMenusByORMID(session, codm, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus loadMenusByORMID(PersistentSession session, int codm) {
		try {
			return (Menus) session.load(com.example.demo.modelo.Menus.class, new Integer(codm));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus getMenusByORMID(PersistentSession session, int codm) {
		try {
			return (Menus) session.get(com.example.demo.modelo.Menus.class, new Integer(codm));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus loadMenusByORMID(PersistentSession session, int codm, org.hibernate.LockMode lockMode) {
		try {
			return (Menus) session.load(com.example.demo.modelo.Menus.class, new Integer(codm), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus getMenusByORMID(PersistentSession session, int codm, org.hibernate.LockMode lockMode) {
		try {
			return (Menus) session.get(com.example.demo.modelo.Menus.class, new Integer(codm), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMenus(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryMenus(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMenus(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryMenus(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus[] listMenusByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listMenusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus[] listMenusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listMenusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMenus(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Menus as Menus");
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
	
	public static List queryMenus(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Menus as Menus");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Menus", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus[] listMenusByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryMenus(session, condition, orderBy);
			return (Menus[]) list.toArray(new Menus[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus[] listMenusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryMenus(session, condition, orderBy, lockMode);
			return (Menus[]) list.toArray(new Menus[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus loadMenusByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMenusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus loadMenusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMenusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus loadMenusByQuery(PersistentSession session, String condition, String orderBy) {
		Menus[] menuses = listMenusByQuery(session, condition, orderBy);
		if (menuses != null && menuses.length > 0)
			return menuses[0];
		else
			return null;
	}
	
	public static Menus loadMenusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Menus[] menuses = listMenusByQuery(session, condition, orderBy, lockMode);
		if (menuses != null && menuses.length > 0)
			return menuses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMenusByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateMenusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateMenusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateMenusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateMenusByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Menus as Menus");
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
	
	public static java.util.Iterator iterateMenusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Menus as Menus");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Menus", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Menus createMenus() {
		return new com.example.demo.modelo.Menus();
	}
	
	public static boolean save(com.example.demo.modelo.Menus menus) {
		try {
			UntitledPersistentManager.instance().saveObject(menus);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Menus menus) {
		try {
			UntitledPersistentManager.instance().deleteObject(menus);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Menus menus) {
		try {
			com.example.demo.modelo.Roles[] lCodrs = menus.codr.toArray();
			for(int i = 0; i < lCodrs.length; i++) {
				lCodrs[i].codm.remove(menus);
			}
			com.example.demo.modelo.Procesos[] lCodps = menus.codp.toArray();
			for(int i = 0; i < lCodps.length; i++) {
				lCodps[i].codm.remove(menus);
			}
			return delete(menus);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Menus menus, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Roles[] lCodrs = menus.codr.toArray();
			for(int i = 0; i < lCodrs.length; i++) {
				lCodrs[i].codm.remove(menus);
			}
			com.example.demo.modelo.Procesos[] lCodps = menus.codp.toArray();
			for(int i = 0; i < lCodps.length; i++) {
				lCodps[i].codm.remove(menus);
			}
			try {
				session.delete(menus);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Menus menus) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(menus);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Menus menus) {
		try {
			UntitledPersistentManager.instance().getSession().evict(menus);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
