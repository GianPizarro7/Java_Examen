package com.pachas.sistemaalmacen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pachas.sistemaalmacen.entity.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
	List<Articulo> findByNombreContaining(String texto);
	Articulo findByNombre(String texto);
}
