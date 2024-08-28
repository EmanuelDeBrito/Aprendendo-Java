import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		
		// Ímpar ou par
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		String parOuImpar = num % 2 == 0 ? "O número é Par" : "O número é ímpar";
		
		JOptionPane.showMessageDialog(null, parOuImpar);
		
	}

}