package com.example.servicio;


import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.dto.UsuarioRegistroDTO;

import com.example.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
}
