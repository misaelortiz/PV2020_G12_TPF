package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	/**
	 * Alta se usuario
	 * Se extrae la pass del objeto recibido por parametro
	 * Se la encripta y se la reasigna al objeto
	 * Por ultimo se guarda en la BD.
	 */
	public void agregarUsuario(Usuario usuario) {
		String pass = usuario.getPassword();
		BCryptPasswordEncoder passEnc = new BCryptPasswordEncoder(4);
		usuario.setPassword(passEnc.encode(pass)); 
		iUsuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	} 

} 
