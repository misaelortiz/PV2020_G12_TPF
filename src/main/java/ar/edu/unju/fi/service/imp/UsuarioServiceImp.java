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
		
		
		return iUsuarioRepository.findAll();
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) throws Exception {
		Usuario usuarioMod = encontrarUsuario(usuario.getId());
		mapearUsuario(usuario,usuarioMod);
		return iUsuarioRepository.save(usuarioMod);
	}
	public void mapearUsuario(Usuario desde, Usuario hacia) {
        hacia.setNombreUsuario(desde.getNombreUsuario());
        hacia.setNombreReal(desde.getNombreReal());
        hacia.setApellidoReal(desde.getApellidoReal());
        hacia.setTipoUsuario(desde.getTipoUsuario());
  
    }
	@Override
	public Usuario encontrarUsuario(Long id) throws Exception {
		
		return iUsuarioRepository.findById(id).orElseThrow(()-> new Exception("El Usuario no Existe"));
	} 

} 
