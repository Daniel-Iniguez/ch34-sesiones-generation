console.log("js08- catClass");

/**
 * clase felino
 * el nombre de la clase se recomienda la convecion UpperCamelCase
 */
class Felino {
    // nombre
    // numPatas
    // tieneGarras
    // size
    // Atributo encapsulado
    #createdAt;

    //El metodo contructor nos ayuda a inicializar los atibutos de un objeto
    constructor(nombre, numPatas, tieneGarras, size) {
        this.nombre = nombre; //let nombre
        this.numPatas = numPatas;
        this.tieneGarras = tieneGarras;
        this.size = size;
        this.#createdAt = new Date().getTime(); //Obtener el valor en milisegundos 
        console.log(`soy ${this.nombre} y tengo vida, ja-ja-ja`);
    }

    //Setters and Getters
    get createdAt() {
        return this.#createdAt;
    }

    /* set createdAt(newDate){
        this.#createdAt = newDate;
    } */

    comer() {
        return `soy ${this.nombre} y estoy comiendo`
    }

    /**
     * Tiempo de vida del animal desde la fecha de creación hasta la fecha actual
     * @returns tiempo de vida en ms
     */
    lifeSpan() {
        return new Date().getTime() - this.#createdAt;
    }

};

/**
 * Usando la Palabra extends podemos heredar atributos y metodos de otra clase.
 */
class Gato extends Felino {
    constructor(nombre, size, domesticado = true) {
        super(nombre, 4, true, size);
        this.domesticado = domesticado;
    }


}


// Instanciar la clase Felino
const chicharron = new Felino("Chicharron", "4", true, "grande");
const wero = new Felino("Wero", 4);
const pelusa = new Felino("Pelusa", 10);

//Uso de la función comer
console.log(chicharron.comer());
console.log(wero.comer());
console.log(pelusa.comer());

//Instanciar la clase gato
const naranjo = new Gato("Naranjo", "Grande");
const kiara = new Gato("Kiara", "Mediana");
const tsuki = new Gato("Tsuki", "Grande", false);

console.log(naranjo.comer());
console.log(kiara.comer());
console.log(tsuki.comer());

console.log(`${naranjo.nombre} es un gato ${naranjo.domesticado ? "domesticado" : "Salvaje"}`);
console.log(`${tsuki.nombre} es un gato ${tsuki.domesticado ? "domesticado" : "Salvaje"}`);


//Accediendo a un atributo encapsulado

//No se puede acceder directamnete sobre un atributo encapsulado
//console.log(`Tiempo de vida de ${naranjo.nombre} : ${naranjo.#createdAt}`);

setTimeout(() => console.log(`Tiempo de vida de ${naranjo.nombre} : ${naranjo.lifeSpan()}`), 2000);

//