import javax.swing.JOptionPane;


public class ExemploRepeticaoDoWhile {

	public static void main(String[] args) {
		// Exemplo de estrutura de repeti��o do while
		
		int num;
		
		do{
			System.out.println("Digite 0 para sair do programa");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		} while(num != 0);
		
		System.out.println("O n�mero digitado foi: " + num);
	}

}
