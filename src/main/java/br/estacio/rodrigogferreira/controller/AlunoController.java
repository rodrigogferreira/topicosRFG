package br.estacio.rodrigogferreira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.estacio.rodrigogferreira.model.Aluno;
import br.estacio.rodrigogferreira.repository.AlunoRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
	@RequestMapping(value="/aluno", 
			method=RequestMethod.GET)
	public @ResponseBody List<Aluno> listarTodos() {
		return this.alunoRepository.findAll();

	}
	
	@RequestMapping(value="/aluno/{id}", 
			method=RequestMethod.DELETE)
	public @ResponseBody HttpStatus excluir(@PathVariable Long id){
		try{
			this.alunoRepository.delete(id);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
        
      
	
	@RequestMapping(value="/aluno", 
			method=RequestMethod.POST, 
                        consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Aluno adicionar(@RequestBody Aluno aluno){
		return this.alunoRepository.save(aluno);
	}
        
        /*
	@RequestMapping(value="/aluno", 
			method=RequestMethod.GET)
	public void listarPorId(Long id){
		this.alunoRepository.findOne(id);
	}
	@RequestMapping(value="/aluno", 
			method=RequestMethod.PUT)
	public void atualizar(Aluno aluno){
		this.alunoRepository.save(aluno);
	}*/
}
