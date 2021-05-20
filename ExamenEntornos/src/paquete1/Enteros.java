package paquete1;

/**
 * 
 * @author LuisGarrigosa
 * @version 1.0
 */

public class Enteros {
	
	/**
	 * Método que calcula el factorial de un numero
	 * @param n Introduce un numero n para calcular su factorial
	 * @return resultado que se trata del factorial del numero n introducido
	 */
public static int r_factorial(int n) {
		int resultado;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * r_factorial(n - 1);
		}
		return resultado;
}

/**
 * Método que calcula el numero de factoriales de un numero
 * @param n Introduce un numero n para calcular el numero de factoriales de un numero 
 * @return resultado que se trata del numero de factoriales del numero n introducido
 */
public static int factorial(int n) {
		int resultado;

		resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado = resultado * i;
		}
		return resultado;
}

/**
 * Método que calcula una cadena al reves de una cadena dada
 * @param cadena Introduce una cadena para darle la vuelta a la cadena introducida
 * @return resultado que se trata de la cadena al revés de la cadena introducida
 */
public static String alreves(String cadena) {
		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado + cadena.charAt(i);
		}
		return resultado;
}

/**
 * Método que calcula si numero introducido es capicua o no
 * @param n Introduce un numero n para calcular si es capicua o no
 * @return resultado que se trata de si es numero n es capicua o no lo es
 */
public static boolean capicua(int n) {
		boolean resultado;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
}

/**
 * Introduce un multiplo y un divisor para calcular si son divisibles entre ambos
 * @param multiplo numero multiplo del divisor
 * @param divisor numero divisor del multiplo
 * @return resultado que se trata de si el multiplo y el divisor son divisibles entre ambos o no
 */
public static boolean divisible(int multiplo, int divisor) {
		boolean resultado;

		if (multiplo % divisor == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
}

/**
 * Introduce un multiplo y un divisor para calcular si son multiplos entre ambos
 * @param mult numero multiplo del divisor
 * @param divisor numero divisor del multiplo
 * @return resultado que se trata de si el multiplo y el divisor son multiplos entre ambos o no
 */
public static boolean multiplo(int mult, int divisor) {
		boolean resultado;

		try {
			if (mult % divisor == 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} catch (ArithmeticException e) {
			resultado = false;
		}
		return resultado;
}

/**
 * Introduce un numero n para calcular si es primo o no
 * @param n numero introducido para calcular si es primo o no
 * @return primo para decir si es primo o no es primo el numero n introducido
 */
public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
}

/**
 * Introduce un numero n para calcular el numero de numeros primos que existen
 * @param n numero de numeros primos a calcular
 * @return resultado que se trata del numero de numeros primos calculados
 */
public static int n_primos(int n) {
		int resultado = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
}

/**
 * Introduce un numero n para calcular los numeros primos que existen desde 1 hasta el valor del numero dado y escribirlos
 * @param n numero de numeros primos a calcular hasta el numero n
 * @return resultado escribe los numeros primos desde 1 hasta el numero n
 */
public static int[] primosHasta(int n) {
		int[] resultado;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
		}

		return resultado;
}

/**
 * Introduce un numero n para calcular el primer numero de numeros primos que existen hasta el que el contador de primos llegue al numero dado y escribirlos
 * @param n numero de numeros primos a calcular hasta que el contador de primos llegue al valor n
 * @return resultado escribe los numeros primos calculados
 */
public static int[] primerosPrimos(int n) {
		int[] resultado = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado;
	}
}
