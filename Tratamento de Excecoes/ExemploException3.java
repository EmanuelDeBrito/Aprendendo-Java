public class ExemploException3 {

	public static void main(String[] args) {
		
		// Exemplo tratamento de exceções 3
		
		try{
			validaIdade(16);
		}catch(IdadeInvalidaException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public static void validaIdade(int idade) throws IdadeInvalidaException{
		if(idade < 18 || idade > 100){
			throw new IdadeInvalidaException("Idade deve ser igual ou maior a 18 e Menor ou igual a 100");
		}else{
			System.out.println("Aceso permitido");
		}
	}

}

class IdadeInvalidaException extends Exception{
	// Construtor
	public IdadeInvalidaException(String mensagem){
		super(mensagem);
	}
}