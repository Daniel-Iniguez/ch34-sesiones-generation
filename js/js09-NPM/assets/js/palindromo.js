const esPalindromo = ( frase ) => {
    // TODO realizar la implementación, cosiderando
    // Mayúsculas y espacios.
    frase = frase.toLowerCase().replaceAll(' ', '');
    const palabraInvertida = frase.split('').reverse().join('');
    return frase === palabraInvertida;
}

//exportar la función
module.exports = {esPalindromo}

console.log(esPalindromo("reconocer")); 