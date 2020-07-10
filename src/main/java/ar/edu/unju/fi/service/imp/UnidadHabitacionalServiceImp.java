package ar.edu.unju.fi.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.UnidadHabitacional;
import ar.edu.unju.fi.repository.IUnidadHabitacionalRepository;
import ar.edu.unju.fi.service.IUnidadHabitacionalService;


@Service

public class UnidadHabitacionalServiceImp implements IUnidadHabitacionalService {
	/**
	 * Se inyecta la clase IUnidadHabitacionalRepository 
	 * para el uso de sus metodos.
	 * 
	 */
	@Autowired

	private IUnidadHabitacionalRepository iUnidadHabitacionalRepository;
	
	
	@Override
	
	public void crear(UnidadHabitacional unaUnidad) {
		iUnidadHabitacionalRepository.save(unaUnidad);
	}

	@Override
	public UnidadHabitacional modificar(UnidadHabitacional unUsuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		iUnidadHabitacionalRepository.deleteById(id);
		
	}

	@Override
	public Iterable<UnidadHabitacional> listarTodos() {
		return iUnidadHabitacionalRepository.findAll();
		
	}

	@Override
	public Optional<UnidadHabitacional> encontrarUsuario(Long id) throws Exception {
		
		return iUnidadHabitacionalRepository.findById(id);

	}
	
}