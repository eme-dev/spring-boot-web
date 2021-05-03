package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

	@GetMapping("/string/{texto}")
	public String variable(@PathVariable String texto, Model model) {
		
		model.addAttribute("titulo", "Recibir parametros de la ruta request URL");
		model.addAttribute("resultado", "Texto enviado: "+texto);
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String variable(@PathVariable String texto,@PathVariable Integer numero, Model model) {
		
		model.addAttribute("titulo", "Recibir parametros de la ruta request URL");
		model.addAttribute("resultado", "Texto enviado: "+texto + " Numero:" +numero );
		return "variables/ver";
	}
	
}
