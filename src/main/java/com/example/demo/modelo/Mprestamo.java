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
@Table(name="mprestamo")
public class Mprestamo implements Serializable {
	public Mprestamo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MPRESTAMO_DPRESTAMO) {
			return ORM_dprestamo;
		}
		else if (key == ORMConstants.KEY_MPRESTAMO_MDEVOL) {
			return ORM_mdevol;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MPRESTAMO_CI) {
			this.ci = (com.example.demo.modelo.Datos) owner;
		}
		
		else if (key == ORMConstants.KEY_MPRESTAMO_LOGIN) {
			this.login = (com.example.demo.modelo.Usuarios) owner;
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
	
	@Column(name="codp", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_MPRESTAMO_CODP_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_MPRESTAMO_CODP_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="mprestamo_codp_seq") })	
	private int codp;
	
	@Column(name="fecha", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@Column(name="fini", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fini;
	
	@Column(name="ffin", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date ffin;
	
	@Column(name="tipopres", nullable=false)	
	private int tipopres;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Datos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ci", referencedColumnName="ci", nullable=false) }, foreignKey=@ForeignKey(name="mprestamo_ci_fkey"))	
	private com.example.demo.modelo.Datos ci;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="login", referencedColumnName="login", nullable=false) }, foreignKey=@ForeignKey(name="mprestamo_login_fkey"))	
	private com.example.demo.modelo.Usuarios login;
	
	@OneToMany(mappedBy="codp", targetEntity=com.example.demo.modelo.Dprestamo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_dprestamo = new java.util.HashSet();
	
	@OneToMany(mappedBy="codp", targetEntity=com.example.demo.modelo.Mdevol.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mdevol = new java.util.HashSet();
	
	private void setCodp(int value) {
		this.codp = value;
	}
	
	public int getCodp() {
		return codp;
	}
	
	public int getORMID() {
		return getCodp();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setFini(java.util.Date value) {
		this.fini = value;
	}
	
	public java.util.Date getFini() {
		return fini;
	}
	
	public void setFfin(java.util.Date value) {
		this.ffin = value;
	}
	
	public java.util.Date getFfin() {
		return ffin;
	}
	
	public void setTipopres(int value) {
		this.tipopres = value;
	}
	
	public int getTipopres() {
		return tipopres;
	}
	
	public void setEstado(int value) {
		this.estado = value;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setCi(com.example.demo.modelo.Datos value) {
		if (ci != null) {
			ci.mprestamo.remove(this);
		}
		if (value != null) {
			value.mprestamo.add(this);
		}
	}
	
	public com.example.demo.modelo.Datos getCi() {
		return ci;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Ci(com.example.demo.modelo.Datos value) {
		this.ci = value;
	}
	
	private com.example.demo.modelo.Datos getORM_Ci() {
		return ci;
	}
	
	public void setLogin(com.example.demo.modelo.Usuarios value) {
		if (login != null) {
			login.mprestamo.remove(this);
		}
		if (value != null) {
			value.mprestamo.add(this);
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
	
	private void setORM_Dprestamo(java.util.Set value) {
		this.ORM_dprestamo = value;
	}
	
	private java.util.Set getORM_Dprestamo() {
		return ORM_dprestamo;
	}
	
	@Transient	
	public final com.example.demo.modelo.DprestamoSetCollection dprestamo = new com.example.demo.modelo.DprestamoSetCollection(this, _ormAdapter, ORMConstants.KEY_MPRESTAMO_DPRESTAMO, ORMConstants.KEY_DPRESTAMO_CODP, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Mdevol(java.util.Set value) {
		this.ORM_mdevol = value;
	}
	
	private java.util.Set getORM_Mdevol() {
		return ORM_mdevol;
	}
	
	@Transient	
	public final com.example.demo.modelo.MdevolSetCollection mdevol = new com.example.demo.modelo.MdevolSetCollection(this, _ormAdapter, ORMConstants.KEY_MPRESTAMO_MDEVOL, ORMConstants.KEY_MDEVOL_CODP, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodp());
	}
	
}
