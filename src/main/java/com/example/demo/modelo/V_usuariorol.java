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
@Table(name="v_usuariorol")
@org.hibernate.annotations.Entity(mutable=false)
public class V_usuariorol implements Serializable {
	public V_usuariorol() {
	}
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_V_USUARIOROL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_V_USUARIOROL_ID_GENERATOR", strategy="native")	
	private Long id;
	
	@Column(name="codper", nullable=true)	
	private Integer codper;
	
	@Column(name="nombre_per", nullable=true, length=60)	
	private String nombre_per;
	
	@Column(name="ap", nullable=true, length=40)	
	private String ap;
	
	@Column(name="am", nullable=true, length=40)	
	private String am;
	
	@Column(name="ci", nullable=true, length=15)	
	private String ci;
	
	@Column(name="nombre_rol", nullable=true, length=40)	
	private String nombre_rol;
	
	@Column(name="login", nullable=true, length=15)	
	private String login;
	
	@Column(name="passwd", nullable=true, length=200)	
	private String passwd;
	
	@Column(name="estado", nullable=true)	
	private Integer estado;
	
	private void setId(long value) {
		setId(new Long(value));
	}
	
	private void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getORMID() {
		return getId();
	}
	
	private void setCodper(int value) {
		setCodper(new Integer(value));
	}
	
	private void setCodper(Integer value) {
		this.codper = value;
	}
	
	public Integer getCodper() {
		return codper;
	}
	
	private void setNombre_per(String value) {
		this.nombre_per = value;
	}
	
	public String getNombre_per() {
		return nombre_per;
	}
	
	private void setAp(String value) {
		this.ap = value;
	}
	
	public String getAp() {
		return ap;
	}
	
	private void setAm(String value) {
		this.am = value;
	}
	
	public String getAm() {
		return am;
	}
	
	private void setCi(String value) {
		this.ci = value;
	}
	
	public String getCi() {
		return ci;
	}
	
	private void setNombre_rol(String value) {
		this.nombre_rol = value;
	}
	
	public String getNombre_rol() {
		return nombre_rol;
	}
	
	private void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	private void setPasswd(String value) {
		this.passwd = value;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	private void setEstado(int value) {
		setEstado(new Integer(value));
	}
	
	private void setEstado(Integer value) {
		this.estado = value;
	}
	
	public Integer getEstado() {
		return estado;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
