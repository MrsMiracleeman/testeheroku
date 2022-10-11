package com.safv.SAFV.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safv.SAFV.Models.Viagem;


@Repository
public interface ViagemRepository extends JpaRepository <Viagem, Integer>{

	

}
