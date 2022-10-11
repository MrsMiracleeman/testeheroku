package com.safv.SAFV.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safv.SAFV.Dtos.FuncionarioDTO;
import com.safv.SAFV.Models.Funcionario;
import com.safv.SAFV.Repository.FuncionarioRepository;
import com.safv.SAFV.Repository.SetorRepository;


@Service
public class FuncionarioService {

	@Autowired
	FuncionarioRepository repository;
	
	
	//BUSCA TODOS OS FUNCIONÁRIOS E RETORNA UMA LISTA
	public List <Funcionario> findAll(){

		return repository.findAll();
	}
	
	//BUSCA UM FUNCIONARIO PASSANDO A MATRÍCULA COMO PARÂMETRO E RETORNA APENAS O FUNCIONARIO COM AQUELA MATRICULA
	public List <Funcionario> findByMatricula (Integer matricula) {
		
		return repository.findByMatricula(matricula);
	}
	
	
	
	//BUSCA UM FUNCIONÁRIO PASSANDO O CPF COMO PARÂMETRO E RETORNA APENAS O FUNCIONÁRIO COM AQUELE CPF DE PARÂMETRO
	public Funcionario findByCpf(String cpf) {
		
		return repository.findByCpf(cpf);
	}
	
	//GRAVA UM FUNCIONARIO NO BANCO DE DADOS
	public void save (Funcionario funcionario) {
		
		repository.save(funcionario);
	}
	
	//DELETAR UM FUNCIONARIO NO BANCO DE DADOS PASSANDO A MATRÍCULA COMO PARÂMETRO
	public void delete (Integer matricula) {
		
		repository.delete(repository.findByMatricula(matricula).get(0));
		
	}
	
	//UPDATE DE UM FUNCIONARIO
	public void update (Integer matricula, FuncionarioDTO form) {
		
		Funcionario fun = repository.getReferenceById(matricula);
		fun.setNome(form.getNome());
		fun.setSetor(form.getSetor());
		fun.setSobrenome(form.getSobrenome());
		fun.setFuncao(form.getFuncao());
		
		repository.save(fun);
		
	}
}
