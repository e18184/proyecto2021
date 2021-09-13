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

public class MdevolDAO {
	public static Mdevol loadMdevolByORMID(int codd) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMdevolByORMID(session, codd);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol getMdevolByORMID(int codd) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getMdevolByORMID(session, codd);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol loadMdevolByORMID(int codd, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMdevolByORMID(session, codd, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol getMdevolByORMID(int codd, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getMdevolByORMID(session, codd, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol loadMdevolByORMID(PersistentSession session, int codd) {
		try {
			return (Mdevol) session.load(com.example.demo.modelo.Mdevol.class, new Integer(codd));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol getMdevolByORMID(PersistentSession session, int codd) {
		try {
			return (Mdevol) session.get(com.example.demo.modelo.Mdevol.class, new Integer(codd));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol loadMdevolByORMID(PersistentSession session, int codd, org.hibernate.LockMode lockMode) {
		try {
			return (Mdevol) session.load(com.example.demo.modelo.Mdevol.class, new Integer(codd), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol getMdevolByORMID(PersistentSession session, int codd, org.hibernate.LockMode lockMode) {
		try {
			return (Mdevol) session.get(com.example.demo.modelo.Mdevol.class, new Integer(codd), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMdevol(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryMdevol(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMdevol(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryMdevol(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol[] listMdevolByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listMdevolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol[] listMdevolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listMdevolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryMdevol(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mdevol as Mdevol");
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
	
	public static List queryMdevol(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mdevol as Mdevol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mdevol", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol[] listMdevolByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryMdevol(session, condition, orderBy);
			return (Mdevol[]) list.toArray(new Mdevol[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol[] listMdevolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryMdevol(session, condition, orderBy, lockMode);
			return (Mdevol[]) list.toArray(new Mdevol[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol loadMdevolByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMdevolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol loadMdevolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadMdevolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol loadMdevolByQuery(PersistentSession session, String condition, String orderBy) {
		Mdevol[] mdevols = listMdevolByQuery(session, condition, orderBy);
		if (mdevols != null && mdevols.length > 0)
			return mdevols[0];
		else
			return null;
	}
	
	public static Mdevol loadMdevolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Mdevol[] mdevols = listMdevolByQuery(session, condition, orderBy, lockMode);
		if (mdevols != null && mdevols.length > 0)
			return mdevols[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMdevolByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateMdevolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateMdevolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateMdevolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateMdevolByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mdevol as Mdevol");
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
	
	public static java.util.Iterator iterateMdevolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Mdevol as Mdevol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mdevol", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Mdevol createMdevol() {
		return new com.example.demo.modelo.Mdevol();
	}
	
	public static boolean save(com.example.demo.modelo.Mdevol mdevol) {
		try {
			UntitledPersistentManager.instance().saveObject(mdevol);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Mdevol mdevol) {
		try {
			UntitledPersistentManager.instance().deleteObject(mdevol);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Mdevol mdevol) {
		try {
			if (mdevol.getLogin() != null) {
				mdevol.getLogin().mdevol.remove(mdevol);
			}
			
			if (mdevol.getCodp() != null) {
				mdevol.getCodp().mdevol.remove(mdevol);
			}
			
			com.example.demo.modelo.Ejemplares[] lCodinvs = mdevol.codinv.toArray();
			for(int i = 0; i < lCodinvs.length; i++) {
				lCodinvs[i].codd.remove(mdevol);
			}
			return delete(mdevol);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Mdevol mdevol, org.orm.PersistentSession session) {
		try {
			if (mdevol.getLogin() != null) {
				mdevol.getLogin().mdevol.remove(mdevol);
			}
			
			if (mdevol.getCodp() != null) {
				mdevol.getCodp().mdevol.remove(mdevol);
			}
			
			com.example.demo.modelo.Ejemplares[] lCodinvs = mdevol.codinv.toArray();
			for(int i = 0; i < lCodinvs.length; i++) {
				lCodinvs[i].codd.remove(mdevol);
			}
			try {
				session.delete(mdevol);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Mdevol mdevol) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(mdevol);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Mdevol mdevol) {
		try {
			UntitledPersistentManager.instance().getSession().evict(mdevol);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
