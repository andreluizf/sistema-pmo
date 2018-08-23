package com.sistema.pmo.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="GERENTE_PROJETOS")
public class GerenteProjetos {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
		name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator"
	)
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	@Embedded
	private Pessoa pessoa;

	public GerenteProjetos() {
		// TODO Auto-generated constructor stub
	}

	public GerenteProjetos(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

}
