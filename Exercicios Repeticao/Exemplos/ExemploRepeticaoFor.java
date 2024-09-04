
public class ExemploRepeticaoFor {

	public static void main(String[] args) {
		// Exemplo de estrutura de repetição
		for (int i = 1; i <= 10; i++) {
			
			// Quando for igual a 5 pula a interação
			if(i == 5){
				continue;
			}
			
			// Quando for 8 quebra
			if(i == 8){
				break;
			}
			
			System.out.println("O contador é: " + i);
		}
	}

}
