package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class AtividadesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AtividadesApplication.class, args);
	}
	
	@RequestMapping("/")
	public String atividades(){
		return "redirect:/atividades";
	}
}
