package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.model.Atividade;
import com.ms.repository.Atividades;

@Controller
@RequestMapping("/atividades")
public class AtividadesController {
	
	@Autowired
	private Atividades atividades;
	
	@GetMapping
	public ModelAndView novo(){
		
		ModelAndView mv = new ModelAndView("CadastroDeAtividades","atividade", new Atividade());
		mv.addObject("atividades", atividades.findAll());
		return mv;
		
	}
	
	@PostMapping
	public String salvar(Atividade atividade){
		
		atividades.save(atividade);
		return "redirect:/atividades";
		
	}
	
}
