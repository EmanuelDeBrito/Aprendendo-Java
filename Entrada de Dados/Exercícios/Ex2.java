import javax.swing.JOptionPane;


public class Ex2 {
	public static void main(String[] args) {

		float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do c�rculo para c�lculo:"));
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		JOptionPane.showMessageDialog(null, String.format("O valor da �rea do c�rculo � de: %.4f", area));
		
	}

}
