public class ExemploException2 {

	public static void main(String[] args) {
		
		// Exemplo tratamento de exceções 2
		
		try{
			validaIdade(16);
		}catch(IllegalArgumentException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public static void validaIdade(int idade){
		if(idade < 18){
			throw new IllegalArgumentException("Idade deve ser igual ou maior a 18");
		}else{
			System.out.println("Aceso permitido");
		}
	}

}