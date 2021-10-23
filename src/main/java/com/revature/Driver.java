package com.revature;

import io.javalin.Javalin;

public class Driver {
	public static void main(String[] args) {
		
		/**
		 * we first need to create a Javalin obj
		 * run the start method to listn for HTTP req
		 * the port number as a param
		 */
		Javalin app = Javalin.create().start(8080);
		
		
		/**
		 * This .get method will map GET reqs to the endpt
		 * that is given as the 1st param to be handled by
		 * the handler.
		 * 
		 * There are methods for any of the HTTP methods/verbs
		 */
		app.get("/hello",(ctx)->{ctx.result("<h1>Hello Javalin!"
				+ "it's good to meet you on /hello a GET req</h1>");});
		
		
	}
}
