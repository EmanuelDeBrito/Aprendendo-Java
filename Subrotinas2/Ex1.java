import javax.swing.JOptionPane;


//Exerc�cio 1 - calcular o dobro do n�mero

public class Ex1 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero para ser calculado seu dobro"));
		
		int resposta = calculaDobro(n);
		
		JOptionPane.showMessageDialog(null, "O dobro de " + n + " �: " + resposta);
		
	}
	
	public static int calculaDobro(int n){
		int dobro = n * 2;
			
		return dobro;
	}

}
