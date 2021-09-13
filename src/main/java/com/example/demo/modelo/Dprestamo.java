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
@Table(name="dprestamo")
@IdClass(DprestamoPK.class)
public class Dprestamo implements Serializable {
	public Dprestamo() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Dprestamo))
			return false;
		Dprestamo dprestamo = (Dprestamo)aObj;
		if (getCodp() == null) {
			if (dprestamo.getCodp() != null)
				return false;
		}
		else if (!getCodp().equals(dprestamo.getCodp()))
			return false;
		if (getCodinv() == null) {
			if (dprestamo.getCodinv() != null)
				return false;
		}
		else if (!getCodinv().equals(dprestamo.getCodinv()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getCodp() != null) {
			hashcode = hashcode + (int) getCodp().getORMID();
		}
		if (getCodinv() != null) {
			hashcode = hashcode + (int) getCodinv().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DPRESTAMO_CODP) {
			this.codp = (com.example.demo.modelo.Mprestamo) owner;
		}
		
		else if (key == ORMConstants.KEY_DPRESTAMO_CODINV) {
			this.codinv = (com.example.demo.modelo.Ejemplares) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=com.example.demo.modelo.Mprestamo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codp", referencedColumnName="codp", nullable=false) }, foreignKey=@ForeignKey(name="dprestamo_codp_fkey"))	
	private com.example.demo.modelo.Mprestamo codp;
	
	@Column(name="codp", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_DPRESTAMO_CODPID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_DPRESTAMO_CODPID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="codp"))	
	private int codpId;
	
	private void setCodpId(int value) {
		this.codpId = value;
	}
	
	public int getCodpId() {
		return codpId;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=com.example.demo.modelo.Ejemplares.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codinv", referencedColumnName="codinv", nullable=false) }, foreignKey=@ForeignKey(name="dprestamo_codinv_fkey"))	
	private com.example.demo.modelo.Ejemplares codinv;
	
	@Column(name="codinv", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_DPRESTAMO_CODINVID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_DPRESTAMO_CODINVID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="codinv"))	
	private int codinvId;
	
	private void setCodinvId(int value) {
		this.codinvId = value;
	}
	
	public int getCodinvId() {
		return codinvId;
	}
	
	@Column(name="estado", nullable=false)	
	private int estado;
	
	public void setEstado(int value) {
		this.estado = value;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setCodp(com.example.demo.modelo.Mprestamo value) {
		if (codp != null) {
			codp.dprestamo.remove(this);
		}
		if (value != null) {
			value.dprestamo.add(this);
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
	
	public void setCodinv(com.example.demo.modelo.Ejemplares value) {
		if (codinv != null) {
			codinv.dprestamo.remove(this);
		}
		if (value != null) {
			value.dprestamo.add(this);
		}
	}
	
	public com.example.demo.modelo.Ejemplares getCodinv() {
		return codinv;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Codinv(com.example.demo.modelo.Ejemplares value) {
		this.codinv = value;
	}
	
	private com.example.demo.modelo.Ejemplares getORM_Codinv() {
		return codinv;
	}
	
	public String toString() {
		return String.valueOf(((getCodp() == null) ? "" : String.valueOf(getCodp().getORMID())) + " " + ((getCodinv() == null) ? "" : String.valueOf(getCodinv().getORMID())));
	}
	
}
