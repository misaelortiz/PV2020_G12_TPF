package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.model.PersonaTesteada;
import ar.edu.unju.fi.repository.IPersonaTesteadaRepository;

import ar.edu.unju.fi.service.IPersonaTesteadaService;

public class PersonaTesteadaServiceImp implements IPersonaTesteadaService{
	/**
	 * Se inyecta la clase IRolRepository 
	 * para el uso de sus metodos.
	 * 
	 */
	@Autowired
	private IPersonaTesteadaRepository iPersonaTesteadaRepository;
	
	/**
	 * 
	 * Metodo para eliminar una personaT
	 * 
	 */
	@Override
	public void eliminarPersonaT(Long id) {
		iPersonaTesteadaRepository.deleteById(id);;
		
	}
	/**
	 * 
	 * Metodo para agregar/guardar una personaT
	 * 
	 */
	@Override
	public void guardarPersonaT(PersonaTesteada p) {
		iPersonaTesteadaRepository.save(p);
		
	}
	/**
	 * 
	 * Metodo para mostrar la lista de personasT
	 * 
	 */
	@Override
	public List<PersonaTesteada> obtenerPersonasT() {
		
		return iPersonaTesteadaRepository.findAll();
	}

}
