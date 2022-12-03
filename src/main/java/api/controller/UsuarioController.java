package api.controller;

import javax.transaction.Transactional;

import api.entity.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class UsuarioController  implements PanacheRepository<Usuario>{

	 @Transactional
	    public Usuario save(Usuario usuario){
	
//	        persist(usuario);

	        return usuario;
	    }

//	    @Transactional
//	    public PersonDTO update(Long id, PersonDTO person) {
//	        persist(personEntity);
//	        return personEntity;
//	    }
}
