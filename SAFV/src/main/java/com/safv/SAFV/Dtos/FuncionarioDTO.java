package com.safv.SAFV.Dtos;

import com.safv.SAFV.Models.Funcao;
import com.safv.SAFV.Models.Setor;

public class FuncionarioDTO {
	
	private Funcao funcao;
	private Setor setor;
	private String nome;
	private String sobrenome;
	private String teste;
	
	
	public Funcao getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
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
	
	
	
}
