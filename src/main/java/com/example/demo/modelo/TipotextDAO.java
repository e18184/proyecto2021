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

public class TipotextDAO {
	public static Tipotext loadTipotextByORMID(com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTipotextByORMID(session, codt, codtipo);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext getTipotextByORMID(com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTipotextByORMID(session, codt, codtipo);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext loadTipotextByORMID(com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTipotextByORMID(session, codt, codtipo, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext getTipotextByORMID(com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTipotextByORMID(session, codt, codtipo, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext loadTipotextByORMID(PersistentSession session, com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo) {
		try {
			TipotextPK tipotext = new com.example.demo.modelo.TipotextPK();
			tipotext.setCodt(codt);
			tipotext.setCodtipo(codtipo);
			
			return (Tipotext) session.load(com.example.demo.modelo.Tipotext.class, tipotext);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext getTipotextByORMID(PersistentSession session, com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo) {
		try {
			TipotextPK tipotext = new com.example.demo.modelo.TipotextPK();
			tipotext.setCodt(codt);
			tipotext.setCodtipo(codtipo);
			
			return (Tipotext) session.get(com.example.demo.modelo.Tipotext.class, tipotext);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext loadTipotextByORMID(PersistentSession session, com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo, org.hibernate.LockMode lockMode) {
		try {
			TipotextPK tipotext = new com.example.demo.modelo.TipotextPK();
			tipotext.setCodt(codt);
			tipotext.setCodtipo(codtipo);
			
			return (Tipotext) session.load(com.example.demo.modelo.Tipotext.class, tipotext, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext getTipotextByORMID(PersistentSession session, com.example.demo.modelo.Textos codt, com.example.demo.modelo.Tipos codtipo, org.hibernate.LockMode lockMode) {
		try {
			TipotextPK tipotext = new com.example.demo.modelo.TipotextPK();
			tipotext.setCodt(codt);
			tipotext.setCodtipo(codtipo);
			
			return (Tipotext) session.get(com.example.demo.modelo.Tipotext.class, tipotext, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipotext(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTipotext(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipotext(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTipotext(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext[] listTipotextByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTipotextByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext[] listTipotextByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTipotextByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTipotext(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipotext as Tipotext");
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
	
	public static List queryTipotext(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipotext as Tipotext");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipotext", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext[] listTipotextByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryTipotext(session, condition, orderBy);
			return (Tipotext[]) list.toArray(new Tipotext[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext[] listTipotextByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryTipotext(session, condition, orderBy, lockMode);
			return (Tipotext[]) list.toArray(new Tipotext[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext loadTipotextByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTipotextByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext loadTipotextByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTipotextByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext loadTipotextByQuery(PersistentSession session, String condition, String orderBy) {
		Tipotext[] tipotexts = listTipotextByQuery(session, condition, orderBy);
		if (tipotexts != null && tipotexts.length > 0)
			return tipotexts[0];
		else
			return null;
	}
	
	public static Tipotext loadTipotextByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Tipotext[] tipotexts = listTipotextByQuery(session, condition, orderBy, lockMode);
		if (tipotexts != null && tipotexts.length > 0)
			return tipotexts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipotextByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTipotextByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTipotextByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTipotextByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTipotextByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipotext as Tipotext");
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
	
	public static java.util.Iterator iterateTipotextByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Tipotext as Tipotext");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipotext", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Tipotext createTipotext() {
		return new com.example.demo.modelo.Tipotext();
	}
	
	public static boolean save(com.example.demo.modelo.Tipotext tipotext) {
		try {
			UntitledPersistentManager.instance().saveObject(tipotext);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Tipotext tipotext) {
		try {
			UntitledPersistentManager.instance().deleteObject(tipotext);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Tipotext tipotext) {
		try {
			com.example.demo.modelo.Textos codt = tipotext.getCodt();
			if (tipotext.getCodt() != null) {
				tipotext.getCodt().tipotext.remove(tipotext);
			}
			tipotext.setORM_Codt(codt);
			
			com.example.demo.modelo.Tipos codtipo = tipotext.getCodtipo();
			if (tipotext.getCodtipo() != null) {
				tipotext.getCodtipo().tipotext.remove(tipotext);
			}
			tipotext.setORM_Codtipo(codtipo);
			
			return delete(tipotext);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Tipotext tipotext, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Textos codt = tipotext.getCodt();
			if (tipotext.getCodt() != null) {
				tipotext.getCodt().tipotext.remove(tipotext);
			}
			tipotext.setORM_Codt(codt);
			
			com.example.demo.modelo.Tipos codtipo = tipotext.getCodtipo();
			if (tipotext.getCodtipo() != null) {
				tipotext.getCodtipo().tipotext.remove(tipotext);
			}
			tipotext.setORM_Codtipo(codtipo);
			
			try {
				session.delete(tipotext);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Tipotext tipotext) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(tipotext);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Tipotext tipotext) {
		try {
			UntitledPersistentManager.instance().getSession().evict(tipotext);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
