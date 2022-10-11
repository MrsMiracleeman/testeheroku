package com.safv.SAFV.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safv.SAFV.Models.Motorista;
import com.safv.SAFV.Models.Veiculo;
import com.safv.SAFV.Repository.MotoristaRepository;

@Service
public class MotoristaService {

	@Autowired
	MotoristaRepository repository;
	
	
	//BUSCA TODOS OS MOTORISTAS
	public List <Motorista> findAll(){	
		return repository.findAll();
	}
	
	//BUSCA O MOTORISTA PASSANDO CNH COMO PARÂMETRO
	public List <Motorista> findByCnh(Integer cnh) {
		return repository.findByCnh(cnh);
	}
	
	//GRAVA UM MOTORISTA NO BANCO DE DADOS
	public void saveMotorista(Motorista motorista) {	
		if(repository.existsById(motorista.getCnh()) == false) {
			repository.save(motorista);
		}else {
			System.out.println("CNH ja existe");
		}

	}
	
	//UPDATE DE UM MOTORISTA
	public void updateMotorista(Motorista motorista, Integer cnh) {
		Motorista mot = repository.getReferenceById(cnh);
		mot.setCategoria(motorista.getCategoria());
		mot.setNome(motorista.getNome());
		mot.setSobrenome(motorista.getSobrenome());
		mot.setCpf(motorista.getCpf());
		mot.setDataNascimento(motorista.getDataNascimento());
		mot.setLogradouro(motorista.getLogradouro());
		mot.setNumero(motorista.getNumero());
		mot.setComplemento(motorista.getComplemento());
		mot.setCep(motorista.getCep());
		mot.setEmail(motorista.getEmail());
		repository.save(mot);
	}

	//DELETA UM MOTORISTA
	public void deleteVeiculo(Integer cnh) {	
		repository.deleteById(cnh);
		
	}
	
	
}
