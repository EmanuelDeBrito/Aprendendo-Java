import javax.swing.JOptionPane;


public class Ex8 {

	public static void main(String[] args) {
	
		// Exercicio 8 - Média ponderada ou aritmetica
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcção: \n 0 - Aritmetica \n 1 - Ponderada"));
		
		float media = calcularMedia(n1, n2, n3, op);
		
		JOptionPane.showMessageDialog(null, "O valor da media é igual a: " + media);

	}
	
	public static float calcularMedia(float n1, float n2, float n3, int op){
		
		float media = 0;
		
		switch (op) {
		case 0:
			media = (n1 + n2 + n3) / 3;
			break;
		case 1:
			media = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
			break;
		default:
			break;
		}
		
		return media;
		
	}

}
