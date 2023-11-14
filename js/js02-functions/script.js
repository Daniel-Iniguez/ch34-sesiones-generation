console.log('Sesion JS02 - funciones');

//----------Funcion declarada, funciones definidas------------
//  (function delcaration, function statement)

/*
Una de las caracteristicas de las funciones declaradas, es que tienen hoisting (pueden ser llamadas antes de su declaración).
*/

multiplica(5,3);

/**
 * Comentario de función.
 * Multiplica 2 numeros e imprime en consola
 * @param {number} a valor de multiplicando
 * @param {number} b valor de multiplicando
 */
function multiplica(a,b){
    const resultado = a*b;
    console.log(resultado);
}

function divide(dividendo,divisor){
    return dividendo/divisor;
}

console.log(divide (5,2)); // 2.5
console.log(divide (5,"2")); // 2.5
console.log(divide ("5","2")); // 2.5
console.log(divide ('5 0','2')); // NaN

//----------Funciones expresadas------------
//  (function expressions)
/*
Funciones que son declaradas dentro de la asignacion de una variable. 
Estas funciones pueden ser anonimas (no tiene nombre).

Las funciones expresadas no tiene hoisting, porque no se carga en memoria hasta que se utilice.
*/

const sum = function sumaDeEnteros(a,b){
    return a+b;
};

console.log(sum (6,20)); //26


const potencia = function(base,exponente){
    return base**exponente;
};
console.log(potencia(3,2)); //9

const power = (base, exponent) => base ** exponent;

//----------------Funcion autoinvocadas-----------
// (selft-incoking functions)
// Se autoinvocan, no necesitan un llamado
// Se pueden definir con funciones anonimas

(function setUp(){
    console.log("Me autoinvoco");
    console.log("Puedo servirte como inicializador de tu programa");
})

//----------Funcion Flecha-----------------------
// (arrow function)
/*
Son similares a las funciones expresadas, pero:
- No requieren la palabra function.
- Si tiene una sola instrucción, no requeire las llaves {}
-Si la instruccion es el mismo retorno, no requiere la palabra return.

*/

//Area de rectangulo con funcion expresada
const areaRectangulo = function(base,altura){
    return base*altura;
};

//Area del rectangulo con arrow function
const areaRectangulo2 = (base,altura) => base*altura;

console.log('El area es: ',areaRectangulo(10,6)); // 60
console.log('El area es: ',areaRectangulo2(5,4)); // 20

const saludo = persona => `Hola ${persona}`;
const ellaBailaSola = () => `Compa, que le parece esa morra`

console.log( saludo('Peso Pluma'));
console.log( ellaBailaSola());