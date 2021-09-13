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
@Table(name="usuarios")
public class Usuarios implements Serializable {
	public Usuarios() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Usuarios))
			return false;
		Usuarios usuarios = (Usuarios)aObj;
		if ((getLogin() != null && !getLogin().equals(usuarios.getLogin())) || (getLogin() == null && usuarios.getLogin() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getLogin() == null ? 0 : getLogin().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIOS_CODR) {
			return ORM_codr;
		}
		else if (key == ORMConstants.KEY_USUARIOS_EJEMPLARES) {
			return ORM_ejemplares;
		}
		else if (key == ORMConstants.KEY_USUARIOS_EJEMPLARES1) {
			return ORM_ejemplares1;
		}
		else if (key == ORMConstants.KEY_USUARIOS_MDEVOL) {
			return ORM_mdevol;
		}
		else if (key == ORMConstants.KEY_USUARIOS_MPRESTAMO) {
			return ORM_mprestamo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIOS_CODPER) {
			this.codper = (com.example.demo.modelo.Personas) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="login", nullable=false, length=15)	
	@Id	
	private String login;
	
	@Column(name="passwd", nullable=false, length=200)	
	private String passwd;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Personas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codper", referencedColumnName="codper", nullable=false) }, foreignKey=@ForeignKey(name="usuarios_codper_fkey"))	
	private com.example.demo.modelo.Personas codper;
	
	@ManyToMany(targetEntity=com.example.demo.modelo.Roles.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="rolusu", joinColumns={ @JoinColumn(name="login") }, inverseJoinColumns={ @JoinColumn(name="codr") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codr = new java.util.HashSet();
	
	@OneToMany(mappedBy="per_resp", targetEntity=com.example.demo.modelo.Ejemplares.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ejemplares = new java.util.HashSet();
	
	@OneToMany(mappedBy="per_anula", targetEntity=com.example.demo.modelo.Ejemplares.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ejemplares1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="login", targetEntity=com.example.demo.modelo.Mdevol.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mdevol = new java.util.HashSet();
	
	@OneToMany(mappedBy="login", targetEntity=com.example.demo.modelo.Mprestamo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mprestamo = new java.util.HashSet();
	
	public void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getORMID() {
		return getLogin();
	}
	
	public void setPasswd(String value) {
		this.passwd = value;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setEstado(int value) {
		this.estado = value;
	}
	
	public int getEstado() {
		return estado;
	}
	
	private void setORM_Codr(java.util.Set value) {
		this.ORM_codr = value;
	}
	
	public java.util.Set getORM_Codr() {
		return ORM_codr;
	}
	
	@Transient	
	public final com.example.demo.modelo.RolesSetCollection codr = new com.example.demo.modelo.RolesSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOS_CODR, ORMConstants.KEY_ROLES_LOGIN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCodper(com.example.demo.modelo.Personas value) {
		if (codper != null) {
			codper.usuarios.remove(this);
		}
		if (value != null) {
			value.usuarios.add(this);
		}
	}
	
	public com.example.demo.modelo.Personas getCodper() {
		return codper;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Codper(com.example.demo.modelo.Personas value) {
		this.codper = value;
	}
	
	private com.example.demo.modelo.Personas getORM_Codper() {
		return codper;
	}
	
	private void setORM_Ejemplares(java.util.Set value) {
		this.ORM_ejemplares = value;
	}
	
	private java.util.Set getORM_Ejemplares() {
		return ORM_ejemplares;
	}
	
	@Transient	
	public final com.example.demo.modelo.EjemplaresSetCollection ejemplares = new com.example.demo.modelo.EjemplaresSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOS_EJEMPLARES, ORMConstants.KEY_EJEMPLARES_PER_RESP, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Ejemplares1(java.util.Set value) {
		this.ORM_ejemplares1 = value;
	}
	
	private java.util.Set getORM_Ejemplares1() {
		return ORM_ejemplares1;
	}
	
	@Transient	
	public final com.example.demo.modelo.EjemplaresSetCollection ejemplares1 = new com.example.demo.modelo.EjemplaresSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOS_EJEMPLARES1, ORMConstants.KEY_EJEMPLARES_PER_ANULA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Mdevol(java.util.Set value) {
		this.ORM_mdevol = value;
	}
	
	private java.util.Set getORM_Mdevol() {
		return ORM_mdevol;
	}
	
	@Transient	
	public final com.example.demo.modelo.MdevolSetCollection mdevol = new com.example.demo.modelo.MdevolSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOS_MDEVOL, ORMConstants.KEY_MDEVOL_LOGIN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Mprestamo(java.util.Set value) {
		this.ORM_mprestamo = value;
	}
	
	private java.util.Set getORM_Mprestamo() {
		return ORM_mprestamo;
	}
	
	@Transient	
	public final com.example.demo.modelo.MprestamoSetCollection mprestamo = new com.example.demo.modelo.MprestamoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOS_MPRESTAMO, ORMConstants.KEY_MPRESTAMO_LOGIN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getLogin());
	}
	
}
