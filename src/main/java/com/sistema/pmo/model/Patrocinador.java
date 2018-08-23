package com.sistema.pmo.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PATROCINADOR")
public class Patrocinador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Embedded
	private Pessoa pessoa;
	@OneToMany(mappedBy="patrocinador")
	private List<Projeto> projetos;

	public Patrocinador() {
		// TODO Auto-generated constructor stub
	}

	public Patrocinador(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}
