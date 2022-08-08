package com.animaismarinhos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnimaisMarinhos {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	@Column(length = 14)
	private String especie;
	@Column(length = 50, nullable = false)
	private String habitat;
	
	public AnimaisMarinhos(int id, String nome, String especie, String habitat) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.habitat = habitat;
	}

	public AnimaisMarinhos() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}
