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

public class TextosDAO {
	public static Textos loadTextosByORMID(int codt) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTextosByORMID(session, codt);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos getTextosByORMID(int codt) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTextosByORMID(session, codt);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos loadTextosByORMID(int codt, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTextosByORMID(session, codt, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos getTextosByORMID(int codt, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTextosByORMID(session, codt, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos loadTextosByORMID(PersistentSession session, int codt) {
		try {
			return (Textos) session.load(com.example.demo.modelo.Textos.class, new Integer(codt));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos getTextosByORMID(PersistentSession session, int codt) {
		try {
			return (Textos) session.get(com.example.demo.modelo.Textos.class, new Integer(codt));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos loadTextosByORMID(PersistentSession session, int codt, org.hibernate.LockMode lockMode) {
		try {
			return (Textos) session.load(com.example.demo.modelo.Textos.class, new Integer(codt), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos getTextosByORMID(PersistentSession session, int codt, org.hibernate.LockMode lockMode) {
		try {
			return (Textos) session.get(com.example.demo.modelo.Textos.class, new Integer(codt), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTextos(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTextos(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTextos(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTextos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos[] listTextosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTextosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos[] listTextosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTextosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTextos(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Textos as Textos");
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
	
	public static List queryTextos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Textos as Textos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Textos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos[] listTextosByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryTextos(session, condition, orderBy);
			return (Textos[]) list.toArray(new Textos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos[] listTextosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryTextos(session, condition, orderBy, lockMode);
			return (Textos[]) list.toArray(new Textos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos loadTextosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTextosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos loadTextosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTextosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos loadTextosByQuery(PersistentSession session, String condition, String orderBy) {
		Textos[] textoses = listTextosByQuery(session, condition, orderBy);
		if (textoses != null && textoses.length > 0)
			return textoses[0];
		else
			return null;
	}
	
	public static Textos loadTextosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Textos[] textoses = listTextosByQuery(session, condition, orderBy, lockMode);
		if (textoses != null && textoses.length > 0)
			return textoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTextosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTextosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTextosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTextosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTextosByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Textos as Textos");
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
	
	public static java.util.Iterator iterateTextosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Textos as Textos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Textos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Textos createTextos() {
		return new com.example.demo.modelo.Textos();
	}
	
	public static boolean save(com.example.demo.modelo.Textos textos) {
		try {
			UntitledPersistentManager.instance().saveObject(textos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Textos textos) {
		try {
			UntitledPersistentManager.instance().deleteObject(textos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Textos textos) {
		try {
			com.example.demo.modelo.Autores[] lCodas = textos.coda.toArray();
			for(int i = 0; i < lCodas.length; i++) {
				lCodas[i].codt.remove(textos);
			}
			if (textos.getCode() != null) {
				textos.getCode().textos.remove(textos);
			}
			
			if (textos.getCoda1() != null) {
				textos.getCoda1().textos.remove(textos);
			}
			
			com.example.demo.modelo.Ejemplares[] lEjemplaress = textos.ejemplares.toArray();
			for(int i = 0; i < lEjemplaress.length; i++) {
				lEjemplaress[i].setCodt(null);
			}
			com.example.demo.modelo.Tipotext[] lTipotexts = textos.tipotext.toArray();
			for(int i = 0; i < lTipotexts.length; i++) {
				lTipotexts[i].setCodt(null);
			}
			return delete(textos);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Textos textos, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Autores[] lCodas = textos.coda.toArray();
			for(int i = 0; i < lCodas.length; i++) {
				lCodas[i].codt.remove(textos);
			}
			if (textos.getCode() != null) {
				textos.getCode().textos.remove(textos);
			}
			
			if (textos.getCoda1() != null) {
				textos.getCoda1().textos.remove(textos);
			}
			
			com.example.demo.modelo.Ejemplares[] lEjemplaress = textos.ejemplares.toArray();
			for(int i = 0; i < lEjemplaress.length; i++) {
				lEjemplaress[i].setCodt(null);
			}
			com.example.demo.modelo.Tipotext[] lTipotexts = textos.tipotext.toArray();
			for(int i = 0; i < lTipotexts.length; i++) {
				lTipotexts[i].setCodt(null);
			}
			try {
				session.delete(textos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Textos textos) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(textos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Textos textos) {
		try {
			UntitledPersistentManager.instance().getSession().evict(textos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
