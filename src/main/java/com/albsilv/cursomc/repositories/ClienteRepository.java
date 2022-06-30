package com.albsilv.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albsilv.cursomc.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
