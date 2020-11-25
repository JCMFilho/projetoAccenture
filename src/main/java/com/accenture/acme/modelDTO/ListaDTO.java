package com.accenture.acme.modelDTO;

import java.util.List;

public class ListaDTO {
	 private Integer id;
	 private String descricao;
	 private List<ListaTarefasDTO> listaTarefas;
	 
	 public ListaDTO() {
		 
	 }
	 
	public ListaDTO(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
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
	public List<ListaTarefasDTO> getListaTarefas() {
		return listaTarefas;
	}
	public void setListaTarefas(List<ListaTarefasDTO> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
}
