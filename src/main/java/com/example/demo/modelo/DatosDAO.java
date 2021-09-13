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

public class DatosDAO {
	public static Datos loadDatosByORMID(String ci) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDatosByORMID(session, ci);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos getDatosByORMID(String ci) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getDatosByORMID(session, ci);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos loadDatosByORMID(String ci, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDatosByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos getDatosByORMID(String ci, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getDatosByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos loadDatosByORMID(PersistentSession session, String ci) {
		try {
			return (Datos) session.load(com.example.demo.modelo.Datos.class, ci);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos getDatosByORMID(PersistentSession session, String ci) {
		try {
			return (Datos) session.get(com.example.demo.modelo.Datos.class, ci);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos loadDatosByORMID(PersistentSession session, String ci, org.hibernate.LockMode lockMode) {
		try {
			return (Datos) session.load(com.example.demo.modelo.Datos.class, ci, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos getDatosByORMID(PersistentSession session, String ci, org.hibernate.LockMode lockMode) {
		try {
			return (Datos) session.get(com.example.demo.modelo.Datos.class, ci, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDatos(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryDatos(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDatos(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryDatos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos[] listDatosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listDatosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos[] listDatosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listDatosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryDatos(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Datos as Datos");
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
	
	public static List queryDatos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Datos as Datos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Datos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos[] listDatosByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryDatos(session, condition, orderBy);
			return (Datos[]) list.toArray(new Datos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos[] listDatosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryDatos(session, condition, orderBy, lockMode);
			return (Datos[]) list.toArray(new Datos[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos loadDatosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDatosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos loadDatosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadDatosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos loadDatosByQuery(PersistentSession session, String condition, String orderBy) {
		Datos[] datoses = listDatosByQuery(session, condition, orderBy);
		if (datoses != null && datoses.length > 0)
			return datoses[0];
		else
			return null;
	}
	
	public static Datos loadDatosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Datos[] datoses = listDatosByQuery(session, condition, orderBy, lockMode);
		if (datoses != null && datoses.length > 0)
			return datoses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDatosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateDatosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDatosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateDatosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateDatosByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Datos as Datos");
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
	
	public static java.util.Iterator iterateDatosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Datos as Datos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Datos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Datos createDatos() {
		return new com.example.demo.modelo.Datos();
	}
	
	public static boolean save(com.example.demo.modelo.Datos datos) {
		try {
			UntitledPersistentManager.instance().saveObject(datos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Datos datos) {
		try {
			UntitledPersistentManager.instance().deleteObject(datos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Datos datos) {
		try {
			if (datos.getCodper() != null) {
				datos.getCodper().datos.remove(datos);
			}
			
			com.example.demo.modelo.Mprestamo[] lMprestamos = datos.mprestamo.toArray();
			for(int i = 0; i < lMprestamos.length; i++) {
				lMprestamos[i].setCi(null);
			}
			return delete(datos);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Datos datos, org.orm.PersistentSession session) {
		try {
			if (datos.getCodper() != null) {
				datos.getCodper().datos.remove(datos);
			}
			
			com.example.demo.modelo.Mprestamo[] lMprestamos = datos.mprestamo.toArray();
			for(int i = 0; i < lMprestamos.length; i++) {
				lMprestamos[i].setCi(null);
			}
			try {
				session.delete(datos);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Datos datos) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(datos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Datos datos) {
		try {
			UntitledPersistentManager.instance().getSession().evict(datos);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
