package com.inviteme.web.controller.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/test")
public class TestRest {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello()
	{
	    return "Hello World!";
	}
}
