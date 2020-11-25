package com.accenture.acme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.accenture.acme.model.ListaTarefas;
import com.accenture.acme.modelDTO.ListaTarefasDTO;

@Repository
public interface ListaTarefasRepository extends JpaRepository<ListaTarefas,Integer> {
	
	@Query("select new com.accenture.acme.modelDTO.ListaTarefasDTO(l.id,l.descricao,l.marcado) from ListaTarefas l where l.listaTarefa.id =:id")
	public List<ListaTarefasDTO> buscarTarefas(@Param("id")Integer id);
}
