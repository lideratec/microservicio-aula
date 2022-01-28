package com.idat.idataula.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.idataula.entity.Estudiante;

@FeignClient(name="idat-estudiante", url="localhost:59325")
public interface OpenFeignClient {

	
	@GetMapping("/api/estudiante/listar")
	public List<Estudiante> listarEstudiante();
	
	
}
