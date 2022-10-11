package com.safv.SAFV.Controller;

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

import com.safv.SAFV.Models.Motorista;
import com.safv.SAFV.Services.MotoristaService;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {
	
	@Autowired
	MotoristaService service;

	@GetMapping()
	public List <Motorista> getMotoristas (Integer cnh) {
		if(cnh == null) {
			return service.findAll();
		}else {
			return service.findByCnh(cnh);
		}
	}
	
	@PostMapping()
	public void postMotorista (@RequestBody Motorista motorista) {	
		service.saveMotorista(motorista);
	}
	
	@PutMapping("/{cnh}")
	public void updateMotorista (@RequestBody Motorista motorista, @PathVariable Integer cnh) {
		service.updateMotorista(motorista, cnh);
	}
	
	@DeleteMapping("/{cnh}")
	public void deleteMotorista (@PathVariable Integer cnh) {
		service.deleteVeiculo(cnh);
	}
}
