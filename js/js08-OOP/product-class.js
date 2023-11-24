/* Crear la clase producto. Atributos enncapsulados, Crear Setters y Getters
   * Utilizar la herencia.
        "id": 2,
        "title": "Mens Casual rts ",
        "price": 22.3,
        "description": "Slies a three-button placket.",
        "category": "men's clothing",
        "image": "https://fakestoreap.jpg",
        "rating": {
            "rate": 4.1,
            "count": 259
        }
*/
class Producto {
    //Atributos encapsulados
    #id;
    #title;
    #price;
    #description;
    #category
    constructor(id = 1,title,price,description,category){
        this.#id = id++;
        this.#title = title;
        this.#price = price;
        this.#description = description;
        this.#category = category
    }

    get getNumId(){
        return this.#id;
    }

    set setValorId(num){
        this.#id = num;
    }

}

class JerseyFutbol extends Producto {

    constructor(title,description,equipo){
        super(1,title,1_700,description,"deportes")
        this.equipo = equipo;
    }

    comentario() {
        return `la playera de ${this.equipo} es Bonita`;
       }

}

//Intanciar la clase JerseyFutbol
const realMadrid = new JerseyFutbol("Playera de Futbol", "Temporada 2023", "Real Madrid");
realMadrid.setValorId = 14
console.log(`con el id: ${realMadrid.getNumId}, ${realMadrid.comentario()} y vale ${realMadrid.price}`);
