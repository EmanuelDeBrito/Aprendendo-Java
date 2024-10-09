
public class ExemploArrayNomes {

	public static void main(String[] args) {
		
		String[] nomes = {"Emanuel", "Viviane", "Danilo", "Silvia"};
		
		System.out.println("Nomes: ");
		
		for(int i = 0; i < nomes.length; i++){
			System.out.println("O nome na posição " + (i + 1) + " é " + nomes[i]);
		}
		
		// Nomes alterados
		System.out.println("\nNomes alterados: ");
		
		// Alterando
		nomes[0] = "Emanuel de Brito";
		
		for(int i = 0; i < nomes.length; i++){
			System.out.println("O nome na posição " + (i + 1) + " é " + nomes[i]);
		}
		
	}

}