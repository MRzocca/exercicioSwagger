package com.murilo.lomnok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.lomnok.PrjLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}