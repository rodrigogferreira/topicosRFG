package br.estacio.rodrigogferreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.estacio.rodrigogferreira.model.Aluno;

public interface AlunoRepository extends 
JpaRepository<Aluno, Long>{

}
