package com.safv.SAFV.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safv.SAFV.Models.Funcao;


@Repository
public interface FuncaoRepository extends JpaRepository <Funcao, Integer>{

}
