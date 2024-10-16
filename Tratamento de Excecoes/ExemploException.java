public class ExemploException {

	public static void main(String[] args) {
		
		// Exemplo tratamento de exce��es
		
		try{
			int numeros[] = {1, 2, 3};
			int resultado1 = numeros[5];
			int resultado = 10 / 0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Indice de array invalido");
		}catch(ArithmeticException e){
			System.out.println("Erro, Divis�o por zero n�o permitida");
		}finally{
			System.out.println("Bloco de exce��es finalizado...");
		}
		
		
	}

}
