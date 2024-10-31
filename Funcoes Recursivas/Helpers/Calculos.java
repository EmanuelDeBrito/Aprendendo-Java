package Helpers;

import java.util.Arrays;

public class Calculos {

	public static int fatorial(int n){
		
		if(n == 1){
			return n;
		}else{
			return n * fatorial(n - 1);
		}
		
	}
	
	public static int somaNumeros(int n){
		
		if(n == 1){
			return 1;
		}else{
			return n + somaNumeros(n - 1);
		}
		
	}
	
	public static int fibonacci(int x, int y, int z, int n){
		
		if(n == 0) return z;
		
		int a = x;
		int b = y;
		int c = z;
		
		c = a + b; // 1
		a = b;
		b = c;
		
		return fibonacci(a, b, c, n - 1);
		
	}
	
	public static int potencia(int n, int e){
		
		if(e == 0) return 1;
		
		return potencia(n, e - 1) * n;
		
	}
	
	public static String inverterString(String[] palavra, String[] clonePalavra, int tamanho, int helper, String palavraInvertida){
		
		if(tamanho < 0){
			palavraInvertida = Arrays.toString(clonePalavra);
			return palavraInvertida;
		}
		
		clonePalavra[helper] = palavra[tamanho];
		
		return inverterString(palavra, clonePalavra, tamanho - 1, helper + 1, palavraInvertida);
		
	}
	
	public static int somaDigitos(String[] numeros, int tamanho, int soma){
		
		if(tamanho < 0) return soma;
		
		int n = Integer.parseInt(numeros[tamanho]);
		soma += n;
		
		return somaDigitos(numeros, tamanho - 1, soma);
		
	}
	
	
}
