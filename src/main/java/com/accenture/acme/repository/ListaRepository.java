package com.accenture.acme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.accenture.acme.model.Lista;
import com.accenture.acme.modelDTO.ListaDTO;

@Repository
public interface ListaRepository extends JpaRepository<Lista,Integer> {
	@Query("Select new com.accenture.acme.modelDTO.ListaDTO(l.id,l.descricao) from Lista l")
	public List<ListaDTO> buscarListas();
}
