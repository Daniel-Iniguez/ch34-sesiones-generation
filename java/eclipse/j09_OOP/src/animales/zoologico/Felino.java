package animales.zoologico;
/*
 *  Crear una clase de un animal
 *    3 atributos no estáticos (instancia)
 *    1 atributo estático (clase)
 *    2 métodos constructores sobrecargados
 *    2 métodos  no estáticos  (instancia)
 *    1 método estático (clase)
 *    
 *  Crear una clase de prueba de la Clase animal
 * 
 * 
 * Crear una clase que contenga la clase animal creada.
 */

public class Felino {

    
    // Atributos no estáticos
  private String nombre; // El nombre del felino
  private String especie; // La raza del felino
  private int edad; // La edad del felino en años

  // Atributo estático
  static String nombreZoologico = "Chapultepec";

  // Métodos constructores sobrecargados
  Felino(String nombre, String especie, int edad) {
      this.nombre = nombre;
      this.especie = especie;
      this.edad = edad;
         }

  Felino(String nombre, String especie) {
      this(nombre, especie, 0); 
      // Se llama al otro constructor con la edad por defecto
  }

  // Métodos no estáticos
  public void rugir() {
      System.out.println(this.nombre + " dice: Grr!");
  }

  public void comer() {
      System.out.println(this.nombre + " esta comiendo... ");
  }

  // Método estático
  public static String getZooName() {
      return "Nombre del Zoologico: " + nombreZoologico; 
  }
  
}

