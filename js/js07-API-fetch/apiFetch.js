/*
 API: Application Programming Interface
   Permite la comunicación entre dos aplicaciones de software
   a travéz de un conjunto de reglas.

 La API Fetch nos ayuda a acceder y manipular 
 peticiones HTTP (DELETE, GET, POST, PUT).
 
 Sintaxis:
    fetch(resource, options)
   
 La API fetch en JavaScript proporciona una interfaz para realizar 
 solicitudes de red, como solicitudes HTTP, de manera asíncrona. 
 Es una forma moderna y más poderosa de realizar solicitudes HTTP 
 en comparación con métodos más antiguos, como XMLHttpRequest.

*/

const urlFakeStore = "pokemones.json";

//Usando .then .catch
const getProducts = (url) => {
   // Realizando solicitud Get
   // .then() consume/maneja la promesa cuando sea resuelta
   // .catch() se ejecuta en caso de que la promesa sea rechazada.
   fetch(url)
      .then((response) => {
         console.log("status code: " + response.status); // 200
         return response.json();
      })
      .then(products => {
         console.log(products);
         imprimirEnDOM(products);
      })
      .catch((error) => {
         console.log("Error en la solicitud: ");
         console.warn(error);
      });
};

//Usando Async Await
const getProductsUsingAsyncAwait = async (url) => {
   try{
      const response = await fetch(url);
      const products = response.json();
      imprimirEnDOM(products);
   }catch (error){
      console.log(error);
   }

}

getProducts(urlFakeStore);


function imprimirEnDOM(products) {
   const productsContainer = document.getElementById("products-container");

   const productsTitles = products.map((product, index, array) => `
      <article class="col-sm-6 col-lg-3">
       <div class="card mx-auto" style="width: 15rem;">
         <img src="${product.image}" class="card-img-top" alt="...">
         <div class="card-body">
            <h5 class="card-title">${product.title}</h5>
            <p class="card-text">${product.description}</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
         </div>
       </div>
      </article>
   `);
   console.log(productsTitles);

   productsContainer.innerHTML = productsTitles.join("");
}