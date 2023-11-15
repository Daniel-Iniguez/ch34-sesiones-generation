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