
public class ExemploRepeticaoWhile {

	public static void main(String[] args) {
		// Exemplo de estrutura de repeti��o while
		int num = 101;
		
		while(num % 5 != 0 && num % 7 != 0){
			num++;
		}
		
		System.out.println("O primeiro n�mero divis�vel por 5 e 7 depois do 100 �: " + num);
	}

}
