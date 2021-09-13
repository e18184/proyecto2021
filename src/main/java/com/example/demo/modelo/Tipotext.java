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
@Table(name="tipotext")
@IdClass(TipotextPK.class)
public class Tipotext implements Serializable {
	public Tipotext() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Tipotext))
			return false;
		Tipotext tipotext = (Tipotext)aObj;
		if (getCodt() == null) {
			if (tipotext.getCodt() != null)
				return false;
		}
		else if (!getCodt().equals(tipotext.getCodt()))
			return false;
		if (getCodtipo() == null) {
			if (tipotext.getCodtipo() != null)
				return false;
		}
		else if (!getCodtipo().equals(tipotext.getCodtipo()))
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TIPOTEXT_CODT) {
			this.codt = (com.example.demo.modelo.Textos) owner;
		}
		
		else if (key == ORMConstants.KEY_TIPOTEXT_CODTIPO) {
			this.codtipo = (com.example.demo.modelo.Tipos) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=com.example.demo.modelo.Textos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codt", referencedColumnName="codt", nullable=false) }, foreignKey=@ForeignKey(name="tipotext_codt_fkey"))	
	private com.example.demo.modelo.Textos codt;
	
	@Column(name="codt", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_TIPOTEXT_CODTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_TIPOTEXT_CODTID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="codt"))	
	private int codtId;
	
	private void setCodtId(int value) {
		this.codtId = value;
	}
	
	public int getCodtId() {
		return codtId;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=com.example.demo.modelo.Tipos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codtipo", referencedColumnName="codtipo", nullable=false) }, foreignKey=@ForeignKey(name="tipotext_codtipo_fkey"))	
	private com.example.demo.modelo.Tipos codtipo;
	
	@Column(name="codtipo", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_TIPOTEXT_CODTIPOID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_TIPOTEXT_CODTIPOID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="codtipo"))	
	private int codtipoId;
	
	private void setCodtipoId(int value) {
		this.codtipoId = value;
	}
	
	public int getCodtipoId() {
		return codtipoId;
	}
	
	@Column(name="docum", nullable=true, length=200)	
	private String docum;
	
	public void setDocum(String value) {
		this.docum = value;
	}
	
	public String getDocum() {
		return docum;
	}
	
	public void setCodt(com.example.demo.modelo.Textos value) {
		if (codt != null) {
			codt.tipotext.remove(this);
		}
		if (value != null) {
			value.tipotext.add(this);
		}
	}
	
	public com.example.demo.modelo.Textos getCodt() {
		return codt;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Codt(com.example.demo.modelo.Textos value) {
		this.codt = value;
	}
	
	private com.example.demo.modelo.Textos getORM_Codt() {
		return codt;
	}
	
	public void setCodtipo(com.example.demo.modelo.Tipos value) {
		if (codtipo != null) {
			codtipo.tipotext.remove(this);
		}
		if (value != null) {
			value.tipotext.add(this);
		}
	}
	
	public com.example.demo.modelo.Tipos getCodtipo() {
		return codtipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Codtipo(com.example.demo.modelo.Tipos value) {
		this.codtipo = value;
	}
	
	private com.example.demo.modelo.Tipos getORM_Codtipo() {
		return codtipo;
	}
	
	public String toString() {
		return String.valueOf(((getCodt() == null) ? "" : String.valueOf(getCodt().getORMID())) + " " + ((getCodtipo() == null) ? "" : String.valueOf(getCodtipo().getORMID())));
	}
	
}
