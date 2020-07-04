package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Barrio;

/**
 * Interfaz del servicio Barrio
 * @author Grupo 12: ArielGM
 * @version 1
 */
public interface IBarrioService {
	
	public void crear(Barrio unBarrio);
	
	public Barrio modificar(Barrio unBarrio) throws Exception;
	
	public void eliminar(String nombre);
	
	public Iterable<Barrio> listarBarrios();
	
	public Barrio encontrarBarrio(String nombre) throws Exception;

}
