package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.imp.UsuarioServiceImp;

@Controller
public class MainController {
	
//@Autowired
		//private UsuarioServiceImp usuarioS;

@RequestMapping ("/login")
public String main (Model model) {
	
	return "login";
	
}
}
