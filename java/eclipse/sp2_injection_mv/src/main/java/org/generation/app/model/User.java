package org.generation.app.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
	
	private long id;
	private String firstName;
	private String lasttName;
	private int cohorte;
	private static int counter;
	
	{
		this.id = ++counter;
		System.out.println("Se inicializa el User id: " + this.id);
	}
	
	
	
	
}
