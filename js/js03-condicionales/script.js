console.log("Sesion JS03 Condicionales")
/*
  ============ Condicional if - else ====================

  La condicional if ejecuta una sentencia si una condición
  especificada es evaluada como verdadera. En caso contrario
  podemos usar la sentencia else.

  Sintaxis:

  if ( condición ) sentencia;

  if (condición ) {
   sentencia1;
   sentencia2;
   sentencia3;
   sentenciaN;
  }

  if ( condición ) 
    sentenciaVerdadera;
  else 
    sentenciaFalsa;

  if ( condición ) sentenciaVerdadera;
  else sentenciaFalsa;


*/

const temperatura = 22;

// Verificar temperatura, si es mayor o igual a 26 grados
// imprimir en consola "Team Calor"
// en caso contrario "Team frio"

if (temperatura >= 26) {
    console.log("Team calor");
} else {
    console.log("Team frio");
}

if (temperatura === 21) console.log("Temperatura sabrudoski");

console.log("Me pongo short con calcetines");

//=========================================
const temp = 20;

if (temp === 15) {
    console.log("Frio");
    console.log("Esto no le gusta a Nan");
}
else
    console.log("Temp. a analizar");

//=========================================
const age = 25;

if (age === 50)  /*instrucción*/;

console.log("Estás en el 5o piso");
console.log("Fin de analizar tu edad");

// ====================================
function verdadero() {
    return true;
}

if (verdadero())
    console.log("Resultado verdadero");
console.log("Se termina de analizar la función")

/*
 ================= Sentencia if- else if - else ========
  if (condición ) sentencia;
  else if (condición2 ) sentencia2;
  else if (condiciónN ) sentenciaN;
  else sentenciaFalse;
*/

const color = 'negro';
let mensaje = '';

/*
if (color === "negro") {
    mensaje = "Color negro";
}
else {
    if (color === "verde"){
        mensaje = "color verde";
    }
    else {
        if (color === "azul"){            
            mensaje = "color azul";
        }
        else {
            mensaje = "No tengo el color registrado";
        }
    }
}
*/

if (color === "negro") mensaje = "Color negro";
else if (color === "verde") mensaje = "color verde";
else if (color === "azul") mensaje = "color azul";
else mensaje = "No tengo el color registrado";

/*
 ================ Sentecia Switch ===================
  La sentencia Switch evalua una expresió y se compara
  con el valor de cada instancia en "case" y se ejecuta las
  sentenicas asociadas a ese "case" hasta que se ecuentre
  la sentencia break o que finalice el Switch.

  La evaluación es estricta ( === ).

  Sintaxis:
   switch( expresión ) {
     case valor1:
        sentecias;
        break;
     case valor2:
        sentencias;
        break;
     case valorN:
        sentencias;
        break;
     default:
        sentencias;
        break;
   }

*/
const personName = 'kim';
mensaje = "";

switch (personName) {
    case 'Sergio':
        mensaje = 'Hola Sergio, instructor'
        break;
    case 'Tony':
        mensaje = 'Ey, Tony';
        console.log('Estoy atendiendo a tony')
        break;
    case 'Gaby':
        mensaje = 'Hola, Gaby';
        break;
    default:
        mensaje = 'Persona desconocida';
}

console.log(mensaje)


// ====================
/*
Imprimir aprobado si la calificación es 7,8,9,10
Imprimir reporbado fuera de esos numeros
realizarlo con switch dentro de una función
*/

const calificacion = calif => {
    switch (calif) {
        case 7:
        case 8:
        case 9:
        case 10:
            console.log('Aprobado');
            break;
        default:
            console.log('Reprobado');
    }
}

calificacion(7);

// =====================================================
/*
 Realizar dos funciones, una usando switch y otra con if-else if-else
  
 Donde verifique el mes del 1 al 12 y despliegue la estación del año.

 mes 12 , 1, 2 = Invierno
 mes 3, 4, 5 = Primavera
 mes 6, 7, 8 = Verano
 mes 9, 10, 11 = Otoño

*/
const estacionAño = mes => {
    switch (mes) {
        case 1:
        case 2:
        case 12:
            console.log('Invierno');
            break;
        case 3:
        case 4:
        case 5:
            console.log('Primavera');
            break;
        case 6:
        case 7:
        case 8:
            console.log('Verano');
            break;
        case 9:
        case 10:
        case 11:
            console.log('Otoño');
            break;
        default:
            console.log('NO ES VALIDO');
    }
}

const estacionAño2 = mes => {
    if (mes === 1 || mes === 2 || mes === 12) console.log('Invierno');
    else if (mes >= 3 && mes <= 5) console.log('Primavera');
    else if (mes >= 6 && mes <= 8) console.log('Verano');
    else if (mes >= 9 && mes <= 11) console.log('Otoño');
    else console.log('NO ES VALIDO');
}

estacionAño(12);
estacionAño(4);
estacionAño(7);
estacionAño(10);
console.log('--------------')
//--------------------
estacionAño2(12);
estacionAño2(4);
estacionAño2(7);
estacionAño2(10);

/*
====================Operador Ternario=============================
Es el unico operador de JavaScript que tiene 3 operandos.
Generalmente se usa como ocpion simplificada a la sentencia if-else

Sintaxis:
condición ? expresionSiCondiciónEsTrue: expresionSiCondiciónEsFalsa;

*/

const subtotal = 1_000_000;
const esFrontera = true;
let total;

if (esFrontera) total = subtotal * 1.08;
else total = subtotal * 1.16;
console.log(`El total es: ${total}`)

//Aplicando operador ternario
const totalConIVA = (esFrontera? subtotal * 1.08 : subtotal * 1.16);
console.log(`El total con iva es: ${totalConIVA}`)

// Reducción con el operador ternario
console.log(`Total : ${ subtotal * (esFrontera ? 1.08 : 1.16) }`);

/*  
  Evaluar la edad de una persona
  Si la persona es igual o mayor a 18 : puede votar
  En caso contrario: no puede votar

*/
const personaEdad = edad => console.log(`La persona ${(edad >= 18 ? 'puede votar' : 'no puede votar') }`);
personaEdad(17);
personaEdad(18);

