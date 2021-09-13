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
@Table(name="datos")
public class Datos implements Serializable {
	public Datos() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Datos))
			return false;
		Datos datos = (Datos)aObj;
		if ((getCi() != null && !getCi().equals(datos.getCi())) || (getCi() == null && datos.getCi() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCi() == null ? 0 : getCi().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DATOS_MPRESTAMO) {
			return ORM_mprestamo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DATOS_CODPER) {
			this.codper = (com.example.demo.modelo.Personas) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ci", nullable=false, length=15)	
	@Id	
	private String ci;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Personas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="codper", referencedColumnName="codper", nullable=false) }, foreignKey=@ForeignKey(name="datos_codper_fkey"))	
	private com.example.demo.modelo.Personas codper;
	
	@OneToMany(mappedBy="ci", targetEntity=com.example.demo.modelo.Mprestamo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mprestamo = new java.util.HashSet();
	
	public void setCi(String value) {
		this.ci = value;
	}
	
	public String getCi() {
		return ci;
	}
	
	public String getORMID() {
		return getCi();
	}
	
	public void setCodper(com.example.demo.modelo.Personas value) {
		if (codper != null) {
			codper.datos.remove(this);
		}
		if (value != null) {
			value.datos.add(this);
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
	
	private void setORM_Mprestamo(java.util.Set value) {
		this.ORM_mprestamo = value;
	}
	
	private java.util.Set getORM_Mprestamo() {
		return ORM_mprestamo;
	}
	
	@Transient	
	public final com.example.demo.modelo.MprestamoSetCollection mprestamo = new com.example.demo.modelo.MprestamoSetCollection(this, _ormAdapter, ORMConstants.KEY_DATOS_MPRESTAMO, ORMConstants.KEY_MPRESTAMO_CI, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCi());
	}
	
}
