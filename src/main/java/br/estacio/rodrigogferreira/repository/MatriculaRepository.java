package br.estacio.rodrigogferreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.estacio.rodrigogferreira.model.Matricula;

public interface MatriculaRepository extends 
JpaRepository<Matricula, Long>{

}
