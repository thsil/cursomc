package com.albsilv.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.albsilv.cursomc.domain.Pedido;
import com.albsilv.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Pedido> find(@PathVariable Long id) {
		
	Pedido obj = service.buscar(id); 	
		
	return ResponseEntity.ok().body(obj);
	
		
	}

}

