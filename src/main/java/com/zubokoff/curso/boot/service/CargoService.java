package com.zubokoff.curso.boot.service;

import java.util.List;

import com.zubokoff.curso.boot.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	void editar(Cargo cargo);
	void excluir(Long id);
	Cargo buscarPorId(Long id);
	List<Cargo> buscarTodos();
}
