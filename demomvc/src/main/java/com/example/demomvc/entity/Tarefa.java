package com.example.demomvc.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;


import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="TAREFA")
public class Tarefa extends AbstractEntity<Long> {
	
	@Column(name="nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@Column(name="data_entrega", nullable = false, columnDefinition ="DATE")
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrega;
	
	@Column(name="responsavel", nullable = false, length = 60)
	private String responsavel;
	
	//Getters e Setters - modificadores de acesso

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
