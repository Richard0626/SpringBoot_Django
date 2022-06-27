package com.example.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "eatfood_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cat;
	private String nombre;
	private Date fec_re;
	
	public Categoria() {
		super();
	}
	public Categoria(long id_cat, String nombre, Date fec_re) {
		super();
		this.id_cat = id_cat;
		this.nombre = nombre;
		this.fec_re = fec_re;
	}
	public long getId_cat() {
		return id_cat;
	}
	public void setId_cat(long id_cat) {
		this.id_cat = id_cat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFec_re() {
		return fec_re;
	}
	public void setFec_re(Date fec_re) {
		this.fec_re = fec_re;
	}
	
}
