package ar.edu.unju.fi.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.model.RegistroTesteo;
import ar.edu.unju.fi.repository.IRegistroTesteoRepository;
import ar.edu.unju.fi.service.IRegistroTesteoService;

public class RegistroTesteoServiceImp implements IRegistroTesteoService {

	
	@Autowired
	private IRegistroTesteoRepository iRegistroTesteo;	
	
	
	@Override
	public void eliminarRegistroTesteo(Long id) {
			iRegistroTesteo.deleteById(id);
		
	}

	@Override
	public void agregarResgistroTesteo(RegistroTesteo registroTesteo) {
			iRegistroTesteo.save(registroTesteo);
		
	}

	@Override
	public Optional<RegistroTesteo> obtenerRegistroTesto(Long id) {
				return iRegistroTesteo.findById(id);
	}

	@Override
	public List<RegistroTesteo> obtenerRegistros() {
			
		return iRegistroTesteo.findAll();
	}
	
	

}
