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
@Table(name="personas")
public class Personas implements Serializable {
	public Personas() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PERSONAS_DATOS) {
			return ORM_datos;
		}
		else if (key == ORMConstants.KEY_PERSONAS_TELEFONOS) {
			return ORM_telefonos;
		}
		else if (key == ORMConstants.KEY_PERSONAS_USUARIOS) {
			return ORM_usuarios;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="codper", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_PERSONAS_CODPER_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_PERSONAS_CODPER_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="personas_codper_seq") })	
	private int codper;
	
	@Column(name="nombre", nullable=false, length=60)	
	private String nombre;
	
	@Column(name="ap", nullable=true, length=40)	
	private String ap;
	
	@Column(name="am", nullable=true, length=40)	
	private String am;
	
	@Column(name="genero", nullable=false, length=1)	
	private String genero;
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	@Column(name="tipoper", nullable=false, length=1)	
	private String tipoper;
	
	@Column(name="foto", nullable=true, length=40)	
	private String foto;
	
	@OneToMany(mappedBy="codper", targetEntity=com.example.demo.modelo.Datos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_datos = new java.util.HashSet();
	
	@OneToMany(mappedBy="codper", targetEntity=com.example.demo.modelo.Telefonos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_telefonos = new java.util.HashSet();
	
	@OneToMany(mappedBy="codper", targetEntity=com.example.demo.modelo.Usuarios.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarios = new java.util.HashSet();
	
	private void setCodper(int value) {
		this.codper = value;
	}
	
	public int getCodper() {
		return codper;
	}
	
	public int getORMID() {
		return getCodper();
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
		this.estado = value;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setTipoper(String value) {
		this.tipoper = value;
	}
	
	public String getTipoper() {
		return tipoper;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	private void setORM_Datos(java.util.Set value) {
		this.ORM_datos = value;
	}
	
	private java.util.Set getORM_Datos() {
		return ORM_datos;
	}
	
	@Transient	
	public final com.example.demo.modelo.DatosSetCollection datos = new com.example.demo.modelo.DatosSetCollection(this, _ormAdapter, ORMConstants.KEY_PERSONAS_DATOS, ORMConstants.KEY_DATOS_CODPER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Telefonos(java.util.Set value) {
		this.ORM_telefonos = value;
	}
	
	private java.util.Set getORM_Telefonos() {
		return ORM_telefonos;
	}
	
	@Transient	
	public final com.example.demo.modelo.TelefonosSetCollection telefonos = new com.example.demo.modelo.TelefonosSetCollection(this, _ormAdapter, ORMConstants.KEY_PERSONAS_TELEFONOS, ORMConstants.KEY_TELEFONOS_CODPER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Usuarios(java.util.Set value) {
		this.ORM_usuarios = value;
	}
	
	private java.util.Set getORM_Usuarios() {
		return ORM_usuarios;
	}
	
	@Transient	
	public final com.example.demo.modelo.UsuariosSetCollection usuarios = new com.example.demo.modelo.UsuariosSetCollection(this, _ormAdapter, ORMConstants.KEY_PERSONAS_USUARIOS, ORMConstants.KEY_USUARIOS_CODPER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodper());
	}
	
}
