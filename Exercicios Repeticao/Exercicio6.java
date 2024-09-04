import javax.swing.JOptionPane;


public class Exercicio6 {

	public static void main(String[] args) {
		
		// Exercicio 6
		
		String num = JOptionPane.showInputDialog("Digite o número: ");
		
		int x = 0;
		
		int soma = 0;
		
		for(int y = 1; y <= num.length(); y++){
			soma += Integer.parseInt(num.substring(x, y));
			x++;
		}
		
		System.out.println("O valor da soma de cada digito de " + num + " é igual a: "  + soma);
	}

}
