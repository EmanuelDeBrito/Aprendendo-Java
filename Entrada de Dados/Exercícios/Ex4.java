import javax.swing.JOptionPane;


public class Ex4 {
	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de cadastro do usu�rio: "));
		float horas = Float.parseFloat(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
		float salarioHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o sal�rio: "));
		
		float salarioTotal = salarioHora * horas;
		
		JOptionPane.showMessageDialog(null, "N�mero funcion�rio: " + num);
		JOptionPane.showMessageDialog(null, String.format("Sal�rio total do usu�rio: U$ %.2f", salarioTotal));
		
	}

}
