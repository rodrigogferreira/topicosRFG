package br.estacio.terenciani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.estacio.terenciani.model.Aluno;
import br.estacio.terenciani.repository.AlunoRepository;

@Controller
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
	@RequestMapping(value="/aluno", 
			method=RequestMethod.GET)
	public @ResponseBody List<Aluno> qualquerCoisa() {
		return this.alunoRepository.findAll();

	}
}
