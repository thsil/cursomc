package com.albsilv.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albsilv.cursomc.domain.Pedido;
import com.albsilv.cursomc.repositories.PedidoRepository;
import com.albsilv.cursomc.services.exceptions.ResourceNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	
	public Pedido buscar(Long id) {
		
		Optional<Pedido> obj = repo.findById(id);  
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
		//return obj.get(); 		
		
		
	}

}
