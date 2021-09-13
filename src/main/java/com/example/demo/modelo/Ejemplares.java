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
@Table(name="ejemplares")
public class Ejemplares implements Serializable {
	public Ejemplares() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EJEMPLARES_CODD) {
			return ORM_codd;
		}
		else if (key == ORMConstants.KEY_EJEMPLARES_DPRESTAMO) {
			return ORM_dprestamo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EJEMPLARES_CODT) {
			this.codt = (com.example.demo.modelo.Textos) owner;
		}
		
		else if (key == ORMConstants.KEY_EJEMPLARES_PER_RESP) {
			this.per_resp = (com.example.demo.modelo.Usuarios) owner;
		}
		
		else if (key == ORMConstants.KEY_EJEMPLARES_PER_ANULA) {
			this.per_anula = (com.example.demo.modelo.Usuarios) owner;
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
	
	@Column(name="codinv", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_EJEMPLARES_CODINV_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_EJEMPLARES_CODINV_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="ejemplares_codinv_seq") })	
	private int codinv;
	
	@Column(name="disponible", nullable=false)	
	private int disponible;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Textos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codt", referencedColumnName="codt", nullable=false) }, foreignKey=@ForeignKey(name="ejemplares_codt_fkey"))	
	private com.example.demo.modelo.Textos codt;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="per_resp", referencedColumnName="login", nullable=false) }, foreignKey=@ForeignKey(name="ejemplares_per_resp_fkey"))	
	private com.example.demo.modelo.Usuarios per_resp;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Usuarios.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="per_anula", referencedColumnName="login") }, foreignKey=@ForeignKey(name="ejemplares_per_anula_fkey"))	
	private com.example.demo.modelo.Usuarios per_anula;
	
	@ManyToMany(targetEntity=com.example.demo.modelo.Mdevol.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="ddevol", joinColumns={ @JoinColumn(name="codinv") }, inverseJoinColumns={ @JoinColumn(name="codd") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codd = new java.util.HashSet();
	
	@OneToMany(mappedBy="codinv", targetEntity=com.example.demo.modelo.Dprestamo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_dprestamo = new java.util.HashSet();
	
	private void setCodinv(int value) {
		this.codinv = value;
	}
	
	public int getCodinv() {
		return codinv;
	}
	
	public int getORMID() {
		return getCodinv();
	}
	
	public void setDisponible(int value) {
		this.disponible = value;
	}
	
	public int getDisponible() {
		return disponible;
	}
	
	public void setEstado(int value) {
		this.estado = value;
	}
	
	public int getEstado() {
		return estado;
	}
	
	private void setORM_Codd(java.util.Set value) {
		this.ORM_codd = value;
	}
	
	private java.util.Set getORM_Codd() {
		return ORM_codd;
	}
	
	@Transient	
	public final com.example.demo.modelo.MdevolSetCollection codd = new com.example.demo.modelo.MdevolSetCollection(this, _ormAdapter, ORMConstants.KEY_EJEMPLARES_CODD, ORMConstants.KEY_MDEVOL_CODINV, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCodt(com.example.demo.modelo.Textos value) {
		if (codt != null) {
			codt.ejemplares.remove(this);
		}
		if (value != null) {
			value.ejemplares.add(this);
		}
	}
	
	public com.example.demo.modelo.Textos getCodt() {
		return codt;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Codt(com.example.demo.modelo.Textos value) {
		this.codt = value;
	}
	
	private com.example.demo.modelo.Textos getORM_Codt() {
		return codt;
	}
	
	public void setPer_resp(com.example.demo.modelo.Usuarios value) {
		if (per_resp != null) {
			per_resp.ejemplares.remove(this);
		}
		if (value != null) {
			value.ejemplares.add(this);
		}
	}
	
	public com.example.demo.modelo.Usuarios getPer_resp() {
		return per_resp;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Per_resp(com.example.demo.modelo.Usuarios value) {
		this.per_resp = value;
	}
	
	private com.example.demo.modelo.Usuarios getORM_Per_resp() {
		return per_resp;
	}
	
	public void setPer_anula(com.example.demo.modelo.Usuarios value) {
		if (per_anula != null) {
			per_anula.ejemplares1.remove(this);
		}
		if (value != null) {
			value.ejemplares1.add(this);
		}
	}
	
	public com.example.demo.modelo.Usuarios getPer_anula() {
		return per_anula;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Per_anula(com.example.demo.modelo.Usuarios value) {
		this.per_anula = value;
	}
	
	private com.example.demo.modelo.Usuarios getORM_Per_anula() {
		return per_anula;
	}
	
	private void setORM_Dprestamo(java.util.Set value) {
		this.ORM_dprestamo = value;
	}
	
	private java.util.Set getORM_Dprestamo() {
		return ORM_dprestamo;
	}
	
	@Transient	
	public final com.example.demo.modelo.DprestamoSetCollection dprestamo = new com.example.demo.modelo.DprestamoSetCollection(this, _ormAdapter, ORMConstants.KEY_EJEMPLARES_DPRESTAMO, ORMConstants.KEY_DPRESTAMO_CODINV, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodinv());
	}
	
}
