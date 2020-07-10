package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioService {
	void eliminarUsuario(Long id);
	void agregarUsuario();
	List<Usuario> listarUsuario();
	
	

}
