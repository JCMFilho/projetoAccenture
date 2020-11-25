package com.accenture.acme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TABELA_TAREFAS")
public class ListaTarefas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	private String descricao;
	
	private Boolean marcado;
	
	@JoinColumn(name = "lista", referencedColumnName = "ID")
	@ManyToOne
	private Lista listaTarefa;

	public Lista getListaTarefa() {
		return listaTarefa;
	}

	public void setListaTarefa(Lista listaTarefa) {
		this.listaTarefa = listaTarefa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getMarcado() {
		return marcado;
	}

	public void setMarcado(Boolean marcado) {
		this.marcado = marcado;
	}
}
