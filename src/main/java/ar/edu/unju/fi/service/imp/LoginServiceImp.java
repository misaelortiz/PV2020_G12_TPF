package ar.edu.unju.fi.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuarioRepository;

@Service
public class LoginServiceImp implements UserDetailsService {

	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//	Usuario usuarioEncontrado = iUsuarioRepository.findByUserName(username).orElseThrow(()-> new UsernameNotFoundException("Login Invalido"));
			//List <>
			
			return null  ;
	}

}
