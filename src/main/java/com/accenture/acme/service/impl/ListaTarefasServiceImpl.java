package com.accenture.acme.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.acme.model.Lista;
import com.accenture.acme.model.ListaTarefas;
import com.accenture.acme.modelDTO.ListaDTO;
import com.accenture.acme.repository.ListaRepository;
import com.accenture.acme.repository.ListaTarefasRepository;
import com.accenture.acme.service.ListaTarefasService;

@Service
public class ListaTarefasServiceImpl implements ListaTarefasService {

	private final ListaTarefasRepository listaTarefasRepository;
	private final ListaRepository listaRepository;
	
	public ListaTarefasServiceImpl(ListaTarefasRepository listaTarefasRepository,ListaRepository listaRepository) {
		this.listaTarefasRepository = listaTarefasRepository;
		this.listaRepository = listaRepository;
	}
	
	@Override
	public void salvarTarefa(ListaTarefas tarefa,Integer idLista) {
		Lista l = new Lista();
		l.setId(idLista);
		tarefa.setListaTarefa(l);
		this.listaTarefasRepository.saveAndFlush(tarefa);
	}


	@Override
	public void deletarTarefa(Integer id) {
		this.listaTarefasRepository.deleteById(id);
		
	}

	@Override
	public void salvarLista(Lista lista) {
		this.listaRepository.saveAndFlush(lista);
		
	}

	@Override
	public List<ListaDTO> buscarListas() {
		List<ListaDTO> list = this.listaRepository.buscarListas();
		for(ListaDTO l:list) {
			l.setListaTarefas(this.listaTarefasRepository.buscarTarefas(l.getId()));
		}
		return list;
	}

}
