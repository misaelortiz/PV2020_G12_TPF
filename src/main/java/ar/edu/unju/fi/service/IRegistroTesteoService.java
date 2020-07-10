package ar.edu.unju.fi.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.model.RegistroTesteo;

public interface IRegistroTesteoService {
	void eliminarRegistroTesteo(Long id);
	void agregarResgistroTesteo(RegistroTesteo registroTesteo);
	Optional<RegistroTesteo> obtenerRegistroTesto(Long id);
	List<RegistroTesteo> obtenerRegistros();

}
