package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que indica el lugar de residencia de la persona testeada
 * @author Grupo 12: ArielGM
 *
 */
@Component
public class UnidadHabitacional {
	
	/**
	 * Propiedad que indica el domicilio(Calle, Nro, Piso, Dpto) de la persona testeada
	 */
	private String direccion;
	
	/**
	 * Propiedad que indica el barrio de la persona testeada
	 */
	@Autowired
	private Barrio barrio;
	
	
	/**
	 * Constructor sin parámtetros
	 */
	public UnidadHabitacional(){
		
	}

	/**
	 * Constructor con dos parámetros
	 * @param direccion Domicilio de persona testeada
	 * @param barrio Nombre del barrio de la persona testeada
	 */
	public UnidadHabitacional(String direccion, Barrio barrio) {
		this.direccion = direccion;
		this.barrio = barrio;
	}

	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Barrio getBarrio() {
		return barrio;
	}

	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}

}
