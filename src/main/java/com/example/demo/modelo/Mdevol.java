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
@Table(name="mdevol")
public class Mdevol implements Serializable {
	public Mdevol() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MDEVOL_CODINV) {
			return ORM_codinv;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MDEVOL_LOGIN) {
			this.login = (com.example.demo.modelo.Usuarios) owner;
		}
		
		else if (key == ORMConstants.KEY_MDEVOL_CODP) {
			this.codp = (com.example.demo.modelo.Mprestamo) owner;
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
	
	@Column(name="codd", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_MDEVOL_CODD_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_MDEVOL_CODD_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="mdevol_codd_seq") })	
	private int codd;
	
	@Column(name="fecha", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="login", referencedColumnName="login", nullable=false) }, foreignKey=@ForeignKey(name="mdevol_login_fkey"))	
	private com.example.demo.modelo.Usuarios login;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Mprestamo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codp", referencedColumnName="codp", nullable=false) }, foreignKey=@ForeignKey(name="mdevol_codp_fkey"))	
	private com.example.demo.modelo.Mprestamo codp;
	
	@ManyToMany(mappedBy="ORM_codd", targetEntity=com.example.demo.modelo.Ejemplares.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codinv = new java.util.HashSet();
	
	private void setCodd(int value) {
		this.codd = value;
	}
	
	public int getCodd() {
		return codd;
	}
	
	public int getORMID() {
		return getCodd();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setEstado(int value) {
		this.estado = value;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setLogin(com.example.demo.modelo.Usuarios value) {
		if (login != null) {
			login.mdevol.remove(this);
		}
		if (value != null) {
			value.mdevol.add(this);
		}
	}
	
	public com.example.demo.modelo.Usuarios getLogin() {
		return login;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Login(com.example.demo.modelo.Usuarios value) {
		this.login = value;
	}
	
	private com.example.demo.modelo.Usuarios getORM_Login() {
		return login;
	}
	
	public void setCodp(com.example.demo.modelo.Mprestamo value) {
		if (codp != null) {
			codp.mdevol.remove(this);
		}
		if (value != null) {
			value.mdevol.add(this);
		}
	}
	
	public com.example.demo.modelo.Mprestamo getCodp() {
		return codp;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Codp(com.example.demo.modelo.Mprestamo value) {
		this.codp = value;
	}
	
	private com.example.demo.modelo.Mprestamo getORM_Codp() {
		return codp;
	}
	
	private void setORM_Codinv(java.util.Set value) {
		this.ORM_codinv = value;
	}
	
	private java.util.Set getORM_Codinv() {
		return ORM_codinv;
	}
	
	@Transient	
	public final com.example.demo.modelo.EjemplaresSetCollection codinv = new com.example.demo.modelo.EjemplaresSetCollection(this, _ormAdapter, ORMConstants.KEY_MDEVOL_CODINV, ORMConstants.KEY_EJEMPLARES_CODD, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodd());
	}
	
}
