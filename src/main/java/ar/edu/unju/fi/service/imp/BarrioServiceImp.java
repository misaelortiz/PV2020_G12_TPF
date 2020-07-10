package ar.edu.unju.fi.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Barrio;
import ar.edu.unju.fi.repository.IBarrioRepository;
import ar.edu.unju.fi.service.IBarrioService;

@Service
public class BarrioServiceImp implements IBarrioService {
	/**
	 * Se inyecta la clase IBarrioRepository 
	 * para el uso de sus metodos.
	 * 
	 */
	@Autowired
	private IBarrioRepository iBarrioRepository;
	/**
	 * Metodo para guardar un barrio
	 * 
	 */
	
	public void crear(Barrio unBarrio) {
		iBarrioRepository.save(unBarrio);

	}

	/**
	 * 
	 * 
	 * 
	 */
	public Barrio modificar(Barrio unBarrio) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * Metodo para eliminar un barrio
	 * 
	 */
	public void eliminar(Long id) {
		iBarrioRepository.deleteById(id);

	}
	/**
	 * 
	 * Metodo para listar los barrios 
	 * guardados
	 * 
	 */
	public Iterable<Barrio> listarBarrios() {
		
		return iBarrioRepository.findAll();
	}

	/**
	 * 
	 * Metodo que encuentra un barrio por su ID.
	 * 
	 */
	public Optional<Barrio> encontrarBarrio(Long id) throws Exception {
		
		return iBarrioRepository.findById(id);
	}

}
