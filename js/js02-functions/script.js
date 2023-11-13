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


const potencia = function(base,potencia){
    return base**potencia;
};
console.log(potencia(3,2)); //9