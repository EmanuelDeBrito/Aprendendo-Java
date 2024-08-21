import java.util.Scanner;

public class cls_SaidaEntradaDados {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome: ");
		
		String nome = leitor.next();
		
		System.out.println("Ola, " + nome + " prazer em te conhecer");
		
		/* Sempre que abrir um objeto feche, se importe com a memória */
		leitor.close();

	}

}
