package com.safv.SAFV.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Viagem {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String data;
	    private String localPartida;
	    private String localDestino;

	
	    
//	    @OneToMany
//	    List<Funcionario> funcionarios = new ArrayList<>();
//	    @OneToMany
//	    List<Veiculo> veiculos = new ArrayList<>();
//	    @OneToMany
//	    List<Motorista> motoristas = new ArrayList<>();

//	    public List<Funcionario> getFuncionarios() {
//			return funcionarios;
//		}
//
//		public void setFuncionarios(List<Funcionario> funcionarios) {
//			this.funcionarios = funcionarios;
//		}
//
//		public List<Veiculo> getVeiculos() {
//			return veiculos;
//		}
//
//		public void setVeiculos(List<Veiculo> veiculos) {
//			this.veiculos = veiculos;
//		}
//
//		public List<Motorista> getMotoristas() {
//			return motoristas;
//		}
//
//		public void setMotoristas(List<Motorista> motoristas) {
//			this.motoristas = motoristas;
//		}

		public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getData() {
	        return data;
	    }

	    public void setData(String data) {
	        this.data = data;
	    }

	    public String getLocalPartida() {
	        return localPartida;
	    }

	    public void setLocalPartida(String localPartida) {
	        this.localPartida = localPartida;
	    }

	    public String getLocalDestino() {
	        return localDestino;
	    }

	    public void setLocalDestino(String localDestino) {
	        this.localDestino = localDestino;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((id == null) ? 0 : id.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Viagem other = (Viagem) obj;
	        if (id == null) {
	            if (other.id != null)
	                return false;
	        } else if (!id.equals(other.id))
	            return false;
	        return true;
	    }

}
