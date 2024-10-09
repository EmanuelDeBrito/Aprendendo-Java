
public class ExemploArray {

	public static void main(String[] args) {
		
		int soma = 0;
		
		int[] numeros = new int[5];
		
		// Atribuindo valor ao vetor de números
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		System.out.println("Valor do vetor: ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Valor do indice " + (i + 1) + ": " + numeros[i]);
		}
		
		System.out.println("\n");
		
		// Alterando um valor no vetor
		numeros[3] = 100;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Valor do indice " + (i + 1) + ": " + numeros[i]);
		}
		
		// Somando os números
		for(int i = 0; i < numeros.length; i++){
			soma += numeros[i];
		}
		
		System.out.println("\nA soma dos números é de: " + soma);
		
		// Fazendo a media
		for(int i = 0; i < numeros.length; i++){
			soma += numeros[i];
		}
		
		System.out.println("\nA media dos números é de: " + (soma / numeros.length));
	}

}
