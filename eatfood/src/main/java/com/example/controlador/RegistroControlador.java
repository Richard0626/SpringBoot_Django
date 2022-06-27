package com.example.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.servicio.CategoriaServicio;
import com.example.servicio.ComidaServicio;


@Controller
public class RegistroControlador {
	@Autowired
	private ComidaServicio servicio;
	@Autowired
	private CategoriaServicio service;
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("comidas",servicio.listarComidas());
		modelo.addAttribute("categorias",service.listarCategorias());
		return "index";
	}
	@GetMapping("/contactanos")
	public String verPaginaContactanos(Model modelo) {
		modelo.addAttribute("comidas",servicio.listarComidas());
		modelo.addAttribute("categorias",service.listarCategorias());
		return "contactanos";
	}
	@GetMapping("/about")
	public String verPaginaAbout(Model modelo) {
		modelo.addAttribute("comidas",servicio.listarComidas());
		modelo.addAttribute("categorias",service.listarCategorias());
		return "about";
	}

}