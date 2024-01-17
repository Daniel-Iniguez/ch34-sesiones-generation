console.log("JS06- formulario");

// Obtener la referencia del formulario
const registerForm = document.forms["registerForm"];

/**
 * Adjunto un controlador de eventos a un elemento HTML.
 * eventType: Tipo de evento a escuchar
 * fncCallBack: Función de callvback que se ejecutará cuando
 *   suceda el evento.
 * 
 * registerForm.addEventListener( eventType , fncCallback ()=>{} );
 * 
 * El evento se realizará cuando se pulse el botón submit
 */
registerForm.addEventListener( "submit" , ( event )=>{
    // Evita el comportamiento predeterminado asociadoa un evento.
    event.preventDefault();
    console.log(event);

    const user = {
        email : registerForm.elements["inputEmail4"].value ,
        password : registerForm.elements["inputPassword4"].value ,
        confirmPassword : registerForm.elements["inputPassword5"].value,
        termsandconditions : registerForm.elements["gridCheck"].checked
    }

    if( datosVerificados( user )  ){
        enviarDatosAlServidor( user );
    }

} );

const datosVerificados = ( user ) => {
    let response = true;

    if( user.email === "" ){
        mensajeError("Falta introducir el email");
        response = false;
    } else if( user.password.length < 8) {
        mensajeError("El password debe ser mayor o igual a 8 caracteres");
        response = false;
    } else if( user.password !== user.confirmPassword) {
        mensajeError("La confirmación de contraseña no coincide");
        response = false;
    } else if ( !user.termsandconditions ) {
        mensajeError("Debe aceptar los términos y condiciones");
        response = false;
    } else {
        mensajeError("");
    }

    return response;
}

const mensajeError = ( message ) =>{
    console.log( message);
    const errorMessage = document.getElementById("error-message");
    const errorMessageContainer = document.getElementById("error-message-container");

    errorMessage.innerHTML = message;
    if( message === "" ){
        // displaty: none: quita el elemento del DOM
        // visibility: hidden : ocultar visualmente el elemento
        errorMessageContainer.style.display = "none";
    } else{
        errorMessageContainer.style.display = "block";
    }
}

const enviarDatosAlServidor = async( user ) => {
    const userPost = {
        firstName: "Tony",
        lastName: "Doe",
        email: user.email,
        birthdate: "1994-01-23",
        password: user.password,
        role: {
            id: 2
        }
    }

    console.table( userPost );
    
    const url = "https://sp3-ecommerce-oof2.onrender.com/api/v1/users";

    try {
        const response = await fetch( url ,{
            method: "POST",
            body: JSON.stringify(userPost),
            headers: { 
                "Content-Type":"application/json"
            }
        });
        console.log(response);
        const newUser = await response.json();
        console.log( newUser );
        alert("Registro exitoso");
        
    } catch (error) {
        console.error( error );
        alert("Error en el registro");
    }

}
