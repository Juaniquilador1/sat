package com.sat.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sat.modelo.Usuario;

public interface RepoUsuario extends CrudRepository<Usuario, Integer> {
	@Query(value = "SELECT *FROM usuario WHERE rfc = ?1 AND contrasena = ?2", nativeQuery = true)
	Usuario validar(String rfc, byte[] contrasena);
}
