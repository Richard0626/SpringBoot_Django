package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.modelo.Categoria;
import com.example.repositorio.CategoriaRepositorio;

@Service
public class CategoriaServicioImpl implements CategoriaServicio {
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> listarCategorias() {
		// TODO Auto-generated method stub
		return categoriaRepositorio.findAll();
	}
	

}
