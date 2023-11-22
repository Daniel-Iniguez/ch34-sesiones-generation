console.log('JS06-Formulario');

// Obtener la referencia del formulario
const registerForm = document.forms['registerForm'];

/**
 * Adjunto un controlador de eventos a un elemento HTML.
 * eventType: Tipo de evento a escuchar
 * fncCallBack: Función de callvback que se ejecutará cuando
 *   suceda el evento.
 * 
 * registerForm.addEventListener( eventType , fncCallback ()=>{} );
 * El evento se realizara cuando se pulse el botón submit
 */

registerForm.addEventListener("submit",(event)=>{
    // Evita el comportamiento predeterminado asociado a un evento
    event.preventDefault();
    console.log(event);

    const user = {
        email: registerForm.elements["inputEmail4"].value,
        password : registerForm.elements["inputPassword4"].value,
        confirmPassword: registerForm.elements["inputPassword5"].value,
        termsAndConditions: registerForm.elements["gridCheck"].checked,
    }

    if( datosVerificados(user) ){
        enviarDatosAlServidor(user);
    }

});

const datosVerificados = (user) => {
    let response = true;
    // TODO verificar datos
    if( user.email === "" ){
        mensajeError("falta introducir el email");
        response = false;
    }else if (user.password.length < 8){
        mensajeError('La contraseña debe tener al menos 8 caracteres ');
        response = false;
    }else if(user.password !== user.confirmPassword){
        mensajeError('Las contraseñas no son iguales ');
        response = false;
    }else if (!user.termsAndConditions){
        mensajeError('Debe aceptar los terminos y condiciones');
        response = false;
    }/* else mensajeError ("") */

    
    return response;
}

const mensajeError = (message) => {
    console.error(message);
    const errorMessage = document.getElementById("error-message");
    const errorMessageContainer = document.getElementById("error-message-container");

    errorMessage.innerHTML = message;

    if(message != "") errorMessageContainer.style.display = "none";
    else errorMessageContainer.style.display = "block";
}

const enviarDatosAlServidor = (user) => {
    console.table(user);
    // TODO enviar datos a la api del servidor

}
