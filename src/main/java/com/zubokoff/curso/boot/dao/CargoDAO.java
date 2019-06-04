package com.zubokoff.curso.boot.dao;

import java.util.List;

import com.zubokoff.curso.boot.domain.Cargo;

public interface CargoDAO {

	public void save(Cargo cargo);
	
	public void update (Cargo cargo);
	
	public void delete(Long id);
	
	public Cargo findById(Long id);
	
	public List<Cargo> findAll();
}
