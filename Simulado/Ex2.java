import javax.swing.JOptionPane;


public class Ex2 {
	
	// Exerc�cio 2
	
	
	public static void main(String[] args) {
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio"));
		
		calcularSalario(salario);
		
	}
	
	public static void calcularSalario(double salario){
		
		if(salario > 0){
			if(salario <= 645){
				JOptionPane.showMessageDialog(null, "At� um sal�rio");
			}else if(salario > 645 && salario <= 1935){
				JOptionPane.showMessageDialog(null, "At� tr�s sal�rios");
			}else if(salario > 1935 && salario <= 3225){
				JOptionPane.showMessageDialog(null, "At� cinco sal�rios");
			}else{
				JOptionPane.showMessageDialog(null, "Acima de cinco sal�rios");
			}
		}else{
			JOptionPane.showMessageDialog(null, "O sal�rio tem que ser maior de 0");
		}
		
	}

}
