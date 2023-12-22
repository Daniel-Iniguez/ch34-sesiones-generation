package animales.zoologico;

public class Zoologico {

    public static void main(String[] args) {
        Felino gato = new Felino("Garfield", "Gato");
        Felino pantera = new Felino("Bagheera", "Pantera", 3);
        
        System.out.println(Felino.getZooName());
        System.out.println("Nombre Zoologico: " + Felino.nombreZoologico);
        
        gato.comer();
        pantera.rugir();
        
    }

}
