package org.testji.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
@Path("/v1/api/cliente")
public class ClienteAPI {

	private static List<Cliente> lstClient;
	
	static {
		lstClient = new ArrayList<Cliente>();
		lstClient.add(new Cliente("lalo", "cz", 30));
	}
	
	@GET
	@Path("/find")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> findAll(){
		return lstClient;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/save")
	public Cliente saveCliente(Cliente cliente) {
		lstClient.add(cliente);
		return cliente;
	}
	
	@DELETE
	@Path("/delete/{index}")
//	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente deleteByIndex(@PathParam("index") int index) {
		return lstClient.remove(index);
	}
	
	@PUT
	@Path("/update/{index}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente updateCliente(@PathParam("index") int index, Cliente cliente) {
		return lstClient.set(index, cliente);
	}
}
