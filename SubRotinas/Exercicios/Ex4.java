import javax.swing.JOptionPane;


public class Ex4 {

	public static void main(String[] args) {
		
		// Exercicio 4 - Numero posivo ou negativo
		float num = Float.parseFloat(JOptionPane.showInputDialog("Digite o n�mero: "));
		positivoOuNegativo(num);

	}
	
	public static void positivoOuNegativo(float n){
		
		if(n > 0){
			JOptionPane.showMessageDialog(null, "O n�mero digitado � positivo");
		}else{
			JOptionPane.showMessageDialog(null, "O n�mero digitado � negativo");
		}
		
	}

}
