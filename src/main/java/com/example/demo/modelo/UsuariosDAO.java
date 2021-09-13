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

public class UsuariosDAO {
	public static Usuarios loadUsuariosByORMID(String login) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadUsuariosByORMID(session, login);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios getUsuariosByORMID(String login) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getUsuariosByORMID(session, login);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios loadUsuariosByORMID(String login, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadUsuariosByORMID(session, login, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios getUsuariosByORMID(String login, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getUsuariosByORMID(session, login, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios loadUsuariosByORMID(PersistentSession session, String login) {
		try {
			return (Usuarios) session.load(com.example.demo.modelo.Usuarios.class, login);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios getUsuariosByORMID(PersistentSession session, String login) {
		try {
			return (Usuarios) session.get(com.example.demo.modelo.Usuarios.class, login);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios loadUsuariosByORMID(PersistentSession session, String login, org.hibernate.LockMode lockMode) {
		try {
			return (Usuarios) session.load(com.example.demo.modelo.Usuarios.class, login, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios getUsuariosByORMID(PersistentSession session, String login, org.hibernate.LockMode lockMode) {
		try {
			return (Usuarios) session.get(com.example.demo.modelo.Usuarios.class, login, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryUsuarios(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryUsuarios(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryUsuarios(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryUsuarios(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryUsuarios(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Usuarios as Usuarios");
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
	
	public static List queryUsuarios(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuarios", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryUsuarios(session, condition, orderBy);
			return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios[] listUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryUsuarios(session, condition, orderBy, lockMode);
			return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios loadUsuariosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios loadUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios loadUsuariosByQuery(PersistentSession session, String condition, String orderBy) {
		Usuarios[] usuarioses = listUsuariosByQuery(session, condition, orderBy);
		if (usuarioses != null && usuarioses.length > 0)
			return usuarioses[0];
		else
			return null;
	}
	
	public static Usuarios loadUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Usuarios[] usuarioses = listUsuariosByQuery(session, condition, orderBy, lockMode);
		if (usuarioses != null && usuarioses.length > 0)
			return usuarioses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateUsuariosByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateUsuariosByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateUsuariosByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Usuarios as Usuarios");
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
	
	public static java.util.Iterator iterateUsuariosByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Usuarios as Usuarios");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuarios", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Usuarios createUsuarios() {
		return new com.example.demo.modelo.Usuarios();
	}
	
	public static boolean save(com.example.demo.modelo.Usuarios usuarios) {
		try {
			UntitledPersistentManager.instance().saveObject(usuarios);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Usuarios usuarios) {
		try {
			UntitledPersistentManager.instance().deleteObject(usuarios);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Usuarios usuarios) {
		try {
			if (usuarios.getCodper() != null) {
				usuarios.getCodper().usuarios.remove(usuarios);
			}
			
			com.example.demo.modelo.Roles[] lCodrs = usuarios.codr.toArray();
			for(int i = 0; i < lCodrs.length; i++) {
				lCodrs[i].login.remove(usuarios);
			}
			com.example.demo.modelo.Ejemplares[] lEjemplaress = usuarios.ejemplares.toArray();
			for(int i = 0; i < lEjemplaress.length; i++) {
				lEjemplaress[i].setPer_resp(null);
			}
			com.example.demo.modelo.Ejemplares[] lEjemplares1s = usuarios.ejemplares1.toArray();
			for(int i = 0; i < lEjemplares1s.length; i++) {
				lEjemplares1s[i].setPer_anula(null);
			}
			com.example.demo.modelo.Mdevol[] lMdevols = usuarios.mdevol.toArray();
			for(int i = 0; i < lMdevols.length; i++) {
				lMdevols[i].setLogin(null);
			}
			com.example.demo.modelo.Mprestamo[] lMprestamos = usuarios.mprestamo.toArray();
			for(int i = 0; i < lMprestamos.length; i++) {
				lMprestamos[i].setLogin(null);
			}
			return delete(usuarios);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Usuarios usuarios, org.orm.PersistentSession session) {
		try {
			if (usuarios.getCodper() != null) {
				usuarios.getCodper().usuarios.remove(usuarios);
			}
			
			com.example.demo.modelo.Roles[] lCodrs = usuarios.codr.toArray();
			for(int i = 0; i < lCodrs.length; i++) {
				lCodrs[i].login.remove(usuarios);
			}
			com.example.demo.modelo.Ejemplares[] lEjemplaress = usuarios.ejemplares.toArray();
			for(int i = 0; i < lEjemplaress.length; i++) {
				lEjemplaress[i].setPer_resp(null);
			}
			com.example.demo.modelo.Ejemplares[] lEjemplares1s = usuarios.ejemplares1.toArray();
			for(int i = 0; i < lEjemplares1s.length; i++) {
				lEjemplares1s[i].setPer_anula(null);
			}
			com.example.demo.modelo.Mdevol[] lMdevols = usuarios.mdevol.toArray();
			for(int i = 0; i < lMdevols.length; i++) {
				lMdevols[i].setLogin(null);
			}
			com.example.demo.modelo.Mprestamo[] lMprestamos = usuarios.mprestamo.toArray();
			for(int i = 0; i < lMprestamos.length; i++) {
				lMprestamos[i].setLogin(null);
			}
			try {
				session.delete(usuarios);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Usuarios usuarios) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(usuarios);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Usuarios usuarios) {
		try {
			UntitledPersistentManager.instance().getSession().evict(usuarios);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
