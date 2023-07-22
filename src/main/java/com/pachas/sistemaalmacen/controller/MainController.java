package com.pachas.sistemaalmacen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class MainController {
	@GetMapping("/categorias")
    public String getCategorias(Model model) {
		return "categorias";
	}
	
	@GetMapping("/articulos")
    public String getArticulos(Model model) {
		return "articulos";
	}
	
	@GetMapping("/roles")
    public String getRoles(Model model) {
		return "roles";
	}
}
