package com.safv.SAFV.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Veiculo {

	 	@Id
	    private String placa;
	    private String fabricante;
	    private Double quilometragem;
	    private String chassi;
	    private String cor;
	    private String tipo;
	    private Integer ano;
	    private String modelo;
	    @ManyToOne
	    private Motorista motorista;
	    @JoinColumn(name = "motorista_cnh")
	  



	    public String getPlaca() {
	        return placa;
	    }

	    public void setPlaca(String placa) {
	        this.placa = placa;
	    }

	    public String getFabricante() {
	        return fabricante;
	    }

	    public void setFabricante(String fabricante) {
	        this.fabricante = fabricante;
	    }

	    public Double getQuilometragem() {
	        return quilometragem;
	    }

	    public void setQuilometragem(Double quilometragem) {
	        this.quilometragem = quilometragem;
	    }

	    public String getChassi() {
	        return chassi;
	    }

	    public void setChassi(String chassi) {
	        this.chassi = chassi;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }

	    public Integer getAno() {
	        return ano;
	    }

	    public void setAno(Integer ano) {
	        this.ano = ano;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
	        Veiculo other = (Veiculo) obj;
	        if (placa == null) {
	            if (other.placa != null)
	                return false;
	        } else if (!placa.equals(other.placa))
	            return false;
	        return true;
	    }

//	    public Motorista getMotorista() {
//	        return motorista;
//	    }
//
//	    public void setMotorista(Motorista motorista) {
//	        this.motorista = motorista;
//	    }
//	
}
