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
@Table(name="telefonos")
@IdClass(TelefonosPK.class)
public class Telefonos implements Serializable {
	public Telefonos() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Telefonos))
			return false;
		Telefonos telefonos = (Telefonos)aObj;
		if (getCodper() == null) {
			if (telefonos.getCodper() != null)
				return false;
		}
		else if (!getCodper().equals(telefonos.getCodper()))
			return false;
		if ((getNumero() != null && !getNumero().equals(telefonos.getNumero())) || (getNumero() == null && telefonos.getNumero() != null))
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TELEFONOS_CODPER) {
			this.codper = (com.example.demo.modelo.Personas) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=com.example.demo.modelo.Personas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codper", referencedColumnName="codper", nullable=false) }, foreignKey=@ForeignKey(name="telefonos_codper_fkey"))	
	private com.example.demo.modelo.Personas codper;
	
	@Column(name="codper", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_TELEFONOS_CODPERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_TELEFONOS_CODPERID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="codper"))	
	private int codperId;
	
	private void setCodperId(int value) {
		this.codperId = value;
	}
	
	public int getCodperId() {
		return codperId;
	}
	
	@Column(name="numero", nullable=false, length=20)	
	@Id	
	private String numero;
	
	public void setNumero(String value) {
		this.numero = value;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setCodper(com.example.demo.modelo.Personas value) {
		if (codper != null) {
			codper.telefonos.remove(this);
		}
		if (value != null) {
			value.telefonos.add(this);
		}
	}
	
	public com.example.demo.modelo.Personas getCodper() {
		return codper;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Codper(com.example.demo.modelo.Personas value) {
		this.codper = value;
	}
	
	private com.example.demo.modelo.Personas getORM_Codper() {
		return codper;
	}
	
	public String toString() {
		return String.valueOf(((getCodper() == null) ? "" : String.valueOf(getCodper().getORMID())) + " " + getNumero());
	}
	
}
