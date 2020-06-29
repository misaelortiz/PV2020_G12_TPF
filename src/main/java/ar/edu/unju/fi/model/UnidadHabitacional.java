package ar.edu.unju.fi.model;

/**
 * Clase que indica el lugar de residencia de la persona testeada
 * @author Grupo 12: ArielG
 *
 */
public class UnidadHabitacional {
	
	private String direccion;
	private Barrio barrio;
	
	public UnidadHabitacional(){
		
	}

	/**
	 * @param direccion
	 * @param barrio
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
