package br.edu.atitus.pooavancado.CadUsuario.services;

import org.springframework.data.repository.query.Param;

import br.edu.atitus.pooavancado.CadUsuario.entities.Usuario;
import br.edu.atitus.pooavancado.CadUsuario.repositories.UsuarioRepository;

public interface UsuarioService extends GenericService<Usuario, UsuarioRepository>{
	
	void alteraStatus(@Param("id") long id) throws Exception;
}
