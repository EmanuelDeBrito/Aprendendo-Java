import javax.swing.JOptionPane;


//Exercício 8 - Enesimo da sequencia de fibonacci

public class Ex8 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos que você deseja: "));
		
		int res = fibonacci(n);
		
		JOptionPane.showMessageDialog(null, String.format("A soma da sequencia de fibonacci do termo %d é igual a: %d", n, res));
		
	}
	
	public static int fibonacci(int n){
		
		int anterior = 0;
		int posterior = 1;
		int soma = 0;
		
		for(int i = 1; i < n; i++){
			soma = anterior + posterior;
			anterior = posterior;
			posterior = soma;
		}
		
		return soma;
		
	}
	

}
