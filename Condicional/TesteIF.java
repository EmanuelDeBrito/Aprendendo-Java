public class TesteIF {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		if (num > 0) {
			System.out.println("Numero Positivo");
		} else if(num < 0) {
			System.out.println("Número Negativo");
		} else {
			System.out.println("Número igual a zero");
		}
		
		// EXEMPLO DE CONDIÇÃO ENCADEADA
		if((num > 0) && (num < 100)){
			System.out.println("O num esta entre 1 e 99");
		}
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("O número é positivo e par");
			}
		}
		
	}

}
