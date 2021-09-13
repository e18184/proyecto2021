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
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;
import org.hibernate.boot.MetadataSources;

public class UntitledPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "Untitled";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private UntitledPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	@Override
	protected void configureMetadataSources(MetadataSources aMetadataSources) {
		super.configureMetadataSources(aMetadataSources);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.V_usuariorol.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Areas.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Autores.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Datos.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Mprestamo.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Ejemplares.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Dprestamo.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.DprestamoPK.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Editoriales.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Mdevol.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Menus.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Personas.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Procesos.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Roles.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Telefonos.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.TelefonosPK.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Textos.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Tipos.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Tipotext.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.TipotextPK.class);
		aMetadataSources.addAnnotatedClass(com.example.demo.modelo.Usuarios.class);
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new UntitledPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
