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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="roles")
public class Roles implements Serializable {
	public Roles() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ROLES_CODM) {
			return ORM_codm;
		}
		else if (key == ORMConstants.KEY_ROLES_LOGIN) {
			return ORM_login;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="codr", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_ROLES_CODR_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_ROLES_CODR_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="roles_codr_seq") })	
	private int codr;
	
	@Column(name="nombre", nullable=false, length=40)	
	private String nombre;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@ManyToMany(mappedBy="ORM_codr", targetEntity=com.example.demo.modelo.Menus.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codm = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_codr", targetEntity=com.example.demo.modelo.Usuarios.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_login = new java.util.HashSet();
	
	private void setCodr(int value) {
		this.codr = value;
	}
	
	public int getCodr() {
		return codr;
	}
	
	public int getORMID() {
		return getCodr();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEstado(int value) {
		this.estado = value;
	}
	
	public int getEstado() {
		return estado;
	}
	
	private void setORM_Codm(java.util.Set value) {
		this.ORM_codm = value;
	}
	
	private java.util.Set getORM_Codm() {
		return ORM_codm;
	}
	
	@Transient	
	public final com.example.demo.modelo.MenusSetCollection codm = new com.example.demo.modelo.MenusSetCollection(this, _ormAdapter, ORMConstants.KEY_ROLES_CODM, ORMConstants.KEY_MENUS_CODR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Login(java.util.Set value) {
		this.ORM_login = value;
	}
	
	private java.util.Set getORM_Login() {
		return ORM_login;
	}
	
	@Transient	
	public final com.example.demo.modelo.UsuariosSetCollection login = new com.example.demo.modelo.UsuariosSetCollection(this, _ormAdapter, ORMConstants.KEY_ROLES_LOGIN, ORMConstants.KEY_USUARIOS_CODR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodr());
	}
	
}
