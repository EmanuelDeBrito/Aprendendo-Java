import javax.swing.JOptionPane;


public class ExemploRepeticaoDoWhile {

	public static void main(String[] args) {
		// Exemplo de estrutura de repetição do while
		
		int num;
		
		do{
			System.out.println("Digite 0 para sair do programa");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		} while(num != 0);
		
		System.out.println("O número digitado foi: " + num);
	}

}
