package com.safv.SAFV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safv.SAFV.Models.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository <Motorista, Integer> {

	public List <Motorista> findByCnh(Integer cnh);
	
}
