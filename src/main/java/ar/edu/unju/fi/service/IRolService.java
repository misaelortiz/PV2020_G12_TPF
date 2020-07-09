package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.Rol;

public interface IRolService {
	void eliminarRol(Long id);
	void guardarRol(Rol rol);
	List <Rol> obtenerRoles();
}
