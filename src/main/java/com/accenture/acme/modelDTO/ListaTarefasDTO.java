package com.accenture.acme.modelDTO;

public class ListaTarefasDTO {
	private Integer id;
	private String descricao;
	private Boolean marcado;
	
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

	public ListaTarefasDTO(Integer id, String descricao,Boolean marcado) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.marcado = marcado;
	}

	public ListaTarefasDTO() {

	}

	public Boolean getMarcado() {
		return marcado;
	}

	public void setMarcado(Boolean marcado) {
		this.marcado = marcado;
	}
}
