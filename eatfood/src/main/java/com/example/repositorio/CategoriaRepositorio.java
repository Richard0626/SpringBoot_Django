package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modelo.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria,Long> {

}
