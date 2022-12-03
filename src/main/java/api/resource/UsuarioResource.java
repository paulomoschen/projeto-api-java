package api.resource;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import api.controller.UsuarioController;
import api.entity.Usuario;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {
	
	
	@Inject
	UsuarioController usuarioController;
	
	@PUT
	@POST
	public Response create(@Valid Usuario usuario) {
		Usuario usuarioEntity = usuarioController.save(usuario);
		return Response.ok(usuarioEntity).status(Response.Status.CREATED).build();
	}
}
