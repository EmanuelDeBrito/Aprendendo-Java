import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		// M�ltiplos ou n�o 
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		
		if (num1 >= num2) {
			if(num1 % num2 == 0){
				JOptionPane.showMessageDialog(null, "S�o m�ltiplos");			
			}else {
				JOptionPane.showMessageDialog(null, "N�o S�o m�ltiplos");
			}
		}else if(num2 >= num1){
			if(num2 % num1 == 0){
				JOptionPane.showMessageDialog(null, "S�o m�ltiplos");
			}else {
				JOptionPane.showMessageDialog(null, "N�o S�o m�ltiplos");
			}
		}
	}

}