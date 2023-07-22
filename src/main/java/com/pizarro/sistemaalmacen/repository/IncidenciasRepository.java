package com.pizarro.sistemaalmacen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizarro.sistemaalmacen.entity.Incidencias;

@Repository
public interface IncidenciasRepository extends JpaRepository<Incidencias, Integer> {
	List<Incidencias> findByNombreContaining(String texto);
	Incidencias findByNombre(String texto);
}
