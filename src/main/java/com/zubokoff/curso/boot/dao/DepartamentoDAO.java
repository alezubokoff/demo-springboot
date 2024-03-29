package com.zubokoff.curso.boot.dao;

import java.util.List;

import com.zubokoff.curso.boot.domain.Departamento;

public interface DepartamentoDAO {

	public void save(Departamento departamento);
	
	public void update (Departamento departamento);
	
	public void delete(Long id);
	
	public Departamento findById(Long id);
	
	public List<Departamento> findAll();
}
