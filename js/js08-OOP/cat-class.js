console.log("js08- catClass");

/**
 * clase felino
 * el nombre de la clase se recomienda la convecion UpperCamelCase
 */

class Felino{
    /* numPatas
    tieneGarras
    size */

    //El metodo contructor nos ayuda a inicializar los atibutos de un objeto
    constructor(nombre,numPatas, tieneGarras, size){
        this.nombre = nombre; //let nombre
        this.numPatas = numPatas; 
        this.tieneGarras = tieneGarras; 
        this.size = size; 
        console.log(`soy ${this.nombre} y tengo vida, ja-ja-ja`);
    }

    comer(){
        return `soy ${this.nombre} y estoy comiendo`
    }

};

// Instanciar la clase Felino
const chicharron = new Felino("Chicharron","4");
const wero = new Felino("Wero");
const pelusa = new Felino("Pelusa");

//Uso de la función comer
console.log(chicharron.comer());