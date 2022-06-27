package com.example.servicio;


import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.modelo.Categoria;

public interface CategoriaServicio extends UserDetailsService {
	public List<Categoria> listarCategorias();
	
}
