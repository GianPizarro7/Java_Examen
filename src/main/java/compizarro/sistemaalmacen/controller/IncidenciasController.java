package compizarro.sistemaalmacen.controller;

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

import com.pizarro.sistemaalmacen.entity.Incidencias;
import com.pizarro.sistemaalmacen.service.impl.IncidenciasServiceImpl;

@RestController
@RequestMapping("/api/categorias")
public class IncidenciasController {
	@Autowired
	private IncidenciasServiceImpl service;
	
	//localhost:8091/api/categorias (GET)
	@GetMapping() 
	public ResponseEntity<List<Incidencias>> getAll(){
		List<Incidencias> categorias= service.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(categorias);
	}
	
	//localhost:8091/api/categorias/1 (GET)
	@GetMapping(value="/{id}") 
	public ResponseEntity<Incidencias> getById(@PathVariable("id") int id) {
		Incidencias categoria = service.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(categoria);
	}
	
	//localhost:8091/api/categorias (POST)
	@PostMapping 
	public ResponseEntity<Incidencias> create(@RequestBody Incidencias categoria) {
		Incidencias categoriaDb=service.create(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaDb);
	}
	
	//localhost:8091/api/categorias/1 (PUT)
	@PutMapping
	public ResponseEntity<Incidencias> update(@RequestBody Incidencias categoria) {
		Incidencias categoriaDb=service.update(categoria);
		return ResponseEntity.status(HttpStatus.OK).body(categoriaDb);
	}
	
	//localhost:8091/api/categorias/1 (DELETE)
	@DeleteMapping(value="/{id}")
	public int delete(@PathVariable("id") int id){
		return service.delete(id);
	}
}
