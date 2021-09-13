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

public class TelefonosDAO {
	public static Telefonos loadTelefonosByORMID(com.example.demo.modelo.Personas codper, String numero) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTelefonosByORMID(session, codper, numero);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos getTelefonosByORMID(com.example.demo.modelo.Personas codper, String numero) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTelefonosByORMID(session, codper, numero);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos loadTelefonosByORMID(com.example.demo.modelo.Personas codper, String numero, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTelefonosByORMID(session, codper, numero, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos getTelefonosByORMID(com.example.demo.modelo.Personas codper, String numero, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getTelefonosByORMID(session, codper, numero, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos loadTelefonosByORMID(PersistentSession session, com.example.demo.modelo.Personas codper, String numero) {
		try {
			TelefonosPK telefonos = new com.example.demo.modelo.TelefonosPK();
			telefonos.setCodper(codper);
			telefonos.setNumero(numero);
			
			return (Telefonos) session.load(com.example.demo.modelo.Telefonos.class, telefonos);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos getTelefonosByORMID(PersistentSession session, com.example.demo.modelo.Personas codper, String numero) {
		try {
			TelefonosPK telefonos = new com.example.demo.modelo.TelefonosPK();
			telefonos.setCodper(codper);
			telefonos.setNumero(numero);
			
			return (Telefonos) session.get(com.example.demo.modelo.Telefonos.class, telefonos);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos loadTelefonosByORMID(PersistentSession session, com.example.demo.modelo.Personas codper, String numero, org.hibernate.LockMode lockMode) {
		try {
			TelefonosPK telefonos = new com.example.demo.modelo.TelefonosPK();
			telefonos.setCodper(codper);
			telefonos.setNumero(numero);
			
			return (Telefonos) session.load(com.example.demo.modelo.Telefonos.class, telefonos, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos getTelefonosByORMID(PersistentSession session, com.example.demo.modelo.Personas codper, String numero, org.hibernate.LockMode lockMode) {
		try {
			TelefonosPK telefonos = new com.example.demo.modelo.TelefonosPK();
			telefonos.setCodper(codper);
			telefonos.setNumero(numero);
			
			return (Telefonos) session.get(com.example.demo.modelo.Telefonos.class, telefonos, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTelefonos(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTelefonos(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTelefonos(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryTelefonos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos[] listTelefonosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTelefonosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos[] listTelefonosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listTelefonosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryTelefonos(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Telefonos as Telefonos");
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
	
	public static List queryTelefonos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Telefonos as Telefonos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Telefonos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos[] listTelefonosByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryTelefonos(session, condition, orderBy);
			return (Telefonos[]) list.toArray(new Telefonos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos[] listTelefonosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryTelefonos(session, condition, orderBy, lockMode);
			return (Telefonos[]) list.toArray(new Telefonos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos loadTelefonosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTelefonosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos loadTelefonosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadTelefonosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos loadTelefonosByQuery(PersistentSession session, String condition, String orderBy) {
		Telefonos[] telefonoses = listTelefonosByQuery(session, condition, orderBy);
		if (telefonoses != null && telefonoses.length > 0)
			return telefonoses[0];
		else
			return null;
	}
	
	public static Telefonos loadTelefonosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Telefonos[] telefonoses = listTelefonosByQuery(session, condition, orderBy, lockMode);
		if (telefonoses != null && telefonoses.length > 0)
			return telefonoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTelefonosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTelefonosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTelefonosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateTelefonosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateTelefonosByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Telefonos as Telefonos");
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
	
	public static java.util.Iterator iterateTelefonosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Telefonos as Telefonos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Telefonos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Telefonos createTelefonos() {
		return new com.example.demo.modelo.Telefonos();
	}
	
	public static boolean save(com.example.demo.modelo.Telefonos telefonos) {
		try {
			UntitledPersistentManager.instance().saveObject(telefonos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Telefonos telefonos) {
		try {
			UntitledPersistentManager.instance().deleteObject(telefonos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Telefonos telefonos) {
		try {
			com.example.demo.modelo.Personas codper = telefonos.getCodper();
			if (telefonos.getCodper() != null) {
				telefonos.getCodper().telefonos.remove(telefonos);
			}
			telefonos.setORM_Codper(codper);
			
			return delete(telefonos);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Telefonos telefonos, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Personas codper = telefonos.getCodper();
			if (telefonos.getCodper() != null) {
				telefonos.getCodper().telefonos.remove(telefonos);
			}
			telefonos.setORM_Codper(codper);
			
			try {
				session.delete(telefonos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Telefonos telefonos) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(telefonos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Telefonos telefonos) {
		try {
			UntitledPersistentManager.instance().getSession().evict(telefonos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
