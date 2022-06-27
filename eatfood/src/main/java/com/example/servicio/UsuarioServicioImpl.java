package com.example.servicio;


import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collection;



import com.example.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.modelo.Rol;
import com.example.dto.UsuarioRegistroDTO;

import com.example.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	private UsuarioRepositorio usuarioRepositorio;
	
	
	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
		
	}
	
	@Override
	public Usuario guardar(UsuarioRegistroDTO registroDTO) {
		Usuario user=new Usuario(registroDTO.getUsername(),registroDTO.getFirst_name(), 
				registroDTO.getLast_name(),registroDTO.getEmail(), 
				passwordEncoder.encode(registroDTO.getPassword()),registroDTO.getIs_superuser(),
				registroDTO.getIs_staff(),registroDTO.getIs_active(),registroDTO.getDate_joined(), Arrays.asList(new Rol("ROLE_USER")));
		return usuarioRepositorio.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepositorio.findByUsername(username);
		if(usuario==null) {
			throw new UsernameNotFoundException("Usuario o contraseña invalidos");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), mapearAutoridadesARoles(usuario.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapearAutoridadesARoles(Collection<Rol> roles){
		return roles.stream().map(role-> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}

	
	

	
	
	
	
	
	
}
