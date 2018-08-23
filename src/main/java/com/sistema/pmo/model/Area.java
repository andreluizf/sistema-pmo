package com.sistema.pmo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AREA")
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "STATUS")
	private Boolean status;
	@OneToMany(mappedBy="area")
	private List<Projeto> projetos;

	public Area() {
		// TODO Auto-generated constructor stub
	}

	public Area(String nome, Boolean status) {
		this.nome = nome;
		this.status = status;

	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Boolean getStatus() {
		return status;
	}

}
