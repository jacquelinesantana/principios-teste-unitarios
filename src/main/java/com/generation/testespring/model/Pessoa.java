package com.generation.testespring.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	
	private String nome;

	private LocalDate nascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public int getIdade() {
		
		int idade =  (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
		if(idade < 4 ) {
			throw new IllegalArgumentException("Data de nascimento inválida");
		}else {
			return idade;
		}
	}
	
	public Pessoa(String nome, LocalDate nascimento) {
		this.nascimento = nascimento;
		this.nome = nome;
		
	}
	
	public Pessoa() {
		
	}
}
