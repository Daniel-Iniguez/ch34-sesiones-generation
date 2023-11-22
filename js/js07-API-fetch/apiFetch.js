/*
 API: Application Programming Interface
   Permite la comunicación entre dos aplicaciones de software
   a travéz de un conjunto de reglas.

 La API Fetch nos ayuda a acceder y manipular 
 peticiones HTTP (DELETE, GET, POST, PUT).
 
 Sintaxis:
    fetch(resource, options)

*/

const urlFakeStore = "https://fakestoreapi.com/products";

const getProducts = ( url ) =>{
    // Realizando solicitud Get
    // .then() consume la promesa cuando sea resuelta
    // .catch() se ejecuta en caso de que la promesa sea rechazada.
    fetch( url )
     .then(  (response)=>{ 
        console.log(response);
        return response.json(); // promesa coversión de JSON a Object
     })
     .then( (products) =>{
        console.log(products);
     } )
}

//getProducts(urlFakeStore);