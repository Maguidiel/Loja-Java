package com.projeto.sistema.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sistema.modelos.ItemEntrada;

public interface ItemEntradaRepositorio extends JpaRepository<ItemEntrada, Long> {

	@Query("SELECT e FROM ItemEntrada e WHERE e.entrada.id = ?1")
	List<ItemEntrada>buscarPorEntrada(long id);
	
}
