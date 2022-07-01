package com.albsilv.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albsilv.cursomc.domain.Cliente;
import com.albsilv.cursomc.repositories.ClienteRepository;
import com.albsilv.cursomc.services.exceptions.ResourceNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente buscar(Long id) {
		
		Optional<Cliente> obj = repo.findById(id);  
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
		//return obj.get(); 		
		
		
	}

}
