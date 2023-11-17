console.log('JS06 apiDOM');
/**
 * Modificar un elemento HTML por su ID
 */
const findElementById = () => {
    // Obteer el objeto del DOM
    const titleRef = document.getElementById("title");
    console.log( titleRef );

    // Modificando el contenido
    titleRef.innerHTML = "<h1 class='text-danger'>Clika Ch34</h1>";

    titleRef.innerHTML = `
    <div class='text-center'>
        <h1 class = 'text-danger'>Clicka Ch34</h1>
        <h2 class = 'text-warning'>En el barrio no hay reglas</h2>
    `;
}

findElementById();

/**
 *  Encontrar y modificar elementos por su tag
 */
const changeElementsByTagName = () => {
    // Obtener una colección de elementos 'section'
    const sectionsRef = document.getElementsByTagName("section");
    console.log( sectionsRef ); // 3 objetos section

    // agregar estilo personalizado
    const color = 'purple';
    for (const section of sectionsRef) {
        section.style.border = `2px solid ${color}`
    }

}
changeElementsByTagName();

/**
 * Modificar elemento utilizando el selector universal
 */
const changeElementByQuerySelector = () =>{

    // No trae la referencia del primer elemento que cumpla con
    // la condicón en el selector universar
    // const element = document.querySelector( "#description"  ); // Selector por ID
    // const element = document.querySelector( ".list"  ); // Selector por clase
    // const element = document.querySelector( "p"  ); // Selector por tag
    const element = document.querySelector( "#clickas p" ); // 
    console.log( element );

}
changeElementByQuerySelector();