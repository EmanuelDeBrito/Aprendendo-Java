import javax.swing.JOptionPane;


public class Ex5 {
	
	// Exerc�cio 5
	
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero para ver se � negativo ou positivo: "));
		
		String resposta = positivoOuNegativo(numero);
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
	
	public static String positivoOuNegativo(int numero){
		
		return numero >= 0 ? "O n�mero � positivo" : "O n�mero � negativo";
		
	}

}
