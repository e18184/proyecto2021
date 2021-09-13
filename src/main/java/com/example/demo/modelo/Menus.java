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
@Table(name="menus")
public class Menus implements Serializable {
	public Menus() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENUS_CODR) {
			return ORM_codr;
		}
		else if (key == ORMConstants.KEY_MENUS_CODP) {
			return ORM_codp;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="codm", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_MENUS_CODM_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_MENUS_CODM_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="menus_codm_seq") })	
	private int codm;
	
	@Column(name="nombre", nullable=false, length=40)	
	private String nombre;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@ManyToMany(targetEntity=com.example.demo.modelo.Roles.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="rolme", joinColumns={ @JoinColumn(name="codm") }, inverseJoinColumns={ @JoinColumn(name="codr") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codr = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_codm", targetEntity=com.example.demo.modelo.Procesos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codp = new java.util.HashSet();
	
	private void setCodm(int value) {
		this.codm = value;
	}
	
	public int getCodm() {
		return codm;
	}
	
	public int getORMID() {
		return getCodm();
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
	
	private void setORM_Codr(java.util.Set value) {
		this.ORM_codr = value;
	}
	
	private java.util.Set getORM_Codr() {
		return ORM_codr;
	}
	
	@Transient	
	public final com.example.demo.modelo.RolesSetCollection codr = new com.example.demo.modelo.RolesSetCollection(this, _ormAdapter, ORMConstants.KEY_MENUS_CODR, ORMConstants.KEY_ROLES_CODM, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Codp(java.util.Set value) {
		this.ORM_codp = value;
	}
	
	private java.util.Set getORM_Codp() {
		return ORM_codp;
	}
	
	@Transient	
	public final com.example.demo.modelo.ProcesosSetCollection codp = new com.example.demo.modelo.ProcesosSetCollection(this, _ormAdapter, ORMConstants.KEY_MENUS_CODP, ORMConstants.KEY_PROCESOS_CODM, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodm());
	}
	
}
