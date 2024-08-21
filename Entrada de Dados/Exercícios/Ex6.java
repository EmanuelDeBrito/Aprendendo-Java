import javax.swing.JOptionPane;


public class Ex6 {
	public static void main(String[] args) {

		float a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de A"));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de B"));
		float c = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de C"));
		
		float triangulo = (a * c) / 2;
		double circulo = (3.14159 * Math.pow(c, 2));
		float trapezio = (a + b) * c / 2;
		double quadrado = Math.pow(b,2);
		float retangulo = a * b;
		
		JOptionPane.showMessageDialog(null, String.format("Área do triângulo: %.3f", triangulo));
		JOptionPane.showMessageDialog(null, String.format("Área do circulo: %.3f", circulo));
		JOptionPane.showMessageDialog(null, String.format("Área do trapezio: %.3f", trapezio));
		JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %.3f", quadrado));
		JOptionPane.showMessageDialog(null, String.format("Área do retângulo: %.3f", retangulo));
		
	}

}
