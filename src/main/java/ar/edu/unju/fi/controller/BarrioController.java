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
import ar.edu.unju.fi.service.IBarrioService;

@Controller
public class BarrioController {
	
	@Autowired
	private IBarrioService barrioService;
	
	private Barrio unbarrio;
	
	@GetMapping("/barrio")
	public String cargarFormulario(Model model) {
		model.addAttribute("barrioForm", unbarrio);
		model.addAttribute("listaBarrios", barrioService.listarBarrios());		
		return "usuarioForm";
	}
	
/*	@PostMapping("/barrio")
	public String crearUsuario(@Valid @ModelAttribute("usuarioDelForm") Barrio barrio, BindingResult result,
			ModelMap model) {
		// agregado Valid (en el modelo tambien) y BindingResult
		if (result.hasErrors()) {
			// si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("barrioForm", barrio);			
		}
		else{
			try{
				barrioService.crear(barrio);
				model.addAttribute("barrioForm", unbarrio);				
			}
			catch (Exception e){				
				model.addAttribute("formUsuarioErrorMessage", e.getMessage());
				model.addAttribute("barrioForm", barrio);
				model.addAttribute("listaBarrios", barrioService.listarBarrios());				
			}
		}
		model.addAttribute("listaBarrios", barrioService.listarBarrios());
		return "barrio";
	}
	
	
	@GetMapping("/barrio/editarBarrio/{id}")
	public String obtenerFormularioEditarBarrio(Model model, @PathVariable(name="id") Long id) throws Exception {		
		try {
			Barrio barrioEncontrado = barrioService.encontrarBarrio(id);
			model.addAttribute("barrioForm", barrioEncontrado);
			model.addAttribute("editMode", "true");
		}
		catch (Exception e) {
			model.addAttribute("formUsuarioErrorMessage",e.getMessage());
			model.addAttribute("barrioForm", unbarrio);
			model.addAttribute("editMode", "false");
		}				
		model.addAttribute("listaUsuarios", barrioService.listarBarrios());				
		return "barrio";
	}
	
	@PostMapping("/barrio")
	public String postEditarUsuario(@Valid @ModelAttribute("barrioForm") Barrio barrio, BindingResult result, ModelMap model) throws Exception {
		if(result.hasErrors()) {
			//si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("barrioForm", barrio);			
			model.addAttribute("editMode", "true");
		}
		else {
			
				barrioService.modificar(barrio);
				model.addAttribute("barrioForm", unbarrio);				
				model.addAttribute("editMode", "false");
			
		}
		model.addAttribute("listaUsuarios", barrioService.listarBarrios());		
		return "usuarioForm";
	}
	
	@GetMapping("/barrio")
	public String cancelarEditarBarrio(ModelMap model) {
		return "redirect:/formulario";
	}
	
	
	@GetMapping("/barrio/eliminarBarrio/{id}")
	public String eliminarUsuario(Model model, @PathVariable(name="id") Long id) {
		try {
			barrioService.eliminar(id);;
		}
		catch(Exception e){
			model.addAttribute("listErrorMessage",e.getMessage());
		}			
		return cargarFormulario(model);
	}
*/
}
