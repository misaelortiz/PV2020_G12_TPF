package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;




import ar.edu.unju.fi.service.imp.UsuarioServiceImp;

@Controller
public class MainController {
	
@Autowired
		private UsuarioServiceImp usuarioS;

@RequestMapping("/home")
public String main(Model model) {

    return "home";
}

/*@RequestMapping("/estadios")
public String getEstadioForm(Model model) {
    return "estadios";
}
*/

@GetMapping({"/","/login"})
public String ingresar(Model model) {
    return "login";
}


}
