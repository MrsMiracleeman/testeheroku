package com.safv.SAFV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safv.SAFV.Models.Funcionario;


@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {

	Funcionario findByCpf(String cpf);
	List <Funcionario> findByMatricula (Integer matricula);
	
}
