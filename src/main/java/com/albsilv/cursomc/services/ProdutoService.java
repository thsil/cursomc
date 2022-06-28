package com.albsilv.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albsilv.cursomc.domain.Produto;
import com.albsilv.cursomc.repositories.ProdutoRepository;
import com.albsilv.cursomc.services.exceptions.ResourceNotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	
	public Produto buscar(Long id) {
		
		Optional<Produto> obj = repo.findById(id);  
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
		//return obj.get(); 		
		
		
	}

}
