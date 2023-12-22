package mundopokemon.com;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		Pokemon charizard = new Pokemon("Charizard", "Fuego Volador", 500);
		
		System.out.println(pikachu.detalles());
		System.out.println(charizard.detalles());

	}

}
