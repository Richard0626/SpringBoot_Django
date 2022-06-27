package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.modelo.Comida;
import com.example.repositorio.ComidaRepositorio;


@Service
public class ComidaServicioImpl implements ComidaServicio {
	@Autowired
	private ComidaRepositorio comidaRepositorio;

	

	@Override
	public List<Comida> listarComidas() {
		return comidaRepositorio.findAll();
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
