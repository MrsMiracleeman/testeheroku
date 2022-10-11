package com.safv.SAFV.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safv.SAFV.Models.Funcionario;
import com.safv.SAFV.Models.Setor;


@Repository
public interface SetorRepository extends JpaRepository <Setor, Integer> {


	
}
