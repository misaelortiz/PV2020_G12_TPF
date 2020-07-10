package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que indica el lugar de residencia de la persona testeada
 * @author Grupo 12: ArielGM
 *
 */

@Entity
@Table (name="unidadHabitacional")
public class UnidadHabitacional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
	private Long id;
	
	/**
	 * Propiedad que indica el domicilio(Calle, Nro, Piso, Dpto) de la persona testeada
	 */
	@Column(name = "direccion", length = 150, nullable=true)
	private String direccion;
	
	/**
	 * Propiedad que indica el barrio de la persona testeada
	 */
	@OneToOne
	@JoinColumn(name = "id_barrio")
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
