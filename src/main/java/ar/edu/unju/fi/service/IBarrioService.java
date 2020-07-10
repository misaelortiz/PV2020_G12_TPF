package ar.edu.unju.fi.service;

import java.util.Optional;

import ar.edu.unju.fi.model.Barrio;

/**
 * Interfaz del servicio Barrio
 * @author Grupo 12: ArielGM
 * @version 1
 */
public interface IBarrioService {
	
	public void crear(Barrio unBarrio);
	
	public Barrio modificar(Barrio unBarrio) throws Exception;
	
	public void eliminar(Long id);
	
	public Iterable<Barrio> listarBarrios();
	
	public Optional<Barrio> encontrarBarrio(Long id) throws Exception;

}
