package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

/**
 * Clase que modela el nombre del barrio donde vive la persona testeada
 * @author Grupo 12: ArielGM
 *
 */
@Component
public class Barrio {
	
	/**
	 * Propiedad que indica el nombre del Barrio
	 */
	private String nombre;
	
	
	/**
	 * Constructor sin parámetros
	 */
	public Barrio(){
		
	}

	/**
	 * Constructor con el parámetro del nombre
	 * @param nombre del Barrio
	 */
	public Barrio(String nombre) {
		this.nombre = nombre;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

}
