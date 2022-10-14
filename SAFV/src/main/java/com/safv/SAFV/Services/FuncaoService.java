package com.safv.SAFV.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safv.SAFV.Models.Funcao;
import com.safv.SAFV.Repository.FuncaoRepository;


@Service
public class FuncaoService {

	@Autowired
	FuncaoRepository repository;
	
	
	//BUSCA TODAS AS FUNÇÕES NO BANCO DE DADOS
	public List <Funcao> findAll(){
		return repository.findAll();
	}
	
	//GRAVA NO BANCO DE DADOS UMA FUNCAO
	public void save(Funcao funcao) {
		if(repository.existsById(funcao.getId()) == false) {
			repository.save(funcao);
		}else {
			System.out.println("JA existe funcao!");
		}
	}
}
