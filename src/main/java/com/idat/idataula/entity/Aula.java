package com.idat.idataula.entity;

import java.util.List;

public class Aula {

	List<Estudiante> listadoEstudiante;
	String aula;
	public List<Estudiante> getListadoEstudiante() {
		return listadoEstudiante;
	}
	public void setListadoEstudiante(List<Estudiante> listadoEstudiante) {
		this.listadoEstudiante = listadoEstudiante;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	
	
}
