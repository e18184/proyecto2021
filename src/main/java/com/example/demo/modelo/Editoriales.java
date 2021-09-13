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
@Table(name="editoriales")
public class Editoriales implements Serializable {
	public Editoriales() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EDITORIALES_TEXTOS) {
			return ORM_textos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="code", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_EDITORIALES_CODE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_EDITORIALES_CODE_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="editoriales_code_seq") })	
	private int code;
	
	@Column(name="nombre", nullable=false, length=40)	
	private String nombre;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@OneToMany(mappedBy="code", targetEntity=com.example.demo.modelo.Textos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_textos = new java.util.HashSet();
	
	private void setCode(int value) {
		this.code = value;
	}
	
	public int getCode() {
		return code;
	}
	
	public int getORMID() {
		return getCode();
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
	
	private void setORM_Textos(java.util.Set value) {
		this.ORM_textos = value;
	}
	
	private java.util.Set getORM_Textos() {
		return ORM_textos;
	}
	
	@Transient	
	public final com.example.demo.modelo.TextosSetCollection textos = new com.example.demo.modelo.TextosSetCollection(this, _ormAdapter, ORMConstants.KEY_EDITORIALES_TEXTOS, ORMConstants.KEY_TEXTOS_CODE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCode());
	}
	
}
