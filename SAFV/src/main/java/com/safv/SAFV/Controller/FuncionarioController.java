package com.safv.SAFV.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safv.SAFV.Dtos.FuncionarioDTO;
import com.safv.SAFV.Models.Funcionario;
import com.safv.SAFV.Models.Setor;
import com.safv.SAFV.Repository.SetorRepository;
import com.safv.SAFV.Services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	FuncionarioService service;
	
//	@GetMapping()
//	public List <Funcionario> getFuncionarios(Integer matricula) {
//	
//		if(matricula == null) {
//			return service.findAll();
//		}else {
//			return service.findByMatricula(matricula);
//		}
//		
//	}
	@GetMapping
	public List <Funcionario> get() {
		
		List minha = new ArrayList <Funcionario> ();
		
		minha = service.findAll();
		
		return minha;
	}
	
	@GetMapping("/{cpf}")
	public Funcionario getFuncionario(@PathVariable String cpf) {
		
		return service.findByCpf(cpf);
	}
	
	@PostMapping()
	public void postFuncionario (@RequestBody Funcionario funcionario) {
		
		service.save(funcionario);
	}
	
	@DeleteMapping("/{matricula}")
	public void deleteFuncionario (@PathVariable Integer matricula) {
		
		service.delete(matricula);
	}
	
	@PutMapping ("/{matricula}")
	public void updateFuncionario (@PathVariable Integer matricula, @RequestBody FuncionarioDTO funcionarioForm) {
		
		service.update(matricula, funcionarioForm);
	}
}
