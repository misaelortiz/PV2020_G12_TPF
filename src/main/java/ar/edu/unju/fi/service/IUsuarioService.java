package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioService {
	void eliminarUsuario(Long id);
	void agregarUsuario(Usuario usuario);
	Usuario modificarUsuario(Usuario usuario)throws Exception;
	Usuario encontrarUsuario(Long id)throws Exception;
	List<Usuario> listarUsuario();
	
	

}
