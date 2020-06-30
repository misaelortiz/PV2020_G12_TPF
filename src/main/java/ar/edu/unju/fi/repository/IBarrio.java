package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Barrio;

/**
 * Interfaz de la Clase Barrio (ABM)
 * @author Grupo 12: ArielGM
 * @version 1
 */
public interface IBarrio {
	
	public void agregar();
	
	public Barrio modificar();
	
	public void eliminar();
	
	public Barrio mostrar();

}
