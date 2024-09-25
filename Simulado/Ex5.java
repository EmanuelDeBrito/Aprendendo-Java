import javax.swing.JOptionPane;


public class Ex5 {
	
	// Exercício 5
	
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ver se é negativo ou positivo: "));
		
		String resposta = positivoOuNegativo(numero);
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
	
	public static String positivoOuNegativo(int numero){
		
		return numero >= 0 ? "O número é positivo" : "O número é negativo";
		
	}

}
