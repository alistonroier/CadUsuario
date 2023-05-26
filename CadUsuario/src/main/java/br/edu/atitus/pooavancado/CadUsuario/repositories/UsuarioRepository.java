package br.edu.atitus.pooavancado.CadUsuario.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.atitus.pooavancado.CadUsuario.entities.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario>{
	

	//metodo pra update do banco, ou seja, não da retorno
	//query nativa do sgbd postgres
	@Query(value = "update Usuario set status = NOT status where id = :id", nativeQuery = true)
	@Modifying
	void alteraStatus(@Param("id") long id);
}
