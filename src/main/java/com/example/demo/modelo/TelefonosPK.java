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
public class TelefonosPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof TelefonosPK))
			return false;
		TelefonosPK telefonospk = (TelefonosPK)aObj;
		if (getCodper() == null) {
			if (telefonospk.getCodper() != null)
				return false;
		}
		else if (!getCodper().equals(telefonospk.getCodper()))
			return false;
		if ((getNumero() != null && !getNumero().equals(telefonospk.getNumero())) || (getNumero() == null && telefonospk.getNumero() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getCodper() != null) {
			hashcode = hashcode + (int) getCodper().getORMID();
		}
		hashcode = hashcode + (getNumero() == null ? 0 : getNumero().hashCode());
		return hashcode;
	}
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Personas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codper", referencedColumnName="codper", nullable=false) }, foreignKey=@ForeignKey(name="telefonos_codper_fkey"))	
	private com.example.demo.modelo.Personas codper;
	
	public void setCodper(com.example.demo.modelo.Personas value)  {
		this.codper =  value;
	}
	
	public com.example.demo.modelo.Personas getCodper()  {
		return this.codper;
	}
	
	@Column(name="numero", nullable=false, length=20)	
	private String numero;
	
	public void setNumero(String value)  {
		this.numero =  value;
	}
	
	public String getNumero()  {
		return this.numero;
	}
	
}
