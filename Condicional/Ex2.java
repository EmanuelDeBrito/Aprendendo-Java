import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		
		// �mpar ou par
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		
		String parOuImpar = num % 2 == 0 ? "O n�mero � Par" : "O n�mero � �mpar";
		
		JOptionPane.showMessageDialog(null, parOuImpar);
		
	}

}