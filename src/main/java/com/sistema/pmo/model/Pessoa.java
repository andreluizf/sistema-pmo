package com.sistema.pmo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Pessoa {
	
	private String nome;
	private String telefone;
	private Boolean status;

	public Pessoa(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
