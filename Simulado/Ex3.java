import javax.swing.JOptionPane;


public class Ex3 {
	
	// Exercício 3
	
	
	public static void main(String[] args) {
		
		double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário fixo"));
		double carrosVendidos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos"));
		double comissaoPorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão por carro vendido"));
		double vendaTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das suas vendas"));
		
		double salarioTotal = calcularSalario(salarioFixo, carrosVendidos, comissaoPorCarro, vendaTotal);
		
		JOptionPane.showMessageDialog(null, String.format("O salário total é de: %.2f", salarioTotal));
		
	}
	
	public static double calcularSalario(double salarioFixo, double carrosVendidos, double comissaoPorCarro, double vendaTotal){
		
		double salarioTotal = 0;
		
		double comissaoTotal = (carrosVendidos * comissaoPorCarro) + ((vendaTotal / 100) * 5);
		
		salarioTotal = salarioFixo + comissaoTotal;
		
		return salarioTotal;
		
	}

}
