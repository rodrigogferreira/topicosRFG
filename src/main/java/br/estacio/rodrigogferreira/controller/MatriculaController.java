package br.estacio.rodrigogferreira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.estacio.rodrigogferreira.model.Matricula;
import br.estacio.rodrigogferreira.repository.MatriculaRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MatriculaController {

	@Autowired
	MatriculaRepository MatriculaRepository;
	
	@RequestMapping(value="/Matricula", 
			method=RequestMethod.GET)
	public @ResponseBody List<Matricula> listarTodos() {
		return this.MatriculaRepository.findAll();

	}
	
	@RequestMapping(value="/Matricula/{id}", 
			method=RequestMethod.DELETE)
	public @ResponseBody HttpStatus excluir(@PathVariable Long id){
		try{
			this.MatriculaRepository.delete(id);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
        
      
	
	@RequestMapping(value="/Matricula", 
			method=RequestMethod.POST, 
                        consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Matricula adicionar(@RequestBody Matricula Matricula){
		return this.MatriculaRepository.save(Matricula);
	}
}
