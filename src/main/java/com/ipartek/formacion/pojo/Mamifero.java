package com.ipartek.formacion.pojo;


public class Mamifero {
	
	protected String nombre;
	private int patas;
	
	public Mamifero(String nombre) {
		super();
		this.nombre = nombre;
		this.patas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	// sobreescribimos al padre que es java.lnag.Object
	@Override
	public String toString() {
		return "Mamifero [nombre=" + nombre + ", patas=" + patas + "]";
	}
	
}
