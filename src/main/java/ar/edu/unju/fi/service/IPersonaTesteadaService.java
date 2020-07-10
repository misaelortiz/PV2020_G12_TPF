package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.PersonaTesteada;


public interface IPersonaTesteadaService {
	void eliminarPersonaT(Long id);
	void guardarPersonaT(PersonaTesteada p);
	List <PersonaTesteada> obtenerPersonasT();
}
