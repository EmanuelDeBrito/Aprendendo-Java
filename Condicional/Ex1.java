import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		
		// N�mero negativo ou n�o
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		
		String res = num < 0 ? "Negativo" : "N�o negativo";
		
		JOptionPane.showMessageDialog(null, res);
		
	}

}