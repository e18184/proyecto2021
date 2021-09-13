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
@Table(name="procesos")
public class Procesos implements Serializable {
	public Procesos() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROCESOS_CODM) {
			return ORM_codm;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="codp", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_PROCESOS_CODP_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_PROCESOS_CODP_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="procesos_codp_seq") })	
	private int codp;
	
	@Column(name="nombre", nullable=false, length=40)	
	private String nombre;
	
	@Column(name="enlace", nullable=false, length=60)	
	private String enlace;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@ManyToMany(targetEntity=com.example.demo.modelo.Menus.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="mepro", joinColumns={ @JoinColumn(name="codp") }, inverseJoinColumns={ @JoinColumn(name="codm") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codm = new java.util.HashSet();
	
	private void setCodp(int value) {
		this.codp = value;
	}
	
	public int getCodp() {
		return codp;
	}
	
	public int getORMID() {
		return getCodp();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEnlace(String value) {
		this.enlace = value;
	}
	
	public String getEnlace() {
		return enlace;
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
	public final com.example.demo.modelo.MenusSetCollection codm = new com.example.demo.modelo.MenusSetCollection(this, _ormAdapter, ORMConstants.KEY_PROCESOS_CODM, ORMConstants.KEY_MENUS_CODP, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodp());
	}
	
}
