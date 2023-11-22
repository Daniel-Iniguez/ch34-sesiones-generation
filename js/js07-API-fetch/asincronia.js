console.log('JS07-Asincronía la Rosalia');

/*
 Programación Síncrona.

 - En un programa síncrono, las operaciones se ejecutan 
 una después de la otra, en orden secuencial.
 - Cada operación espera a que la anterior se complete 
 antes de comenzar.
 - Puede haber bloqueo del hilo principal mientras 
 se espera la finalización de una operación.

*/
const primerPaso = () => console.log("01- Inicio del mi programa");

const segundoPaso = () => console.log("02- Desarrollo del mi programa");

const tercerPaso = () => console.log("03- Fin de mi programa");


primerPaso();
segundoPaso();
tercerPaso();

/*
 Programación Asíncrona.
  - En un programa asíncrono, las operaciones no esperan 
  a que la anterior se complete antes de comenzar. 
  En cambio, se utilizan mecanismos como callbacks, 
  promesas o async/await para manejar la asincronía.
  - Las operaciones que pueden llevar tiempo (por ejemplo, 
    solicitudes de red o lecturas de archivos) no bloquean el hilo principal.
  - Esto mejora la eficiencia al permitir que otras operaciones 
  se ejecuten mientras se espera la finalización de una 
  operación asincrónica.

*/

/*
   setTimeout()

   Establece un temporizador que ejecuta una función de callback
   una vez que expire el temporizador

   sintaxis:
     setTimeout( fncCallback, tiempo_ms, argumentos_fnc );
     setTimeout( ()=>{}  , tiempo_ms );

 */
const pasoAsincrono = (name) => {
    setTimeout(()=>console.log(`Hola ${name}`), 2000)
}

console.log("===== Asinctono =====");
primerPaso();
//pasoAsincrono('Dios Daniel');
tercerPaso();


// ------------------- setInterval -----------------
// Ejecuta una función de manera reiterada con un tiempo de retardo fijo.

const startInterval = document.getElementById('startInterval');
const stopInterval = document.getElementById('stopInterval');
const counterRef = document.getElementById('counter');

let counter = 0;
let intervalID;

startInterval.addEventListener( "click" , (event)=>{
    intervalID = setInterval( () => console.log( ++counter ),1000);
    setInterval( () => counterRef.innerHTML= counter,1000 );
    console.log('Interval ID', intervalID);
    if (intervalID > 0) {
        
    }

})

stopInterval.addEventListener("click",() => {
    //Detener el intervalo
    clearInterval(intervalID);
});

resetInterval.addEventListener("click",() => {
    counter = 0;
    counterRef.innerHTML = counter;
});

const disableStartButton = ( value ) => {
    startInterval.disabled = value;
}

const disableStopButton = ( value ) => {
    stopInterval.disabled = value;
}

const disableResetButton = ( value ) => {
    resetInterval.disabled = value;
    resetInterval.style.display = value? "none" : "inline";
}

( function(){
    disableStartButton( false);
    disableStopButton(false);
    disableResetButton(false);
} )();

