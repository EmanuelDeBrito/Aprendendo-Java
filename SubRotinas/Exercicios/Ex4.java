import javax.swing.JOptionPane;


public class Ex4 {

	public static void main(String[] args) {
		
		// Exercicio 4 - Numero posivo ou negativo
		float num = Float.parseFloat(JOptionPane.showInputDialog("Digite o número: "));
		positivoOuNegativo(num);

	}
	
	public static void positivoOuNegativo(float n){
		
		if(n > 0){
			JOptionPane.showMessageDialog(null, "O número digitado é positivo");
		}else{
			JOptionPane.showMessageDialog(null, "O número digitado é negativo");
		}
		
	}

}
