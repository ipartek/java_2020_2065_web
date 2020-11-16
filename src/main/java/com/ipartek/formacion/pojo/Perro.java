package com.ipartek.formacion.pojo;


public class Perro extends Mamifero  {
	
	public static final String RAZA_POR_DEFECTO = "cruce";
	
	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private int id;	
	private String raza;
	private float peso;
	private boolean vacunado;
	private String historia;
	
	// Constructores
	///////////////////////////////////////
	public Perro() {
		super("Sin nombre");	
		this.id = 0;
		this.raza = RAZA_POR_DEFECTO;
		this.peso = 0f;
		this.vacunado = false;
		this.historia = "Erase una vez....";
	}
	
	// otro constructor sobrecargado

	
	public Perro(String nombre) {
		super(nombre);
		this.id = 0;
		this.raza = RAZA_POR_DEFECTO;
		this.peso = 0f;
		this.vacunado = false;
		this.historia = "Erase una vez....";		
	}
	
	public Perro(int id, String nombre) {
		this(nombre);
		this.id = id;
	}
	
	
	public Perro(String nombre, String raza, float peso) {
		this(nombre);
		// CUIDADO si tienen algo espcial los settres usarlos
		//this.raza = raza;  
		this.setRaza(raza);
		//this.peso = peso;
		this.setPeso(peso);
	}
	
	
	//Getters y setters
	///////////////////////////////////////

	public String getRaza() {
		return raza;
	}

	/**
	 * Comprobamos que sea una raza valida,
	 * si es null o vacio usamos la constante RAZA_POR_DEFECTO
	 * @param raza
	 */
	public void setRaza(String raza) {
		if ( raza != null ) {
			
			if ( raza.trim().isEmpty() ) {
				raza = RAZA_POR_DEFECTO;
			}
			this.raza = raza;
			
		}else {
			this.raza = RAZA_POR_DEFECTO;
		}		
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if ( peso < 0 ) {
			this.peso = 0;
		}else {
			this.peso = peso;
		}	
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", raza=" + raza + ", peso=" + peso + ", vacunado=" + vacunado + ", historia="
				+ historia + ", getNombre()=" + getNombre() + ", getPatas()=" + getPatas() + "]";
	}


}
