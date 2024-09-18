import javax.swing.JOptionPane;


//Exercício 1 - calcular o dobro do número

public class Ex1 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ser calculado seu dobro"));
		
		int resposta = calculaDobro(n);
		
		JOptionPane.showMessageDialog(null, "O dobro de " + n + " é: " + resposta);
		
	}
	
	public static int calculaDobro(int n){
		int dobro = n * 2;
			
		return dobro;
	}

}
