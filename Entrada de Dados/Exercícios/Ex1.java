import javax.swing.JOptionPane;


public class Ex1 {

	public static void main(String[] args) {
		
		System.out.println("Exerc�cio de Soma");
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		
		int soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "O valor da soma de " + n1 + " + " + n2 + " � igual a " + soma);

	}

}
