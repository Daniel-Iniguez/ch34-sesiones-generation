console.log("Sesion Js01");

/*
Principales tipos de datos en JS:

Datos primitivos:
1. String
2. Boolean
3. Number
4. Undefined
5. Null
6. Bigint
7. NotNumber

Datos Objetos:
1. Array
2. Objetc

*/
console.log("Tipos de dato string: " + "Hola" + "2345");

// Number: 12, -45, 56.892, +Infinity, -Infinity, NaN
// Los datos numericos usan 64 bits para almacenar, pero solo usan 53 bits para representar el numero

console.log("Tipos de datos number: ", 12, -45, 56.892, 5/0, -23/0, 4*"hola");
console.log("Valor maximo respresentado en JS: ", Number.MAX_VALUE); // 1.7976931348623157e+308. Valores numericos, si nos pasamos no da +Infinty
console.log("Valor seguro: ", Number.MAX_SAFE_INTEGER); // 9007199254740991. Valor con el que podemos hacer operaciones, no podemos superar ese valor, si lo hacemos nos dara un valor inseperado

console.log("1.7976931348623157e+308", 1.7976931348623157e+308);
console.log("1.7976931348623157e+308", 1.7976931348623157e+309);

console.log('MAX_SAFE_INTEGER+1',Number.MAX_SAFE_INTEGER+1); // 9007199254740992
console.log('MAX_SAFE_INTEGER+2',Number.MAX_SAFE_INTEGER+2); // 9007199254740992
console.log('MAX_SAFE_INTEGER+3',Number.MAX_SAFE_INTEGER+3); // 9007199254740994
console.log('MAX_SAFE_INTEGER+4',Number.MAX_SAFE_INTEGER+4); // 9007199254740996
console.log('MAX_SAFE_INTEGER+5',Number.MAX_SAFE_INTEGER+5); // 9007199254740996

//BigInt
//Representa valores numericos enteros, de los que tipo number
// no pueda representar(MAX_VALUE) o no es seguro (MAX_SAFE_INTEHER).
//Para que ea BigInt se le agrega al final la letra 'n'
//El limite de BigInt esta determinado por la memoria disponible del sistema

let myBigInt = 9007199254740991n;
console.log(myBigInt);
console.log('myBigInt + 1: ', myBigInt+1n);
console.log('myBigInt + 2: ', myBigInt+2n);
console.log('myBigInt + 3: ', myBigInt+3n);
console.log('myBigInt + 4: ', myBigInt+4n);
console.log('myBigInt + 5: ', myBigInt+5n);

// Boolean
// Tenemos 2 estados: true/false
console.log('Boolean en true: ',true);
console.log('Boolean en false: ',false);

// Undefined
// Un dato que es declarado, pero no esta definido.
let myVar; //Solo esta declarado
console.log('Tipo de dato undefined: ', myVar);

// null 
// Intencionalmente se borra el tipo de dato.
let myVarNull; //solo se declara
console.log(myVarNull);
myVarNull = "Quiero que tan nos cuente como le fue en su concierto";
console.log(myVarNull); //String
myVarNull = null;
console.log(myVarNull);

//------------------------------------------
// Tipos de datos Object

// Object.
// const misDatosDePerfil = {clave:valor,clave2:valor2,}
const misDatosDePerfil = {
    'nombre':'Peso',
    apellido:'Pluma',
    edad: 23,
    isBelicoso: true,
    "23": "lo que sea",
    //Metodos
    nombreCompleto: function fullName(){
        return this.nombre +" "+ this.apellido;
    },
    numCanciones: {
        2020: 5,
        2021: 30,
        2023: 56,
        total: 91
    }
        
};
    

console.log(`Nombre: ${misDatosDePerfil.nombre}`); // Peso
console.log(`Apellido: ${misDatosDePerfil["apellido"]}`); //Pluma
console.log(`Lo que sea: ${misDatosDePerfil["23"]}`); //lo que sea
console.log(`El nombre completo es: ${misDatosDePerfil.nombreCompleto()}`); //Peso Pluma

//Arrays
//Tipo de objeto especiales que su fortaleza radica en los emtodos con los que cuenta.
//Almacena diferentes tipos de dato, su primer elemento es el indice 0.

const cancionesPesoPluma = [
    "Ella Baila Sola",
    "Lady Gaga",
    "Lou Lou",
    "Laguna",
    "El Gavilán",
    {
        2020: 5,
        2021: 30,
        2023: 56,
        total: 91
    }
];

console.log("Canciones por año: " + cancionesPesoPluma[5]); // [objetc Objetc]
//Indicemdel objeto de numero de canciones.
console.log("Canciones por año: " + cancionesPesoPluma[5]["2020"]); // 5
//Mostrar el "total" de canciones de PP
console.log("Total de canciones: ", cancionesPesoPluma[5]["total"]); // 91
console.log("Total de canciones: ", cancionesPesoPluma[5].total); // 91

//Conversion de datos (casting)

//Conversion implicita: 
console.log("Hola CH " + 34);//Hola CH 34
console.log("3"+5+6) //356
console.log("3"*3); // 9

//Conversiones explicitas
// String a number
// NUmber, pareInt, parseFloat
console.log("3"+5+6); // "356"

/*
Number()
-Convierte directamente una cadena a numeros
-Si el string tiene caracteres no numericos (12,56), se vuelve NaN
-Puede manejar decimale y exponentes (3e3)
-Puede convertir booleans y object a numbers

ParseInt()
-Convierte una cadena a numeros.
-Ignora los caracteres no numericos despues del primer numero (12,56 -> 12)
-Puede aceptar como argumento, la base numerica ParseInt("1000", 2) -> 8 decimal

parseFloat(9)
-Convierte una cadena a numeros de punto flotante
-Esto maneja decimales y exponentes
*/
console.log(Number("3")+5+6); // 14
console.log(parseInt('3')+5+6); // 14
console.log(parseFloat('3')+5+6); // 14.0
console.log(parseInt('$3')); // NaN
console.log(parseInt('3 MxN')); // 3
console.log(Number('3 MxN')); // NaN

console.log(parseInt("$3MXN".slice(1)) + 5 + 6 ); // 14
console.log( parseInt("$333MXN".replace('$','')) + 5 + 6 ) // 344
console.log(parseInt("$333MXN".replace(/[^0-9.]/g, ''))+ 5 + 6); // 344

console.log(parseInt('1000')); // 1000
console.log(parseInt('1000'),2); // 1000

//Conversion a String
console.log(String(23.4)) // '23.4'
console.log(String(true)) // true
console.log(String([3,4,5,6])) // '23.4'
console.log( String( {a:1,b:2} )) // [object Object]
console.log(JSON.stringify({a:1,b:2}));

//Conversion a Boolean
/*
Para que sea false, debe ser: "", 0, null, undefined
*/
console.log(Boolean("Hola")); // true
console.log(Boolean("false")); // true
console.log(Boolean(" ")); // true
console.log(Boolean(undefined)); // false
console.log(Boolean( [] )) // true

//Conversion a Number
/*
 [] = 0;
 [30] = 30
 [40, 23, 45] = NaN
 false = 0
 true = 1
*/

console.log(Number([])); // 0
console.log(Number([9])); // 9
console.log(Number([3, 6, 7])); // NaN

//Conversion a String()
/*

[] = ""
[1,2] = 1,2
function(){} = function(){}
{} = [object Object]

*/



