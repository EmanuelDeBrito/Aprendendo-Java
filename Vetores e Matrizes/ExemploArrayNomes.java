
public class ExemploArrayNomes {

	public static void main(String[] args) {
		
		String[] nomes = {"Emanuel", "Viviane", "Danilo", "Silvia"};
		
		System.out.println("Nomes: ");
		
		for(int i = 0; i < nomes.length; i++){
			System.out.println("O nome na posi��o " + (i + 1) + " � " + nomes[i]);
		}
		
		// Nomes alterados
		System.out.println("\nNomes alterados: ");
		
		// Alterando
		nomes[0] = "Emanuel de Brito";
		
		for(int i = 0; i < nomes.length; i++){
			System.out.println("O nome na posi��o " + (i + 1) + " � " + nomes[i]);
		}
		
	}

}