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

//----------Parametros default----------

const saludoGeneration = (persona = 'amigo',cohorte= 'curso') => `Hola ${persona} que gusto que estes en el ${cohorte}`;

console.log(saludoGeneration('Daniel','CH34'));
console.log(saludoGeneration());

//----------Rest Parameters----------
// Nos permite representar una serie de valores indefinidos en los argumentos.
// Estos se presentan como un array.
// El rest parameter debe estar al final de la lista de parámetros.
const sumaVariosNumeros = (a,b, ...manyMoreArgs) => {
  let suma;
  const sumArray = (acomulador,numero)=> acomulador+numero;
  
  suma = a+b;
  suma+=manyMoreArgs.reduce(sumArray,0);

/*
  for (let index = 0; index < manyMoreArgs.length; index++) {
    suma = suma + manyMoreArgs[index]; // suma += mamanyMoreArgs[index];
  }
*/
  return suma;
}

console.log( `Sumatoria de 2 números 4 + 6 = ${ sumaVariosNumeros(4,6)}` ); //10
console.log( `Sumatoria de 2 números 4 + 6 + 5 + 7= ${ sumaVariosNumeros(4,6,5,7)}` ); //22

//----------Funciones de callback----------
/*
Funcion que e pasa a otra funcion como argumento, par luego invocarla para completar algun tipo de rutina o acción.

*/

/*
 Realizar 3 funciones.
  1 función que reciba un mensaje e imprima en consola
  1 función que reciba un mensaje e imprima en alert
  1 función que reciba un mensaje e imprima en el DOM, en H2
*/

const consoleMessage = message => console.log(message);
const alertMessage = message => alert(message);
const printToH2 = message => {
  const refH2 = document.getElementById("message");
  refH2.innerHTML = message;
};

function setText(){
  const refH2 = document.getElementById("message");
  refH2.innerHTML = getText();
}

// Función que obtenga un mensaje e imprima en consola o alert o DOM o lo que se me ocurra.

function getText(){
  let getName = document.getElementById('floatingInputGrid');
  const name= getName.value;
  return name;
}


function getMessageAndPrint( fncPrint ){
  const message = getUserMessage();
  fncPrint(message);
}

const getUserMessage = () => getText();


getMessageAndPrint(consoleMessage);
//getMessageAndPrint(alertMessage);
getMessageAndPrint(printToH2);


//------------------------------------Serch-----------------------------------------------------------
const printToConsole = message => console.log(message);
const printToAlert = message => alert(message);
const printToH3 = message => {
  const refH3 = getH3Message();
  refH3.innerHTML = message;
};
const getH3Message = ()=> document.getElementById("message-2");

// Función que obtenga un mensaje e imprima en consola o alert o DOM o lo que se me ocurra.
function getMessageAndPrint2( fncPrint ){
  const message = getUserMessage2();
  fncPrint(message);
  
}

const getUserMessage2 = () => `Martes de frescura`;

getMessageAndPrint2(printToConsole);
//getMessageAndPrint2(printToAlert);
//getMessageAndPrint2(printToH3);

// Imprimir en el DOM en un paragraph
getMessageAndPrint2( function(message){ 
  return document.getElementById("p-message").innerHTML = message; 
});


/*
    Ejercicio 2
    Escribe una función que tome un arreglo de números,
    duplique el valor de cada número del arreglo,
    e imprima el nuevo arreglo actualizado.
    [5, 10, 15, 20, 25] -> [10, 20, 30, 40, 50]
*/

// Usando callback con map
const numbers = [5,10,15,20,25]
const fncCallBackforMap = (element, index, array) => element * 2;
const doubleUsingMap = (array) => array.map( fncCallBackforMap );
              //[5, 10, 15, 20, 25];
console.log( doubleUsingMap( numbers) ); // [10, 20, 30, 40, 50]

const doubleUsingMapAndArrowFunction = (array) => array.map( element => element * 2 );
console.log( doubleUsingMapAndArrowFunction(numbers) ); // [10, 20, 30, 40, 50]

/*
  Ejercicio 4
  Crear un programa que itere sobre dos arreglos;
  si hay cursos en común, imprimirlos en la consola.

  salida: "Cursos en común: Programming, Music"
*/

