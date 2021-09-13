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

public class RolesDAO {
	public static Roles loadRolesByORMID(int codr) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadRolesByORMID(session, codr);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles getRolesByORMID(int codr) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getRolesByORMID(session, codr);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles loadRolesByORMID(int codr, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadRolesByORMID(session, codr, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles getRolesByORMID(int codr, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getRolesByORMID(session, codr, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles loadRolesByORMID(PersistentSession session, int codr) {
		try {
			return (Roles) session.load(com.example.demo.modelo.Roles.class, new Integer(codr));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles getRolesByORMID(PersistentSession session, int codr) {
		try {
			return (Roles) session.get(com.example.demo.modelo.Roles.class, new Integer(codr));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles loadRolesByORMID(PersistentSession session, int codr, org.hibernate.LockMode lockMode) {
		try {
			return (Roles) session.load(com.example.demo.modelo.Roles.class, new Integer(codr), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles getRolesByORMID(PersistentSession session, int codr, org.hibernate.LockMode lockMode) {
		try {
			return (Roles) session.get(com.example.demo.modelo.Roles.class, new Integer(codr), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryRoles(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryRoles(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryRoles(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryRoles(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles[] listRolesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listRolesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles[] listRolesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listRolesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryRoles(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Roles as Roles");
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
	
	public static List queryRoles(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Roles as Roles");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Roles", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles[] listRolesByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryRoles(session, condition, orderBy);
			return (Roles[]) list.toArray(new Roles[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles[] listRolesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryRoles(session, condition, orderBy, lockMode);
			return (Roles[]) list.toArray(new Roles[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles loadRolesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadRolesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles loadRolesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadRolesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles loadRolesByQuery(PersistentSession session, String condition, String orderBy) {
		Roles[] roleses = listRolesByQuery(session, condition, orderBy);
		if (roleses != null && roleses.length > 0)
			return roleses[0];
		else
			return null;
	}
	
	public static Roles loadRolesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Roles[] roleses = listRolesByQuery(session, condition, orderBy, lockMode);
		if (roleses != null && roleses.length > 0)
			return roleses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRolesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateRolesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateRolesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateRolesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateRolesByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Roles as Roles");
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
	
	public static java.util.Iterator iterateRolesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Roles as Roles");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Roles", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Roles createRoles() {
		return new com.example.demo.modelo.Roles();
	}
	
	public static boolean save(com.example.demo.modelo.Roles roles) {
		try {
			UntitledPersistentManager.instance().saveObject(roles);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Roles roles) {
		try {
			UntitledPersistentManager.instance().deleteObject(roles);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Roles roles) {
		try {
			com.example.demo.modelo.Menus[] lCodms = roles.codm.toArray();
			for(int i = 0; i < lCodms.length; i++) {
				lCodms[i].codr.remove(roles);
			}
			com.example.demo.modelo.Usuarios[] lLogins = roles.login.toArray();
			for(int i = 0; i < lLogins.length; i++) {
				lLogins[i].codr.remove(roles);
			}
			return delete(roles);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Roles roles, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Menus[] lCodms = roles.codm.toArray();
			for(int i = 0; i < lCodms.length; i++) {
				lCodms[i].codr.remove(roles);
			}
			com.example.demo.modelo.Usuarios[] lLogins = roles.login.toArray();
			for(int i = 0; i < lLogins.length; i++) {
				lLogins[i].codr.remove(roles);
			}
			try {
				session.delete(roles);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Roles roles) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(roles);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Roles roles) {
		try {
			UntitledPersistentManager.instance().getSession().evict(roles);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
