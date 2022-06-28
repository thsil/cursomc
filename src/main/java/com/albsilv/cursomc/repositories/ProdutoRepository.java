package com.albsilv.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albsilv.cursomc.domain.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
