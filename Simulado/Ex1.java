import javax.swing.JOptionPane;


public class Ex1 {
	
	// Exerc�cio 1
	
	public static void main(String[] args) {
		
		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dol�res"));
		
		double resultado = converterDolarReal(dolar);
		
		JOptionPane.showMessageDialog(null, String.format("O valor em reias � de: %.2f", resultado));
	}
	
	public static double converterDolarReal(double dolar){
		
		double conversao = 0;
		double cotacao = 5.15;
		
		conversao = dolar * cotacao;
		
		return conversao;
	}

}