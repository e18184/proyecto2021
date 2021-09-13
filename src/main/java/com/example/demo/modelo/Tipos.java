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
@Table(name="tipos")
public class Tipos implements Serializable {
	public Tipos() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TIPOS_TIPOTEXT) {
			return ORM_tipotext;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="codtipo", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_TIPOS_CODTIPO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_TIPOS_CODTIPO_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="tipos_codtipo_seq") })	
	private int codtipo;
	
	@Column(name="nombre", nullable=false, length=40)	
	private String nombre;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@Column(name="sw", nullable=false)	
	private int sw;
	
	@OneToMany(mappedBy="codtipo", targetEntity=com.example.demo.modelo.Tipotext.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tipotext = new java.util.HashSet();
	
	private void setCodtipo(int value) {
		this.codtipo = value;
	}
	
	public int getCodtipo() {
		return codtipo;
	}
	
	public int getORMID() {
		return getCodtipo();
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
	
	public void setSw(int value) {
		this.sw = value;
	}
	
	public int getSw() {
		return sw;
	}
	
	private void setORM_Tipotext(java.util.Set value) {
		this.ORM_tipotext = value;
	}
	
	private java.util.Set getORM_Tipotext() {
		return ORM_tipotext;
	}
	
	@Transient	
	public final com.example.demo.modelo.TipotextSetCollection tipotext = new com.example.demo.modelo.TipotextSetCollection(this, _ormAdapter, ORMConstants.KEY_TIPOS_TIPOTEXT, ORMConstants.KEY_TIPOTEXT_CODTIPO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodtipo());
	}
	
}
