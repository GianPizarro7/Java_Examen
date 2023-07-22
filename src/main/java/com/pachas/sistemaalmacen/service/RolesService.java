package com.pachas.sistemaalmacen.service;
import java.util.List;

import com.pachas.sistemaalmacen.entity.Roles;

public interface RolesService {
	public List<Roles> findAll();
	public Roles findById(int id);
	public Roles findByNombre(String nombre);
	public List<Roles> findByNombreContaining(String nombre);
	public Roles create(Roles obj);
	public Roles update(Roles obj);
	public int delete(int id);
}
