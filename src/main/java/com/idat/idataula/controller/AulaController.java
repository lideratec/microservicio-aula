package com.idat.idataula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idataula.entity.Aula;
import com.idat.idataula.service.AulaService;

@RestController
@RequestMapping("/api/aula")
public class AulaController {

	@Autowired
	private AulaService service;
	
	@GetMapping("/listar")
	public List<Aula> asignarAula(){
		return service.asignarEstudianteAula();
	}
}
