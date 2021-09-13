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

public class PersonasDAO {
	public static Personas loadPersonasByORMID(int codper) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadPersonasByORMID(session, codper);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas getPersonasByORMID(int codper) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getPersonasByORMID(session, codper);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas loadPersonasByORMID(int codper, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadPersonasByORMID(session, codper, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas getPersonasByORMID(int codper, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getPersonasByORMID(session, codper, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas loadPersonasByORMID(PersistentSession session, int codper) {
		try {
			return (Personas) session.load(com.example.demo.modelo.Personas.class, new Integer(codper));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas getPersonasByORMID(PersistentSession session, int codper) {
		try {
			return (Personas) session.get(com.example.demo.modelo.Personas.class, new Integer(codper));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas loadPersonasByORMID(PersistentSession session, int codper, org.hibernate.LockMode lockMode) {
		try {
			return (Personas) session.load(com.example.demo.modelo.Personas.class, new Integer(codper), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas getPersonasByORMID(PersistentSession session, int codper, org.hibernate.LockMode lockMode) {
		try {
			return (Personas) session.get(com.example.demo.modelo.Personas.class, new Integer(codper), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPersonas(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryPersonas(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPersonas(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryPersonas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas[] listPersonasByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listPersonasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas[] listPersonasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listPersonasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryPersonas(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Personas as Personas");
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
	
	public static List queryPersonas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Personas as Personas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Personas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas[] listPersonasByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryPersonas(session, condition, orderBy);
			return (Personas[]) list.toArray(new Personas[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas[] listPersonasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryPersonas(session, condition, orderBy, lockMode);
			return (Personas[]) list.toArray(new Personas[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas loadPersonasByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadPersonasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas loadPersonasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadPersonasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas loadPersonasByQuery(PersistentSession session, String condition, String orderBy) {
		Personas[] personases = listPersonasByQuery(session, condition, orderBy);
		if (personases != null && personases.length > 0)
			return personases[0];
		else
			return null;
	}
	
	public static Personas loadPersonasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Personas[] personases = listPersonasByQuery(session, condition, orderBy, lockMode);
		if (personases != null && personases.length > 0)
			return personases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonasByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iteratePersonasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iteratePersonasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonasByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Personas as Personas");
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
	
	public static java.util.Iterator iteratePersonasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Personas as Personas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Personas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Personas createPersonas() {
		return new com.example.demo.modelo.Personas();
	}
	
	public static boolean save(com.example.demo.modelo.Personas personas) {
		try {
			UntitledPersistentManager.instance().saveObject(personas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Personas personas) {
		try {
			UntitledPersistentManager.instance().deleteObject(personas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Personas personas) {
		try {
			com.example.demo.modelo.Datos[] lDatoss = personas.datos.toArray();
			for(int i = 0; i < lDatoss.length; i++) {
				lDatoss[i].setCodper(null);
			}
			com.example.demo.modelo.Telefonos[] lTelefonoss = personas.telefonos.toArray();
			for(int i = 0; i < lTelefonoss.length; i++) {
				lTelefonoss[i].setCodper(null);
			}
			com.example.demo.modelo.Usuarios[] lUsuarioss = personas.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].setCodper(null);
			}
			return delete(personas);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Personas personas, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Datos[] lDatoss = personas.datos.toArray();
			for(int i = 0; i < lDatoss.length; i++) {
				lDatoss[i].setCodper(null);
			}
			com.example.demo.modelo.Telefonos[] lTelefonoss = personas.telefonos.toArray();
			for(int i = 0; i < lTelefonoss.length; i++) {
				lTelefonoss[i].setCodper(null);
			}
			com.example.demo.modelo.Usuarios[] lUsuarioss = personas.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].setCodper(null);
			}
			try {
				session.delete(personas);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Personas personas) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(personas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Personas personas) {
		try {
			UntitledPersistentManager.instance().getSession().evict(personas);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
