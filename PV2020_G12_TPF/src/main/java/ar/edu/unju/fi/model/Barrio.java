package ar.edu.unju.fi.model;

/**
 * Clase que contiene al modelo Barrio donde se testea o se testeó
 * @author Grupo 12: Ariel Mamaní
 * @version 1
 */
public class Barrio {
	
	/**
	 * Propiedad que indica el nombre del Barrio
	 */
	private String nombre;
	
	
	/**
	 * Constructor sin parámetro
	 */
	public Barrio(){}

	/**
	 * Constructor con el parámetro nombre del barrio
	 * @param nombre del Barrio
	 */
	public Barrio(String nombreDeBarrio) {
		this.nombre = nombreDeBarrio;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	};

}
