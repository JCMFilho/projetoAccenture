package com.accenture.acme.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.acme.model.Lista;
import com.accenture.acme.model.ListaTarefas;
import com.accenture.acme.modelDTO.ListaDTO;
import com.accenture.acme.service.ListaTarefasService;

@RestController
@RequestMapping("/api/lista")
@CrossOrigin
public class ListaTarefasController {
	
	private final ListaTarefasService listaTarefasService;
	
	public ListaTarefasController(ListaTarefasService listaTarefasService) {
		this.listaTarefasService = listaTarefasService;
	}
	
	
	@PostMapping("/tarefa/{id}")
	private ResponseEntity<HttpStatus> salvarTarefa(@RequestBody ListaTarefas tarefa,@PathVariable("id") Integer idLista){
		this.listaTarefasService.salvarTarefa(tarefa,idLista);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@PostMapping("/lista")
	private ResponseEntity<HttpStatus> salvarLista(@RequestBody Lista lista){
		this.listaTarefasService.salvarLista(lista);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@GetMapping("/lista")
	private ResponseEntity<List<ListaDTO>> buscarListas(){
		return ResponseEntity.ok(this.listaTarefasService.buscarListas());
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<HttpStatus> deletarTarefa(@PathVariable("id") Integer id){
		this.listaTarefasService.deletarTarefa(id);
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
