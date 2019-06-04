package com.zubokoff.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.zubokoff.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDAOImpl extends AbstractDAO<Funcionario, Long> implements FuncionarioDAO {

}
