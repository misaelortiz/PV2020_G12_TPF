/**
 * 
 */
package ar.edu.unju.fi.service;

import java.util.Optional;

import ar.edu.unju.fi.model.UnidadHabitacional;

/**
 * Interfaz del Servicio Unidad Habitacional
 * @author Grupo 12: ArielGM
 * @version 1
 */
public interface IUnidadHabitacionalService {
	
	public void crear(UnidadHabitacional unaUnidad);
	
	public UnidadHabitacional modificar(UnidadHabitacional unUsuario) throws Exception;
	
	public void eliminar(Long id);
	
	public Iterable<UnidadHabitacional> listarTodos();
	
	public Optional<UnidadHabitacional>encontrarUsuario(Long id) throws Exception;

}
