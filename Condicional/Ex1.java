import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		
		// Número negativo ou não
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		String res = num < 0 ? "Negativo" : "Não negativo";
		
		JOptionPane.showMessageDialog(null, res);
		
	}

}