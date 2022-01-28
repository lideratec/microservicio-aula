package com.idat.idataula.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idataula.client.OpenFeignClient;
import com.idat.idataula.entity.Aula;

@Service
public class AulaServiceImpl implements AulaService {

	@Autowired
	private OpenFeignClient cliente;
	
	@Override
	public List<Aula> asignarEstudianteAula() {
		List<Aula> listarAula = new ArrayList<>();
		Aula aula = new Aula();
		aula.setAula("40G");
		aula.setListadoEstudiante(cliente.listarEstudiante());
		listarAula.add(aula);
		
		Aula aula1 = new Aula();
		aula1.setAula("70G");
		aula1.setListadoEstudiante(cliente.listarEstudiante());
		listarAula.add(aula1);
		
		return listarAula;
	}

}
