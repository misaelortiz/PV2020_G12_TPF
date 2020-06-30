/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.UnidadHabitacional;

/**
 * @author ArielG
 *
 */
public interface IUnidadHabitacionalService {
	
	public void crear(UnidadHabitacional unaUnidad);
	
	public UnidadHabitacional modificar(UnidadHabitacional unUsuario) throws Exception;
	
	public void eliminar(String domicilio);
	
	public Iterable<UnidadHabitacional> listarTodos();
	
	public UnidadHabitacional encontrarUsuario(String domicilio) throws Exception;

}
