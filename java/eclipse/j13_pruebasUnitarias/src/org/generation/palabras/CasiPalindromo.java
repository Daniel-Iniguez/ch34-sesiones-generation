package org.generation.palabras;

public class CasiPalindromo {

	public boolean almostPalindrome(String palabra) {
		// Primero, verifica si la palabra es un palíndromo
        if (esPalindromo(palabra)) {
            return true;
        }

        // Luego, verifica si la palabra se convierte en un palíndromo al eliminar o cambiar al menos un carácter
        int n = palabra.length();
        for (int i = 0; i < n / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(n - 1 - i)) {
                // Intenta eliminar el carácter i y comprueba si el resto es un palíndromo
                String palabraSinCaracter = palabra.substring(0, i) + palabra.substring(i + 1);
                if (esPalindromo(palabraSinCaracter)) {
                    return true;
                }

                // Intenta cambiar el carácter i y comprueba si el resto es un palíndromo
                String palabraCambiada = palabra.substring(0, i) + palabra.charAt(n - 1 - i) + palabra.substring(i + 1);
                if (esPalindromo(palabraCambiada)) {
                    return true;
                }

                // Si ninguno de los intentos tiene éxito, la palabra no es casi un palíndromo
                return false;
            }
        }

        // Si la palabra es de longitud impar, el carácter central no afecta al palíndromo
        return true;
	}
	
	// Función para verificar si una palabra es un palíndromo
    public static boolean esPalindromo(String palabra) {
        String palabraReversa = new StringBuilder(palabra).reverse().toString();
        return palabra.equalsIgnoreCase(palabraReversa);
    }
}
