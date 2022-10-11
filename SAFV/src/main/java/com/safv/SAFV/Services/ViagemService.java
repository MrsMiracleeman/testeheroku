package com.safv.SAFV.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safv.SAFV.Models.Viagem;
import com.safv.SAFV.Repository.ViagemRepository;

@Service
public class ViagemService {

	@Autowired
	ViagemRepository repository;

	// BUSCA TODAS AS VIAGENS
	public List <Viagem> findAll() {	
		return repository.findAll();
	}
	
	//BUSCA A VIAGEM PELO O ID
	public Viagem findById(Integer id){
		
		return repository.getReferenceById(id);
	}
	
	//GRAVA UMA VIAGEM NO BANCO DE DADOS
	public void saveViagem (Viagem viagem) {
		
//		System.out.println(viagem.getMotoristas());
		repository.save(viagem);
	}
	
}
