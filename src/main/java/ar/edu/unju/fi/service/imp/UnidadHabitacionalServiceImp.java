package ar.edu.unju.fi.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.UnidadHabitacional;

import ar.edu.unju.fi.service.IUnidadHabitacionalService;


@Service

public class UnidadHabitacionalServiceImp implements IUnidadHabitacionalService {
@Autowired
	@Override
	public void crear(UnidadHabitacional unaUnidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UnidadHabitacional modificar(UnidadHabitacional unUsuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String domicilio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<UnidadHabitacional> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UnidadHabitacional encontrarUsuario(String domicilio) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Se inyecta la clase IUnidadHabitacionalRepository 
	 * para el uso de sus metodos.
	 * 
	 */
	
	
}