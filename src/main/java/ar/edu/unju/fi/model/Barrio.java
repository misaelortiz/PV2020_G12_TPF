package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Clase que modela el nombre del barrio donde vive la persona testeada
 * @author Grupo 12
 *
 */
@Component
@Entity
@Table (name = "barrio")
public class Barrio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
		private Long id;

	/**
	 * Propiedad que indica el nombre del Barrio
	 */
	@Column(name = "Direccion", length = 150, nullable=true)
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
