package com.pizarro.sistemaalmacen.service;
import java.util.List;

import com.pizarro.sistemaalmacen.entity.Incidencias;

public interface IncidenciasService {
	public List<Incidencias> findAll();
	public Incidencias findById(int id);
	public Incidencias findByNombre(String nombre);
	public List<Incidencias> findByNombreContaining(String nombre);
	public Incidencias create(Incidencias obj);
	public Incidencias update(Incidencias obj);
	public int delete(int id);
}
