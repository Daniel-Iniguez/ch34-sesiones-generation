package org.generation;

import java.util.ArrayList;

import com.zoo.Animal;
import com.zoo.Cat;
import com.zoo.Dog;
import com.zoo.Leopard;
import com.zoo.Mammal;
import com.pet.Pet;
import com.toy.Tamagochi;

import java.util.List;


public class AnimalTest {
	public static void main(String[] args) {
		
//		Mammal mamifero = new Mammal("Mamifero", "Mamiferous Gigantescus", 2, true);
//		System.out.println(mamifero.eat("Tamalitos de ayer"));
		
		Cat wero = new Cat("Wero",10);
		Cat tecate = new Cat("Tecate",1);
		Cat pelusa = new Cat("Pelusa",.9);
		
		System.out.println(wero.sleep());
		System.out.println(wero.eat("Croquetas de pescado"));
		
		Dog toby = new Dog(5,"Dalmata","Perdy");
		System.out.println(toby.sleep());
		System.out.println(toby.eat("croquetas con pollo"));
		System.out.println(toby.trick());
		System.out.println(toby.raza());
		
		//==================
		ArrayList<Animal> arca = new ArrayList<>();
		
		arca.add(pelusa);
		arca.add(tecate);
		arca.add(wero);
		arca.add(toby);
		arca.add(new Leopard(3));
		
		Animal solovino = new Leopard(4);
		solovino = null;
		solovino = new Cat("Jinata",2);
		
		List <Pet> mascotas = new ArrayList<>();
		mascotas.add(pelusa);
		mascotas.add(new Tamagochi("Memetchi"));
		
		//--Polimorfismo en tiempo de ejecución
		eat( arca );
		
		

	}
	
	public static void eat(ArrayList<Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal.eat("Tortilla"));
			System.out.println(animal.sleep());
//			System.out.println(animal.getCommonName());
			if(animal instanceof Cat) {		
				System.out.println(((Cat)animal).getPetName());
			}
		}
	}
	
}
