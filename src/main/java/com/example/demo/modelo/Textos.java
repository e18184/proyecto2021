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
@Table(name="textos")
public class Textos implements Serializable {
	public Textos() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEXTOS_CODA) {
			return ORM_coda;
		}
		else if (key == ORMConstants.KEY_TEXTOS_EJEMPLARES) {
			return ORM_ejemplares;
		}
		else if (key == ORMConstants.KEY_TEXTOS_TIPOTEXT) {
			return ORM_tipotext;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEXTOS_CODA1) {
			this.coda1 = (com.example.demo.modelo.Areas) owner;
		}
		
		else if (key == ORMConstants.KEY_TEXTOS_CODE) {
			this.code = (com.example.demo.modelo.Editoriales) owner;
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
	
	@Column(name="codt", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_DEMO_MODELO_TEXTOS_CODT_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_DEMO_MODELO_TEXTOS_CODT_GENERATOR", strategy="sequence", parameters={ @org.hibernate.annotations.Parameter(name="sequence", value="textos_codt_seq") })	
	private int codt;
	
	@Column(name="titulo", nullable=false, length=150)	
	private String titulo;
	
	@Column(name="resumen", nullable=true, length=1000)	
	private String resumen;
	
	@Column(name="isbn", nullable=true, length=20)	
	private String isbn;
	
	@Column(name="edicion", nullable=true)	
	private Integer edicion;
	
	@Column(name="fechapub", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechapub;
	
	@ManyToMany(targetEntity=com.example.demo.modelo.Autores.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="escriben", joinColumns={ @JoinColumn(name="codt") }, inverseJoinColumns={ @JoinColumn(name="coda") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_coda = new java.util.HashSet();
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Editoriales.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="code", referencedColumnName="code", nullable=false) }, foreignKey=@ForeignKey(name="textos_code_fkey"))	
	private com.example.demo.modelo.Editoriales code;
	
	@ManyToOne(targetEntity=com.example.demo.modelo.Areas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="coda", referencedColumnName="coda", nullable=false) }, foreignKey=@ForeignKey(name="textos_coda_fkey"))	
	private com.example.demo.modelo.Areas coda1;
	
	@OneToMany(mappedBy="codt", targetEntity=com.example.demo.modelo.Ejemplares.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ejemplares = new java.util.HashSet();
	
	@OneToMany(mappedBy="codt", targetEntity=com.example.demo.modelo.Tipotext.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tipotext = new java.util.HashSet();
	
	private void setCodt(int value) {
		this.codt = value;
	}
	
	public int getCodt() {
		return codt;
	}
	
	public int getORMID() {
		return getCodt();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setResumen(String value) {
		this.resumen = value;
	}
	
	public String getResumen() {
		return resumen;
	}
	
	public void setIsbn(String value) {
		this.isbn = value;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setEdicion(int value) {
		setEdicion(new Integer(value));
	}
	
	public void setEdicion(Integer value) {
		this.edicion = value;
	}
	
	public Integer getEdicion() {
		return edicion;
	}
	
	public void setFechapub(java.util.Date value) {
		this.fechapub = value;
	}
	
	public java.util.Date getFechapub() {
		return fechapub;
	}
	
	private void setORM_Coda(java.util.Set value) {
		this.ORM_coda = value;
	}
	
	private java.util.Set getORM_Coda() {
		return ORM_coda;
	}
	
	@Transient	
	public final com.example.demo.modelo.AutoresSetCollection coda = new com.example.demo.modelo.AutoresSetCollection(this, _ormAdapter, ORMConstants.KEY_TEXTOS_CODA, ORMConstants.KEY_AUTORES_CODT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCoda1(com.example.demo.modelo.Areas value) {
		if (coda1 != null) {
			coda1.textos.remove(this);
		}
		if (value != null) {
			value.textos.add(this);
		}
	}
	
	public com.example.demo.modelo.Areas getCoda1() {
		return coda1;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Coda1(com.example.demo.modelo.Areas value) {
		this.coda1 = value;
	}
	
	private com.example.demo.modelo.Areas getORM_Coda1() {
		return coda1;
	}
	
	public void setCode(com.example.demo.modelo.Editoriales value) {
		if (code != null) {
			code.textos.remove(this);
		}
		if (value != null) {
			value.textos.add(this);
		}
	}
	
	public com.example.demo.modelo.Editoriales getCode() {
		return code;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Code(com.example.demo.modelo.Editoriales value) {
		this.code = value;
	}
	
	private com.example.demo.modelo.Editoriales getORM_Code() {
		return code;
	}
	
	private void setORM_Ejemplares(java.util.Set value) {
		this.ORM_ejemplares = value;
	}
	
	private java.util.Set getORM_Ejemplares() {
		return ORM_ejemplares;
	}
	
	@Transient	
	public final com.example.demo.modelo.EjemplaresSetCollection ejemplares = new com.example.demo.modelo.EjemplaresSetCollection(this, _ormAdapter, ORMConstants.KEY_TEXTOS_EJEMPLARES, ORMConstants.KEY_EJEMPLARES_CODT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tipotext(java.util.Set value) {
		this.ORM_tipotext = value;
	}
	
	private java.util.Set getORM_Tipotext() {
		return ORM_tipotext;
	}
	
	@Transient	
	public final com.example.demo.modelo.TipotextSetCollection tipotext = new com.example.demo.modelo.TipotextSetCollection(this, _ormAdapter, ORMConstants.KEY_TEXTOS_TIPOTEXT, ORMConstants.KEY_TIPOTEXT_CODT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getCodt());
	}
	
}
