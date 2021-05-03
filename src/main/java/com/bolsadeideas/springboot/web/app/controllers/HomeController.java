package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class HomeController {

	@GetMapping(value = {"/index","","/","/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Bienvenido a spring boot");
		model.addAttribute("msg", "Bienvenido con MODEL");
		
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario= new Usuario();
		usuario.setNombre("Juan");
		usuario.setApellido("Perez");
		usuario.setEmail("emarchena@synopsis.ws");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo", "Listado de Usuarios");
		return "Listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios= new ArrayList<>();
		usuarios.add(new Usuario("Andres","Guzman","guzman@correo.com"));
		usuarios.add(new Usuario("Juan","Perez","jperez@correo.com"));
		usuarios.add(new Usuario("Julio","Perez","jperez@correo.com"));
		return usuarios;
	}
	
	
}
