import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		// Múltiplos ou não 
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		
		if (num1 >= num2) {
			if(num1 % num2 == 0){
				JOptionPane.showMessageDialog(null, "São múltiplos");			
			}else {
				JOptionPane.showMessageDialog(null, "Não São múltiplos");
			}
		}else if(num2 >= num1){
			if(num2 % num1 == 0){
				JOptionPane.showMessageDialog(null, "São múltiplos");
			}else {
				JOptionPane.showMessageDialog(null, "Não São múltiplos");
			}
		}
	}

}