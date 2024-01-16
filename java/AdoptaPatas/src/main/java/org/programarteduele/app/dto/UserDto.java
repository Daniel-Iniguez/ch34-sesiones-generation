package org.programarteduele.app.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto {
	
	private Long id;

	private String firstName;

	private String lastName;

	private String username;
	
	private String email;

	private int age;
	
	private String phone;
	
	

}
