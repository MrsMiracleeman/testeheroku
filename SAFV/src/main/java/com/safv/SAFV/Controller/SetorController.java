package com.safv.SAFV.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safv.SAFV.Models.Setor;
import com.safv.SAFV.Services.SetorService;

@RestController
@RequestMapping("/setor")
public class SetorController {
	
	@Autowired
	SetorService services;

	@GetMapping()
	public List <Setor> getAll(){
		
		return services.findAll();
	}

	
	@PostMapping()
	public void postSetor(@RequestBody Setor setor) {
		
		services.save(setor);
	}
}
