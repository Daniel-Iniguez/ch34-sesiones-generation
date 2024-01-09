package org.generation.app.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.*;

@AllArgsConstructor // contructor con parámetros
@NoArgsConstructor // contructor vacío
@Setter
@Getter
@ToString
@Component
public class User {
	
	
	private long id;
	private String firstname;
	private String lastname;
	private static int counter;
	
	{
		this.id = ++counter;
		System.out.println("Se inicializa el User id: " + this.id);
	}
	
	
	
	public User(long id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		User.counter = counter;
	}

	public String greeting() {
		return "Hola soy Usuario general";
	}
	
	public static Map<Integer, User> usersMock(){
		Map<Integer, User> users = new HashMap<>();
		users.put( 100, new User(100, "Mario", "M") );
		users.put( 101, new User(101, "Miguel", "O") );
		users.put( 102, new User(102, "Liliana", "O") );
		users.put( 103, new User(103, "Alex", "E") );
		users.put( 104, new User(104, "Gabriela", "F") );
		users.put( 105, new User(105, "Geo", "F") );
		users.put( 106, new User(106, "Rafa", "C") );
		
		return users;
	}
	
}
