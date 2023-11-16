console.log("Sesion JS04 arreglos y ciclos")

/*
   ========== Array ==========================
   Es un tipo de estructura de datos que se utiliza
   para almacenar una colección ordenada de elementos.
   Estos elementos pueden ser de cualquier tipo.

   Los arrays son objetos especiales con propiedades y
   métodos específicos para trabajar con datos ordenados.

*/
//Declarar un arreglo usando corchetes.
const nombresCh34 = ['Misael', 'Luis', 'Meli'];

//Declarar un arreglo usando el constructor de la clase Array.
const apellidosCh34 = new Array('Navarro', 'Ortega', 'Flores');

console.log(nombresCh34); //['Misale', 'Luis', 'Meli']
console.log(apellidosCh34); //['Navarro', 'Ortega', 'Flores']

const numCajonesEstacionamiento = new Array(4); // [ , , , ]
console.log(numCajonesEstacionamiento);
console.log(new Array(2,5,7)); // [2,5,7]

// ========== Arreglos anidados ==================
// Matrices (Arreglo de 2 dimensiones)
// [ [], [], [] ]

const equipoIntegrador = [ 
    ['Misael', 'Mirta', 'Jocelyn', 'Jorge', 'Tony', 'Jaz'],  // 3 de pastor
    ["Chino", "Victor", "Nalle", "Lili", 'Fernanda', 'Cinthia'], // Javadictos
    ["Gaby", "Charly", "Alan", "Sebas", "Andrew", "Arlene", "Arely"] // HTAMALEROS
];

//Imprimir al equipo de Javadictos
const javadictos = equipoIntegrador[1];
console.table(javadictos);

//Imprimir a Lili de Jvadictos
const personaLili = javadictos[3];
console.log(personaLili);

//Imprimir a sebas
const personaSebas = equipoIntegrador[2][3];
console.log(personaSebas); //Sebas

// Mirta
console.log(equipoIntegrador[0][1]); //Mirta

//Arlene
console.log(equipoIntegrador[2][5]); //Arlene

console.log('====================='); 

// =========== Iterar un arreglo ==============
// Mostrar en consola todas las personas de los proyectos
// Usando ciclo for
/*
const equipoIntegrador = [ 
    ['Misael', 'Mirta', 'Jocelyn', 'Jorge', 'Tony', 'Jaz'],  // 3 de pastor
    ["Chino", "Victor", "Nalle", "Lili", 'Fernanda', 'Cinthia'], // Javadictos
    ["Gaby", "Charly", "Alan", "Sebas", "Andrew", "Arlene", "Arely"] // HTAMALEROS
];
*/

for (let i = 0; i < equipoIntegrador.length; i++) {
    console.table(equipoIntegrador[i]);
    for (let j = 0; j < equipoIntegrador[i].length; j++) {
        console.table(equipoIntegrador[i][j]);
    }
}

// Usando el método forEach
console.log('=========== Iterar usando ForEach ==============='); 
function imprimirFilas( element, index, array ){
    console.log( element );
}

// equiposIntegrador.forEach( imprimirFilas );
// equiposIntegrador.forEach( function impEquipos(element, index, array){ console.log( element );});
// equiposIntegrador.forEach( function (element, index, array){ console.log( element );});
// equiposIntegrador.forEach( (element, index, array) => console.log( element ) );

equipoIntegrador.forEach( element => console.log( element ) );

equipoIntegrador.forEach( fila => fila.forEach(columna => console.log(columna)) );

equipoIntegrador.forEach( (equipo, indiceEquipo) => {
    equipo.forEach( persona => console.log(indiceEquipo, persona) )
});

// ============== Iterar usando For of ======================
// Se usa en elementos iterables como arreglos o strings
console.log('============== Iterar usando For of ======================');

for (let fila of equipoIntegrador) {
    console.table(fila);
    for (const columna of fila) {
        console.log(columna);
    }
}

const myName = 'Daniel';
for (const char of myName) {
    console.log(char);
}

// =========== break and continue =============
/*
Consideraciones con el ciclo for:
No es necesario indicar la expresion inicial, la evaluación y la expresion final

for (inicio; comparacion; expFinal){
    sentencias;
}

for( ; ; ){

}

break: rompe con la iteracion en curso y finaliza el ciclo for


*/
console.log('=========== break and continue =============');

const numbers = [3,6,8,1];
// Detener la iteración si encontramos el numero 8
for(let number of numbers){
    console.log(number);
    if(number === 8) break;
}

const matrix = [ [2,4,6,999], [10_000,6,8,9], [2,6,8,3] ];
// Detener la iteracion cuando encontremos un 6, no mostrar mas numeros
// label: indicar que ciclo romperá el break

console.log('==== Uso de break and label ====');
breakMatrix: //label
for(let row of matrix){
    for (const column of row) {
        console.log(column);
        if(column === 6) break breakMatrix;
    }
}

//Imprimir todos los elementos excepto el 6(de cualquier fila)
console.log('==== imprimir excepto el 6 ====');
for(let row of matrix){
    for (const column of row) {
        if(column === 6) continue;
        console.log(column)
    }
}

const ages = [18,34,55];
 for (let i = 0; i < ages.length; i++) console.log( ages[i]);

// prueba chiquita
let jiteracion = 0;
for( ; jiteracion < 5; jiteracion++ )/*instrucciones de for */   //<--- Ojo
{
    console.log(jiteracion); // 0,1,2,3,4
};
console.log(jiteracion); // 5
console.log("Fin de jiteración"); // "Fin de jiteración""

// for sin elemento internos
let x = 0
for (;   ;  ){
   console.log("x: " + x);
   if( x >= 6 ) break ;
   x++
}
console.log('=========');
let y= 0;
for( ; ; y++){
    console.log("y: "+y);
    if(y>=6) break;
}

console.log(y);
//console.log(x); //No esta definia, excepcion

// ======== Ciclo While ========================
/*
Crea un bucle que ejecuta una sentencia.
mientras la condicion espesificada sea verdadera

*/
let counter = 1;
while( confirm('¿Quieres continuar?') ){
    console.log(`Numero de veces que has entrado: ${counter}`);
    counter++;
    if(counter > 10) {
        console.log('Limite maxmo');
        break;
    }
}

const nombreMascotas = [ "Junior", "Tomy", "Fify", "Canela", "Pelusa", "Freya", "Nana", "Cuco"];


// Imprimir los nombres de las mascotas, y detenerse cuando se encuentre a "Canela"
// Resolver utilizando ciclo While
let mascota = 0;
while (nombreMascotas[mascota] !== 'Canela'){
    console.log(nombreMascotas[mascota]);
    mascota++;  
}


// =================== ciclo do-while ====================
/*
  Crea un bucle que ejecuta una sentencia hasta que la
  condición de comprobación se evalue como falsa.

  La condición se evalua después de ejecutar la sentencia.
  Esto significa que la sentencia se ejecuta por lo menos una vez.

  sintaxis:

  do {
    sentencia;
  } while( evalución );

*/
let count = 0
do {
    count++;
    console.log(`N. Iteración ${count}`);
} while (confirm('¿Deseas continuar?'));


let mascot = 0;
do{
    console.log(nombreMascotas[mascot]);
    mascota++;  

}while(nombreMascotas[mascot] == 'Canela')


let valor = -2;
while ( valor < 5) {
    console.log("While " + valor ); // -2... 4
    valor ++;
}

valor = 4;
do {
    console.log("Do-While " + valor ); // 4
    valor ++;
} while ( valor < 5);