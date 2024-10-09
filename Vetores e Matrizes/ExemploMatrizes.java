
public class ExemploMatrizes {

	public static void main(String[] args) {
		
		// Exemplo com matrizes
		int[][] matriz = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14}
		};
		
		System.out.println("Valores da matriz: ");
		
		for(int linha = 0; linha < matriz.length; linha++){
			
			for(int coluna = 0; coluna < matriz[linha].length; coluna++){
				System.out.println("\nLinha: " + linha + "\nColuna: " + coluna);
				System.out.println(matriz[linha][coluna]);
			}
			
		}
	}

}
