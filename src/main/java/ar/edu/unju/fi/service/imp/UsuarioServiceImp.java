package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuarioRepository;
import ar.edu.unju.fi.service.IUsuarioService;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	@Autowired
	private Usuario usuario;
	
	@Override
	public void eliminarUsuario(Long id) {
		iUsuarioRepository.deleteById(id);
		
	}

	@Override
	public void agregarUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	} 

} 
