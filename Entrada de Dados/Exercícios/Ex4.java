import javax.swing.JOptionPane;


public class Ex4 {
	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de cadastro do usuário: "));
		float horas = Float.parseFloat(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
		float salarioHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário: "));
		
		float salarioTotal = salarioHora * horas;
		
		JOptionPane.showMessageDialog(null, "Número funcionário: " + num);
		JOptionPane.showMessageDialog(null, String.format("Salário total do usuário: U$ %.2f", salarioTotal));
		
	}

}
