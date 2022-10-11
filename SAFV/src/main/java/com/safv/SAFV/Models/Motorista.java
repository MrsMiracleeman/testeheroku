package com.safv.SAFV.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Motorista {

	@Id
    private Integer cnh;
    private String categoria;
    private String nome;
	private String sobrenome;
    private String cpf;
    private String dataNascimento;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private Integer cep;
    private String email;

    @OneToMany(mappedBy = "motorista", cascade = CascadeType.ALL)
//    public List<Veiculo> veiculos = new ArrayList<>();

    public Integer getCnh() {
        return cnh;
    }

    public void setCnh(Integer cnh) {
        this.cnh = cnh;
    }

    @Override
	public String toString() {
		return "Motorista [cnh=" + cnh + ", categoria=" + categoria + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", cpf=" + cpf + "]";
	}

	public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cnh == null) ? 0 : cnh.hashCode());
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
        Motorista other = (Motorista) obj;
        if (cnh == null) {
            if (other.cnh != null)
                return false;
        } else if (!cnh.equals(other.cnh))
            return false;
        return true;
    }

}
