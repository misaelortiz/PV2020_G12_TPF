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

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.imp.UsuarioServiceImp;

@Controller

public class UsuarioController {
@Autowired
private UsuarioServiceImp usuarioService ;

@Autowired
private Usuario unUsuario;

@GetMapping("/usuarioForm")
public String cargarFormulario(Model model) {
    model.addAttribute("usuarioDelForm", unUsuario);
    model.addAttribute("listaUsuarios", usuarioService.listarUsuario());
    model.addAttribute("formTab", "active");
    return "usuarioForm";
}
@PostMapping("/usuarioForm")
public String crearUsuario(@Valid @ModelAttribute("usuarioDelForm") Usuario usuario, BindingResult result,
		ModelMap model) {
	// agregado Valid (en el modelo tambien) y BindingResult
	if (result.hasErrors()) {
		// si da error el objeto recibido se vuelve a enviar a la vista
		model.addAttribute("usarioDelForm", usuario);
		model.addAttribute("formTab", "active");
	} else {
		try {
			usuarioService.agregarUsuario(usuario);
			model.addAttribute("usuarioDelForm", unUsuario);
			model.addAttribute("listTab", "active");
		} catch (Exception e) {
		
			// pasar las excepciones al html
			model.addAttribute("formUsuarioErrorMessage", e.getMessage());
			model.addAttribute("usuarioDelForm", usuario);
			model.addAttribute("listaUsuarios", usuarioService.listarUsuario());
			model.addAttribute("formTab", "active");
		}
	}
	model.addAttribute("listaUsuarios", usuarioService.listarUsuario());
	return "usuarioForm";
}
@GetMapping("/cancelar")
public String cancelarEditarUsuario(ModelMap model) {
    return "redirect:/formulario";
}

@GetMapping("/eliminarUsuario/{id}")
public String eliminarUsuario(Model model, @PathVariable(name="id") Long id) {
    try {
        usuarioService.eliminarUsuario(id);;;
    }
    catch(Exception e){
        model.addAttribute("listErrorMessage",e.getMessage());
    }
    return cargarFormulario(model);
}

@GetMapping("/editarUsuario/{id}")
public String obtenerFormularioEditarUsuario(Model model, @PathVariable(name="id") Long id) throws Exception {		
	try {
		Usuario usuarioEncontrado = usuarioService.encontrarUsuario(id);
		model.addAttribute("usuarioDelForm", usuarioEncontrado);
		model.addAttribute("editMode", "true");
	}
	catch (Exception e) {
		model.addAttribute("formUsuarioErrorMessage",e.getMessage());
		model.addAttribute("usuarioDelForm", unUsuario);
		model.addAttribute("editMode", "false");
	}				
	model.addAttribute("listaUsuarios", usuarioService.listarUsuario());		
	model.addAttribute("formTab", "active");		
	return "usuarioForm";
}

@PostMapping("/editarUsuario")
public String postEditarUsuario(@Valid @ModelAttribute("usuarioDelForm") Usuario usuario, BindingResult result, ModelMap model) {
	if(result.hasErrors()) {
		//si da error el objeto recibido se vuelve a enviar a la vista
		model.addAttribute("usuarioDelForm", usuario);			
		model.addAttribute("formTab", "active");
		model.addAttribute("editMode", "true");
	} else {
		try {
			usuarioService.modificarUsuario(usuario);
			model.addAttribute("usuarioDelForm", unUsuario);			
			model.addAttribute("listTab", "active");
			model.addAttribute("editMode", "false");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// pasar las excepciones al html
			model.addAttribute("formUsuarioErrorMessage",e.getMessage());
			model.addAttribute("usuarioDelForm", usuario);			
			model.addAttribute("formTab", "active");
			model.addAttribute("listaUsuarios", usuarioService.listarUsuario());				
			model.addAttribute("editMode", "true");
		}
	}
	model.addAttribute("listaUsuarios", usuarioService.listarUsuario());		
	return "usuarioForm";
}
}
