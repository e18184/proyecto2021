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
@Embeddable
public class TipotextPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof TipotextPK))
			return false;
		TipotextPK tipotextpk = (TipotextPK)aObj;
		if (getCodt() == null) {
			if (tipotextpk.getCodt() != null)
				return false;
		}
		else if (!getCodt().equals(tipotextpk.getCodt()))
			return false;
		if (getCodtipo() == null) {
			if (tipotextpk.getCodtipo() != null)
				return false;
		}
		else if (!getCodtipo().equals(tipotextpk.getCodtipo()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getCodt() != null) {
			hashcode = hashcode + (int) getCodt().getORMID();
		}
		if (getCodtipo() != null) {
			hashcode = hashcode + (int) getCodtipo().getORMID();
		}
		return hashcode;
	}
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Textos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codt", referencedColumnName="codt", nullable=false) }, foreignKey=@ForeignKey(name="tipotext_codt_fkey"))	
	private com.example.demo.modelo.Textos codt;
	
	public void setCodt(com.example.demo.modelo.Textos value)  {
		this.codt =  value;
	}
	
	public com.example.demo.modelo.Textos getCodt()  {
		return this.codt;
	}
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Tipos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codtipo", referencedColumnName="codtipo", nullable=false) }, foreignKey=@ForeignKey(name="tipotext_codtipo_fkey"))	
	private com.example.demo.modelo.Tipos codtipo;
	
	public void setCodtipo(com.example.demo.modelo.Tipos value)  {
		this.codtipo =  value;
	}
	
	public com.example.demo.modelo.Tipos getCodtipo()  {
		return this.codtipo;
	}
	
}
