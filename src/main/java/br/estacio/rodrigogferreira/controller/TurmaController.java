package br.estacio.rodrigogferreira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.estacio.rodrigogferreira.model.Turma;
import br.estacio.rodrigogferreira.repository.TurmaRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TurmaController {

	@Autowired
	TurmaRepository turmaRepository;
	
	@RequestMapping(value="/turma",
			method=RequestMethod.GET)
	public @ResponseBody List<Turma> listarTodos() {
		return this.turmaRepository.findAll();

	}
	
	@RequestMapping(value="/turma/{id}", 
			method=RequestMethod.DELETE)
	public @ResponseBody HttpStatus excluir(@PathVariable Long id){
		try{
			this.turmaRepository.delete(id);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	} 
	
	@RequestMapping(value="/turma", 
			method=RequestMethod.POST, 
                        consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Turma adicionar(@RequestBody Turma turma){
		return this.turmaRepository.save(turma);
	}
}
