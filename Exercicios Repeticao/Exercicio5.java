import javax.swing.JOptionPane;


public class Exercicio5 {

	public static void main(String[] args) {
		
		// Exercicio 5
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ser calculado o fatorial: "));
		
		for(int i = num - 1; i > 1; i--){
			num *= i;
		}
		
		System.out.println("O fatorial é igual a: " + num);
	}

}
