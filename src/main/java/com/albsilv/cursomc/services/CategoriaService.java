package com.albsilv.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albsilv.cursomc.domain.Categoria;
import com.albsilv.cursomc.repositories.CategoriaRepository;
import com.albsilv.cursomc.services.exceptions.ResourceNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Long id) {
		
		Optional<Categoria> obj = repo.findById(id);  
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
		//return obj.get(); 		
		
		
	}

}
