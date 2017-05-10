package br.estacio.terenciani.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.estacio.terenciani.model.Aluno;

public interface AlunoRepository extends 
JpaRepository<Aluno, Long>{

}
