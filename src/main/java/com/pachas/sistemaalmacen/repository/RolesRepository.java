package com.pachas.sistemaalmacen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pachas.sistemaalmacen.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
	List<Roles> findByNombreContaining(String texto);
	Roles findByNombre(String texto);
}
