package com.accenture.acme.service;

import java.util.List;

import com.accenture.acme.model.Lista;
import com.accenture.acme.model.ListaTarefas;
import com.accenture.acme.modelDTO.ListaDTO;

public interface ListaTarefasService {

	void salvarTarefa(ListaTarefas tarefa,Integer idLista);
	
	void deletarTarefa(Integer id);
	
	void salvarLista(Lista lista);
	
	List<ListaDTO> buscarListas();
}
