package com.safv.SAFV.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safv.SAFV.Models.Funcionario;
import com.safv.SAFV.Models.Veiculo;
import com.safv.SAFV.Repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	VeiculoRepository repository;
	
	//BUSCA TODOS OS VEÍCULOS E RETORNA UMA LISTA
	public List <Veiculo> findAll(){
		
		return repository.findAll();
	}
	
	//BUSCA UM VEICULO PASSANDO A PLACA COMO PARÂMETRO E RETORNA APENAS O VEÍCULO COM AQUELA PLACA
	public List <Veiculo> findByPlaca (String placa) {
		
		return repository.findByPlaca(placa);
	}
	
	//BUSCA TODOS OS VEICULOS PELO TAMANHO
	public List <Veiculo> findByTipo(String tipo){
		
		return repository.findByTipo(tipo);
	}
	
	//SALVA UM VEICULO NO BANCO DE DADOS
	public void saveVeiculo (Veiculo veiculo) {
		
		repository.save(veiculo);
	}
	
	//DELETA UM VEICULO PASSANDO A PLACA COMO PARÂMETRO
	public void deleteVeiculo(String placa) {
		
		repository.delete(repository.getReferenceById(placa));
		
	}

	//UPDATE DO VEÍCULO
	public void updateVeiculo(String placa, Veiculo veiculo) {	
		Veiculo vec = repository.getReferenceById(placa);
		vec.setTipo(veiculo.getTipo());
		vec.setAno(veiculo.getAno());
		vec.setCor(veiculo.getCor());
		vec.setChassi(veiculo.getChassi());	
		repository.save(vec);	
	}
	
	//BUSCA TODOS OS VEICULOS DE UM MOTORISTA
	public List <Veiculo> veiculosPorMotorista (Integer idMotorista){
		
		return repository.findByMotoristaCnh(idMotorista);
	}
	
}
