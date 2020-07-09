package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Rol;
import ar.edu.unju.fi.repository.IRolRepository;
import ar.edu.unju.fi.service.IRolService;

@Service
public class RolServiceImp implements IRolService{
	/**
	 * Se inyecta la clase IRolRepository 
	 * para el uso de sus metodos.
	 * 
	 */
	@Autowired
	private IRolRepository iRolRepository;
	
	
	/**
	 * Metodo para eliminar rol
	 * 
	 */
	
	@Override
	public void eliminarRol(Long id) {
		iRolRepository.deleteById(id);
		
	}

	/**
	 * Metodo que guarda un rol
	 * 
	 */
	@Override
	public void guardarRol(Rol r) {
		iRolRepository.save(r);
		
	}

	/**
	 * Metodo que retorna la lista de roles.
	 * 
	 */
	@Override
	public List<Rol> obtenerRoles() {
		
		return iRolRepository.findAll();
	}


}
