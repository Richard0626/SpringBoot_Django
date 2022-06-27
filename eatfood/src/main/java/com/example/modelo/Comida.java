package com.example.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "eatfood_comida")
public class Comida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_com;
	private String nombre;
	private String descrip;
	private String precio;
	private String stock;
	private String img;
	


	public Comida(long id_com, String nombre, String descrip, String precio, String stock, String img) {
		super();
		this.id_com = id_com;
		this.nombre = nombre;
		this.descrip = descrip;
		this.precio = precio;
		this.stock = stock;
		this.img = img;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public long getId_com() {
		return id_com;
	}
	public void setId_com(long id_com) {
		this.id_com = id_com;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public Comida() {
		super();
	}

	
}
