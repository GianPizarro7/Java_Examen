package com.pachas.sistemaalmacen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pachas.sistemaalmacen.entity.Roles;
import com.pachas.sistemaalmacen.repository.RolesRepository;
import com.pachas.sistemaalmacen.service.RolesService;

@Service
public class RolesServiceImpl implements RolesService {
	@Autowired
	private RolesRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Roles> findAll() {
		try {
			return repository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Roles findById(int id) {
		try {
			return repository.findById(id).orElse(null);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Roles findByNombre(String nombre) {
		try {
			return repository.findByNombre(nombre);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Roles> findByNombreContaining(String nombre) {
		try {
			return repository.findByNombreContaining(nombre);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public Roles create(Roles obj) {
		try {
			return repository.save(obj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	@Transactional
	public Roles update(Roles obj) {
		try {
			Roles rolesDb=repository.findById(obj.getId()).orElse(null);
			if(rolesDb==null) {
				return null;
			}
			rolesDb.setNombre(obj.getNombre());
			return repository.save(rolesDb);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public int delete(int id) {
		try {
			Roles rolesDb=repository.findById(id).orElse(null);
			if(rolesDb==null) {
				return 0;
			}else {
				repository.delete(rolesDb);
				return 1;
			}
		} catch (Exception e) {
			return 0;
		}
	}
	
}
