/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.UnidadHabitacional;

/**
 * Interfaz del Servicio Unidad Habitacional
 * @author Grupo 12: ArielGM
 * @version 1
 */
public interface IUnidadHabitacionalService {
	
	public void crear(UnidadHabitacional unaUnidad);
	
	public UnidadHabitacional modificar(UnidadHabitacional unUsuario) throws Exception;
	
	public void eliminar(String domicilio);
	
	public Iterable<UnidadHabitacional> listarTodos();
	
	public UnidadHabitacional encontrarUsuario(String domicilio) throws Exception;

}
