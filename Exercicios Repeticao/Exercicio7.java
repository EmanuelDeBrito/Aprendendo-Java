import javax.swing.JOptionPane;


public class Exercicio7 {

	public static void main(String[] args) {
		
		// Exercicio 7
		
		int fn1 = 0;
		int fn2 = 1;
		int soma = 0;
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a sequencia de fibonnaci: "));
		
		for(int i = 0; i < num; i++){
			System.out.println(soma);
			
			soma = fn1 + fn2;
			fn1 = fn2;
			fn2 = soma;
		}
	}

}
