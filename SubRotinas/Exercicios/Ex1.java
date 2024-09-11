import javax.swing.JOptionPane;


public class Ex1 {

	public static void main(String[] args) {
		
		// Exercicio 1 -- calculo das medias 
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		
		float res = calcularMedia(n1, n2);
		
		JOptionPane.showMessageDialog(null, String.format("O valor da média é de %.2f", res));

	}
	
	public static float calcularMedia(float n1, float n2){
		
		return (n1 + n2) / 2;
		
	}

}
