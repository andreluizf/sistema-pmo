package com.sistema.pmo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROJETO")
public class Projeto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="NOME")
	private String nome;
	@ManyToOne
	@JoinColumn(name="area_id")
	private Area area;
	@ManyToOne
	@JoinColumn(name="patrocinador_id")
	private Patrocinador patrocinador;
	@ManyToOne
	@JoinColumn(name="gp_id")
	private GerenteProjetos gerenteProjetos;
	
	public Projeto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Projeto(String nome, Area area) {
		super();
		this.nome = nome;
		this.area = area;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	
	public Patrocinador getPatrocinador() {
		return patrocinador;
	}
	
	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}
	
	public GerenteProjetos getGerenteProjetos() {
		return gerenteProjetos;
	}
	public void setGerenteProjetos(GerenteProjetos gerenteProjetos) {
		this.gerenteProjetos = gerenteProjetos;
	}
	
	
	
	
	

}
