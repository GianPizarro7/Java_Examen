package com.pizarro.sistemaalmacen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pizarro.sistemaalmacen.entity.Incidencias;
import com.pizarro.sistemaalmacen.repository.IncidenciasRepository;
import com.pizarro.sistemaalmacen.service.IncidenciasService;

@Service
public class IncidenciasServiceImpl implements IncidenciasService {
	@Autowired
	private IncidenciasRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Incidencias> findAll() {
		try {
			return repository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Incidencias findById(int id) {
		try {
			return repository.findById(id).orElse(null);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Incidencias findByNombre(String nombre) {
		try {
			return repository.findByNombre(nombre);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Incidencias> findByNombreContaining(String nombre) {
		try {
			return repository.findByNombreContaining(nombre);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public Incidencias create(Incidencias obj) {
		try {
			return repository.save(obj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	@Transactional
	public Incidencias update(Incidencias obj) {
		try {
			Incidencias incidenciasDb=repository.findById(obj.getId().orElse(null);
			if(incidenciasDb==null) {
				return null;
			}
			incidenciasDb.setDenunciante(obj.getDenunciante());
			return repository.save(incidenciasDb);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public int delete(int id) {
		try {
			Incidencias incidenciasDb=repository.findById(id).orElse(null);
			if(incidenciasDb==null) {
				return 0;
			}else {
				repository.delete(incidenciasDb);
				return 1;
			}
		} catch (Exception e) {
			return 0;
		}
	}
	
}
