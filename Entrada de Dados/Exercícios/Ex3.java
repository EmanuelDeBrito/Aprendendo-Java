import javax.swing.JOptionPane;


public class Ex3 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero"));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto n�mero"));
		
		int diferenca = (n1 * n2 - n3 * n4);
		
		
		JOptionPane.showMessageDialog(null, "O resultado � igual a: " + diferenca);
		
	}

}
