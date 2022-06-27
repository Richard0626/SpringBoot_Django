package com.example.modelo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity(name = "auth_user")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String is_superuser;
	private String is_staff;
	private String is_active;
	private String date_joined;
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "usuarios_roles",
			joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
			)
	private Collection<Rol> roles;
	public Usuario(long id, String username, String first_name, String last_name, String email, String password,
			String is_superuser, String is_staff, String is_active, String date_joined, Collection<Rol> roles) {
		super();
		this.id = id;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.is_superuser = is_superuser;
		this.is_staff = is_staff;
		this.is_active = is_active;
		this.date_joined = date_joined;
		this.roles = roles;
	}
	public Usuario(String username, String first_name, String last_name, String email, String password,
			String is_superuser, String is_staff, String is_active, String date_joined, Collection<Rol> roles) {
		super();
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.is_superuser = is_superuser;
		this.is_staff = is_staff;
		this.is_active = is_active;
		this.date_joined = date_joined;
		this.roles = roles;
	}
	public Usuario() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIs_superuser() {
		return is_superuser;
	}
	public void setIs_superuser(String is_superuser) {
		this.is_superuser = is_superuser;
	}
	public String getIs_staff() {
		return is_staff;
	}
	public void setIs_staff(String is_staff) {
		this.is_staff = is_staff;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getDate_joined() {
		return date_joined;
	}
	public void setDate_joined(String date_joined) {
		this.date_joined = date_joined;
	}
	public Collection<Rol> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}
	
}
