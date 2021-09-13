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

public class EjemplaresDAO {
	public static Ejemplares loadEjemplaresByORMID(int codinv) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEjemplaresByORMID(session, codinv);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares getEjemplaresByORMID(int codinv) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getEjemplaresByORMID(session, codinv);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares loadEjemplaresByORMID(int codinv, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEjemplaresByORMID(session, codinv, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares getEjemplaresByORMID(int codinv, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getEjemplaresByORMID(session, codinv, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares loadEjemplaresByORMID(PersistentSession session, int codinv) {
		try {
			return (Ejemplares) session.load(com.example.demo.modelo.Ejemplares.class, new Integer(codinv));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares getEjemplaresByORMID(PersistentSession session, int codinv) {
		try {
			return (Ejemplares) session.get(com.example.demo.modelo.Ejemplares.class, new Integer(codinv));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares loadEjemplaresByORMID(PersistentSession session, int codinv, org.hibernate.LockMode lockMode) {
		try {
			return (Ejemplares) session.load(com.example.demo.modelo.Ejemplares.class, new Integer(codinv), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares getEjemplaresByORMID(PersistentSession session, int codinv, org.hibernate.LockMode lockMode) {
		try {
			return (Ejemplares) session.get(com.example.demo.modelo.Ejemplares.class, new Integer(codinv), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryEjemplares(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryEjemplares(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryEjemplares(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryEjemplares(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares[] listEjemplaresByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listEjemplaresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares[] listEjemplaresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listEjemplaresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryEjemplares(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Ejemplares as Ejemplares");
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
	
	public static List queryEjemplares(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Ejemplares as Ejemplares");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ejemplares", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares[] listEjemplaresByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryEjemplares(session, condition, orderBy);
			return (Ejemplares[]) list.toArray(new Ejemplares[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares[] listEjemplaresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryEjemplares(session, condition, orderBy, lockMode);
			return (Ejemplares[]) list.toArray(new Ejemplares[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares loadEjemplaresByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEjemplaresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares loadEjemplaresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEjemplaresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares loadEjemplaresByQuery(PersistentSession session, String condition, String orderBy) {
		Ejemplares[] ejemplareses = listEjemplaresByQuery(session, condition, orderBy);
		if (ejemplareses != null && ejemplareses.length > 0)
			return ejemplareses[0];
		else
			return null;
	}
	
	public static Ejemplares loadEjemplaresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Ejemplares[] ejemplareses = listEjemplaresByQuery(session, condition, orderBy, lockMode);
		if (ejemplareses != null && ejemplareses.length > 0)
			return ejemplareses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEjemplaresByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateEjemplaresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateEjemplaresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateEjemplaresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateEjemplaresByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Ejemplares as Ejemplares");
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
	
	public static java.util.Iterator iterateEjemplaresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Ejemplares as Ejemplares");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ejemplares", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Ejemplares createEjemplares() {
		return new com.example.demo.modelo.Ejemplares();
	}
	
	public static boolean save(com.example.demo.modelo.Ejemplares ejemplares) {
		try {
			UntitledPersistentManager.instance().saveObject(ejemplares);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Ejemplares ejemplares) {
		try {
			UntitledPersistentManager.instance().deleteObject(ejemplares);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Ejemplares ejemplares) {
		try {
			if (ejemplares.getCodt() != null) {
				ejemplares.getCodt().ejemplares.remove(ejemplares);
			}
			
			if (ejemplares.getPer_resp() != null) {
				ejemplares.getPer_resp().ejemplares.remove(ejemplares);
			}
			
			if (ejemplares.getPer_anula() != null) {
				ejemplares.getPer_anula().ejemplares1.remove(ejemplares);
			}
			
			com.example.demo.modelo.Mdevol[] lCodds = ejemplares.codd.toArray();
			for(int i = 0; i < lCodds.length; i++) {
				lCodds[i].codinv.remove(ejemplares);
			}
			com.example.demo.modelo.Dprestamo[] lDprestamos = ejemplares.dprestamo.toArray();
			for(int i = 0; i < lDprestamos.length; i++) {
				lDprestamos[i].setCodinv(null);
			}
			return delete(ejemplares);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Ejemplares ejemplares, org.orm.PersistentSession session) {
		try {
			if (ejemplares.getCodt() != null) {
				ejemplares.getCodt().ejemplares.remove(ejemplares);
			}
			
			if (ejemplares.getPer_resp() != null) {
				ejemplares.getPer_resp().ejemplares.remove(ejemplares);
			}
			
			if (ejemplares.getPer_anula() != null) {
				ejemplares.getPer_anula().ejemplares1.remove(ejemplares);
			}
			
			com.example.demo.modelo.Mdevol[] lCodds = ejemplares.codd.toArray();
			for(int i = 0; i < lCodds.length; i++) {
				lCodds[i].codinv.remove(ejemplares);
			}
			com.example.demo.modelo.Dprestamo[] lDprestamos = ejemplares.dprestamo.toArray();
			for(int i = 0; i < lDprestamos.length; i++) {
				lDprestamos[i].setCodinv(null);
			}
			try {
				session.delete(ejemplares);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Ejemplares ejemplares) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(ejemplares);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Ejemplares ejemplares) {
		try {
			UntitledPersistentManager.instance().getSession().evict(ejemplares);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
