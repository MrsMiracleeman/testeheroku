package com.safv.SAFV.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safv.SAFV.Models.Motorista;
import com.safv.SAFV.Models.Setor;
import com.safv.SAFV.Repository.SetorRepository;

@Service
public class SetorService {

		@Autowired
		SetorRepository repository;
		
		
		//LISTA TODOS OS SETORES EXISTENTS NO BANCO DE DADOS
		public List <Setor> findAll(){
			return repository.findAll();
		}
		
		//GRAVA UM SETOR NO BANCO DE DADOS
		public void save(Setor setor) {
			if(repository.existsById(setor.getId()) == false) {
				repository.save(setor);
			}else {
				System.out.println("Setor ja existe");
			}
		}
		
		
		
}
