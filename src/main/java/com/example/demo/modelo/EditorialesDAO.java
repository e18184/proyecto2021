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

public class EditorialesDAO {
	public static Editoriales loadEditorialesByORMID(int code) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEditorialesByORMID(session, code);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales getEditorialesByORMID(int code) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getEditorialesByORMID(session, code);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales loadEditorialesByORMID(int code, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEditorialesByORMID(session, code, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales getEditorialesByORMID(int code, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return getEditorialesByORMID(session, code, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales loadEditorialesByORMID(PersistentSession session, int code) {
		try {
			return (Editoriales) session.load(com.example.demo.modelo.Editoriales.class, new Integer(code));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales getEditorialesByORMID(PersistentSession session, int code) {
		try {
			return (Editoriales) session.get(com.example.demo.modelo.Editoriales.class, new Integer(code));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales loadEditorialesByORMID(PersistentSession session, int code, org.hibernate.LockMode lockMode) {
		try {
			return (Editoriales) session.load(com.example.demo.modelo.Editoriales.class, new Integer(code), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales getEditorialesByORMID(PersistentSession session, int code, org.hibernate.LockMode lockMode) {
		try {
			return (Editoriales) session.get(com.example.demo.modelo.Editoriales.class, new Integer(code), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryEditoriales(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryEditoriales(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryEditoriales(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return queryEditoriales(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales[] listEditorialesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listEditorialesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales[] listEditorialesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return listEditorialesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryEditoriales(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Editoriales as Editoriales");
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
	
	public static List queryEditoriales(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Editoriales as Editoriales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editoriales", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales[] listEditorialesByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryEditoriales(session, condition, orderBy);
			return (Editoriales[]) list.toArray(new Editoriales[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales[] listEditorialesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryEditoriales(session, condition, orderBy, lockMode);
			return (Editoriales[]) list.toArray(new Editoriales[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales loadEditorialesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEditorialesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales loadEditorialesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return loadEditorialesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales loadEditorialesByQuery(PersistentSession session, String condition, String orderBy) {
		Editoriales[] editorialeses = listEditorialesByQuery(session, condition, orderBy);
		if (editorialeses != null && editorialeses.length > 0)
			return editorialeses[0];
		else
			return null;
	}
	
	public static Editoriales loadEditorialesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Editoriales[] editorialeses = listEditorialesByQuery(session, condition, orderBy, lockMode);
		if (editorialeses != null && editorialeses.length > 0)
			return editorialeses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEditorialesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateEditorialesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateEditorialesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = UntitledPersistentManager.instance().getSession();
			return iterateEditorialesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateEditorialesByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Editoriales as Editoriales");
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
	
	public static java.util.Iterator iterateEditorialesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From com.example.demo.modelo.Editoriales as Editoriales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Editoriales", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static Editoriales createEditoriales() {
		return new com.example.demo.modelo.Editoriales();
	}
	
	public static boolean save(com.example.demo.modelo.Editoriales editoriales) {
		try {
			UntitledPersistentManager.instance().saveObject(editoriales);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(com.example.demo.modelo.Editoriales editoriales) {
		try {
			UntitledPersistentManager.instance().deleteObject(editoriales);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Editoriales editoriales) {
		try {
			com.example.demo.modelo.Textos[] lTextoss = editoriales.textos.toArray();
			for(int i = 0; i < lTextoss.length; i++) {
				lTextoss[i].setCode(null);
			}
			return delete(editoriales);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean deleteAndDissociate(com.example.demo.modelo.Editoriales editoriales, org.orm.PersistentSession session) {
		try {
			com.example.demo.modelo.Textos[] lTextoss = editoriales.textos.toArray();
			for(int i = 0; i < lTextoss.length; i++) {
				lTextoss[i].setCode(null);
			}
			try {
				session.delete(editoriales);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(com.example.demo.modelo.Editoriales editoriales) {
		try {
			UntitledPersistentManager.instance().getSession().refresh(editoriales);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(com.example.demo.modelo.Editoriales editoriales) {
		try {
			UntitledPersistentManager.instance().getSession().evict(editoriales);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
