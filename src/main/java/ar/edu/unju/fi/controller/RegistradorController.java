package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RegistradorController {
	@RequestMapping("/registrador")
	public String main(Model model) {

	    return "registrador";
	}
}
