package com.safv.SAFV.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safv.SAFV.Models.Funcao;
import com.safv.SAFV.Services.FuncaoService;



@RestController
@RequestMapping("/funcao")
public class FuncaoController {

	@Autowired
	FuncaoService services;
	
	@GetMapping()
	public List <Funcao> getAll(){
		return services.findAll();
	}
	
	@PostMapping()
	public void postFuncao(@RequestBody Funcao funcao) {
		services.save(funcao);
	}
	
}
