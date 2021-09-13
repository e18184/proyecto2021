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
public class DprestamoPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof DprestamoPK))
			return false;
		DprestamoPK dprestamopk = (DprestamoPK)aObj;
		if (getCodp() == null) {
			if (dprestamopk.getCodp() != null)
				return false;
		}
		else if (!getCodp().equals(dprestamopk.getCodp()))
			return false;
		if (getCodinv() == null) {
			if (dprestamopk.getCodinv() != null)
				return false;
		}
		else if (!getCodinv().equals(dprestamopk.getCodinv()))
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
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Mprestamo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codp", referencedColumnName="codp", nullable=false) }, foreignKey=@ForeignKey(name="dprestamo_codp_fkey"))	
	private com.example.demo.modelo.Mprestamo codp;
	
	public void setCodp(com.example.demo.modelo.Mprestamo value)  {
		this.codp =  value;
	}
	
	public com.example.demo.modelo.Mprestamo getCodp()  {
		return this.codp;
	}
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Ejemplares.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codinv", referencedColumnName="codinv", nullable=false) }, foreignKey=@ForeignKey(name="dprestamo_codinv_fkey"))	
	private com.example.demo.modelo.Ejemplares codinv;
	
	public void setCodinv(com.example.demo.modelo.Ejemplares value)  {
		this.codinv =  value;
	}
	
	public com.example.demo.modelo.Ejemplares getCodinv()  {
		return this.codinv;
	}
	
}
