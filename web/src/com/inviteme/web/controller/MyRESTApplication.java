package com.inviteme.web.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.inviteme.web.controller.rest.TestRest;

@ApplicationPath("/root-path")
public class MyRESTApplication extends Application {
	
	 private Set<Object> singletons = new HashSet<Object>();
	     public MyRESTApplication() {
	         singletons.add(new TestRest());
	     }
	     @Override
	     public Set<Object> getSingletons() {
	         return singletons;
	     }

}
