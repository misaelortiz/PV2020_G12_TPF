package ar.edu.unju.fi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.model.Barrio;
import ar.edu.unju.fi.service.imp.BarrioServiceImp;

@Controller
public class BarrioController {
	
@Autowired
	private BarrioServiceImp barrioService;
@Autowired	
	private Barrio unBarrio;
	
	@GetMapping("/barrio")
	public String cargarFormulario(Model model) {
		model.addAttribute("barrioDelForm", unBarrio);
		model.addAttribute("listaBarrios", barrioService.listarBarrios());	
		 model.addAttribute("formTab", "active");
		return "barrio";
	}
	

	@PostMapping("/barrio")
	public String crearBarrio(@Valid @ModelAttribute("barrioDelForm") Barrio barrio, BindingResult result,
			ModelMap model) {
		// agregado Valid (en el modelo tambien) y BindingResult
		if (result.hasErrors()) {
			// si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("barrioDelForm", barrio);			
		}
		else{
			try{
				barrioService.crear(barrio);
				model.addAttribute("barrioDelForm", unBarrio);				
			}
			catch (Exception e){				
				model.addAttribute("formUsuarioErrorMessage", e.getMessage());
				model.addAttribute("barrioDelForm", barrio);
				model.addAttribute("listaBarrios", barrioService.listarBarrios());				
			}
		}
		model.addAttribute("listaBarrios", barrioService.listarBarrios());
		return "barrio";
	}
	
	
	@GetMapping("/editarBarrio/{id}")
	public String obtenerFormularioEditarBarrio(Model model, @PathVariable(name="id") Long id) throws Exception {		
		try {
			Barrio barrioEncontrado = barrioService.encontrarBarrio(id);
			model.addAttribute("barrioDelForm", barrioEncontrado);
			model.addAttribute("editMode", "true");
		}
		catch (Exception e) {
			model.addAttribute("formUsuarioErrorMessage",e.getMessage());
			model.addAttribute("barrioDelForm", unBarrio);
			model.addAttribute("editMode", "false");
		}				
		model.addAttribute("listaBarrios", barrioService.listarBarrios());				
		return "barrio";
	}
	/**
	 * 
	 * NO LOGRAMOS ENCONTRAR EL ERROR
	 * @param barrio
	 * @param result
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/editarBarrio")
	public String postEditarBarrio(@Valid @ModelAttribute("barrioDelForm") Barrio barrio, BindingResult result, ModelMap model) throws Exception {
		if(result.hasErrors()) {
			//si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("barrioDelForm",barrio);			
			model.addAttribute("editMode", "true");
		}
		else {
			try {
				barrioService.modificar(barrio);
				model.addAttribute("barrioDelForm", unBarrio);				
				model.addAttribute("editMode", "false");
			} catch (Exception e) {
				
				model.addAttribute("barrioDelForm", unBarrio);	
			}
				
			
		}
		model.addAttribute("listaBarrios", barrioService.listarBarrios());		
		return "barrio";
	}

	/*@GetMapping("/cancelar")
	public String cancelarEditarBarrio(ModelMap model) {
		return "redirect:/barrio";
	}
	*/
	@GetMapping("/eliminarBarrio/{id}")
	public String eliminarBarrio(Model model, @PathVariable(name="id") Long id) {
		try {
			barrioService.eliminar(id);
		}
		catch(Exception e){
			model.addAttribute("listErrorMessage",e.getMessage());
		}			
		return cargarFormulario(model);
	}

}
