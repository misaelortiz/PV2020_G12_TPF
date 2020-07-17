package ar.edu.unju.fi.service.imp;

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

	@Override
	public void crear(Barrio unBarrio) {
		iBarrioRepository.save(unBarrio);
		
	}

	@Override
	public Barrio modificar(Barrio unBarrio) throws Exception {
		Barrio barrioMod = encontrarBarrio(unBarrio.getId());
		mapearBarrio(unBarrio,barrioMod);
		return iBarrioRepository.save(barrioMod);
	}

	@Override
	public void eliminar(Long id) {
		iBarrioRepository.deleteById(id);
		
	}

	@Override
	public Iterable<Barrio> listarBarrios() {
		
		return iBarrioRepository.findAll();
	}

	@Override
	public Barrio encontrarBarrio(Long id) throws Exception {
		
		return iBarrioRepository.findById(id).orElseThrow(()-> new Exception("El Barrio no Existe"));
	}
	
	public void mapearBarrio(Barrio desde, Barrio hacia) {
        hacia.setNombre(desde.getNombre());
       
    }

}
