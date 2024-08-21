import javax.swing.JOptionPane;


public class Ex3 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número"));
		
		int diferenca = (n1 * n2 - n3 * n4);
		
		
		JOptionPane.showMessageDialog(null, "O resultado é igual a: " + diferenca);
		
	}

}
