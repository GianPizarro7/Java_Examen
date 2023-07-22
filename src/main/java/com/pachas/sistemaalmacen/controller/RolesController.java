package com.pachas.sistemaalmacen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pachas.sistemaalmacen.entity.Roles;
import com.pachas.sistemaalmacen.service.impl.RolesServiceImpl;

@RestController
@RequestMapping("/api/roles")
public class RolesController {
	@Autowired
	private RolesServiceImpl service;
	
	//localhost:8091/api/categorias (GET)
	@GetMapping() 
	public ResponseEntity<List<Roles>> getAll(){
		List<Roles> roles = service.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(roles);
	}
	
	//localhost:8091/api/categorias/1 (GET)
	@GetMapping(value="/{id}") 
	public ResponseEntity<Roles> getById(@PathVariable("id") int id) {
		Roles roles = service.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(roles);
	}
	
	//localhost:8091/api/categorias (POST)
	@PostMapping 
	public ResponseEntity<Roles> create(@RequestBody Roles roles) {
		Roles rolesDb=service.create(roles);
		return ResponseEntity.status(HttpStatus.CREATED).body(rolesDb);
	}
	
	//localhost:8091/api/categorias/1 (PUT)
	@PutMapping
	public ResponseEntity<Roles> update(@RequestBody Roles roles) {
		Roles rolesDb=service.update(roles);
		return ResponseEntity.status(HttpStatus.OK).body(rolesDb);
	}
	
	//localhost:8091/api/categorias/1 (DELETE)
	@DeleteMapping(value="/{id}")
	public int delete(@PathVariable("id") int id){
		return service.delete(id);
	}
}
