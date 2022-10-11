package com.safv.SAFV.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safv.SAFV.Models.Viagem;
import com.safv.SAFV.Services.ViagemService;

@RestController
@RequestMapping("/viagens")
public class ViagemController {

	@Autowired
	ViagemService service;
	
	@GetMapping()
	public List <Viagem> getViagens (Integer id){
		if(id == null) {
			return service.findAll();
		}else {
			return (List<Viagem>) service.findById(id);
		}	
	}
	
	@PostMapping()
	public void postViagens (@RequestBody Viagem viagem) {
		
		service.saveViagem(viagem);
	}
	
	
	
}
