package com.example.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.modelo.Comida;

public interface ComidaServicio extends UserDetailsService{
	public List<Comida> listarComidas();

}