const student1Course = ["Math", "English", "Programming", "Biology", "Physics", "Music"];
const student2Course = ["Geography", "Spanish", "Programming", "Music"];
const student3Course = ["Math", "English", "Programming", "Biology", "Physics", "Music"];

const cursosEnComun = ( student1Courses, student2Courses  ) => {
  const commonCourses = [];
  for (let i = 0; i < student1Courses.length; i++) {
    for (let j = 0; j < student2Courses.length; j++) {
      if(student1Courses[i] === student2Courses[j]){
        commonCourses.push( student1Courses[i] );
      }
    }
  }
 return commonCourses;
}

console.log(`Cursos en común: ${ cursosEnComun( student1Course, student2Course ) }`);

//------------------- Usando método filter e includes

const commonCoursesUsingFilter = (arr1, arr2 ) => arr1.filter(curso => arr2.includes(curso));
console.log(`Cursos en común: ${ commonCoursesUsingFilter( student1Course, student2Course ) }`);

// Comparando 3 arreglos de cursos
const commonCoursesStudent1And2 = commonCoursesUsingFilter( student1Course, student2Course );
const commonCoursesStudet1And2And3 = commonCoursesUsingFilter( commonCoursesStudent1And2, student3Course );
console.log(`Cursos en común: ${ commonCoursesStudet1And2And3 }`);

// ------------------- Contar la cantidad de caracteres de una frase -----------
// pepe pecas pica papas con un pico y una pala
// la cantidad de letras 'p': 8
// resolverlo usando arrow function
// Convertir el texto a array(split("")) y usar el metodo filter()

//Mi forma
const frase = 'pepe pecas pica papas con un pico y una pala'
console.log(frase)
const fraseArray = frase.split("");
const arrayLetraP= fraseArray.filter((letter) => letter === 'p');
console.log(arrayLetraP);
const cantidadP = arrayLetraP.length;
console.log("La cantidad de letras 'p' es:",cantidadP);

//Forma de Serch
const phrase = "pepe pecas pica papas con un pico y una pala";
const countChar = (phrase, character) => phrase.split("").filter( element => element === character ).length;
console.log( countChar( phrase, "p"));
//Forma 2 serch
const countChar2 = (phrase, character) => {
  const characters = phrase.split(""); //[p,e,p,e, , p... ]
  const filterCharacters = characters.filter(  (element, index, arr)=> element === character ); // [p..p,p]
  return filterCharacters.length;
}


//---------------Funciones Recursivas------------
/*

Es una técnica de programación en donde la función se llama a si misma.
Se debe tener precausion de no entrar en un ciclo infinito.

En lagunos casos, la recursividad puede ser mas legible y clara
ya que refleja de manera directa la naturaleza recursiva del problema.


function funcionRecursiva (valor){
  if(condicionParo){

  }else{
    funcionRecursiva(nuevoValor); // llamada recursiva
  }
}

*/

//Realizar una funcion que calcule el factorial de un número
// Mostrar en consola el factorial de 5
/*
El factorial de un número se calcula multiplicando el número por cada número que lo precede hasta el 1. Por ejemplo: 3!=3x2x1=6.
*/

function factorial (number){
  let factorial = 1;
  for (let i = 1; i <= number; i++) {
    factorial *= i;
  }
  return factorial;
}

const factorialNumero = (number) => {
  let factorial = number;
  for (let i = number-1; i > 0; i--) {
    factorial *= i;
  }
    return factorial;
  
}
console.log(factorial(5));
console.log(factorialNumero(5));

//Solución del ejercicio con recurividad.
function factorialRecursivo (number){
  if(number < 1){
    return 1;
  }else{
    return number* factorialRecursivo(number-1);
  }
}

console.log(`Factorial recursivo de 5: ${factorialRecursivo(5)}`);

//EJERCICIO

function sumaPares (number){
  if(number <= 0){
    return 0;
  }else if (number % 2 === 0 ){
    return number + sumaPares(number-2);
  }else{
    return sumaPares(number-1);
  }
    
}
console.log(`Suma de pares es: ${sumaPares(22)}`);
console.log(`Suma de pares es: ${sumaPares(12)}`);
console.log(`Suma de pares es: ${sumaPares(7)}`);