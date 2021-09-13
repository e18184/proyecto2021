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
@Table(name="autores")
public class Autores implements Serializable {
	public Autores() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_AUTORES_CODT) {
			return ORM_codt;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="coda", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_AUTORES_CODA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_AUTORES_CODA_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="autores_coda_seq") })	
	private int coda;
	
	@Column(name="nombre", nullable=false, length=60)	
	private String nombre;
	
	@Column(name="ap", nullable=true, length=40)	
	private String ap;
	
	@Column(name="am", nullable=true, length=40)	
	private String am;
	
	@Column(name="genero", nullable=true, length=1)	
	private String genero;
	
	@Column(name="estado", nullable=true)	
	private Integer estado;
	
	@ManyToMany(mappedBy="ORM_coda", targetEntity=com.example.demo.modelo.Textos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_codt = new java.util.HashSet();
	
	private void setCoda(int value) {
		this.coda = value;
	}
	
	public int getCoda() {
		return coda;
	}
	
	public int getORMID() {
		return getCoda();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setAp(String value) {
		this.ap = value;
	}
	
	public String getAp() {
		return ap;
	}
	
	public void setAm(String value) {
		this.am = value;
	}
	
	public String getAm() {
		return am;
	}
	
	public void setGenero(String value) {
		this.genero = value;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setEstado(int value) {
		setEstado(new Integer(value));
	}
	
	public void setEstado(Integer value) {
		this.estado = value;
	}
	
	public Integer getEstado() {
		return estado;
	}
	
	private void setORM_Codt(java.util.Set value) {
		this.ORM_codt = value;
	}
	
	private java.util.Set getORM_Codt() {
		return ORM_codt;
	}
	
	@Transient	
	public final com.example.demo.modelo.TextosSetCollection codt = new com.example.demo.modelo.TextosSetCollection(this, _ormAdapter, ORMConstants.KEY_AUTORES_CODT, ORMConstants.KEY_TEXTOS_CODA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCoda());
	}
	
}
