import javax.swing.JOptionPane;


public class Ex1 {
	
	// Exercício 1
	
	public static void main(String[] args) {
		
		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em doláres"));
		
		double resultado = converterDolarReal(dolar);
		
		JOptionPane.showMessageDialog(null, String.format("O valor em reias é de: %.2f", resultado));
	}
	
	public static double converterDolarReal(double dolar){
		
		double conversao = 0;
		double cotacao = 5.15;
		
		conversao = dolar * cotacao;
		
		return conversao;
	}

}