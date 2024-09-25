import javax.swing.JOptionPane;


public class Ex2 {
	
	// Exercício 2
	
	
	public static void main(String[] args) {
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));
		
		calcularSalario(salario);
		
	}
	
	public static void calcularSalario(double salario){
		
		if(salario > 0){
			if(salario <= 645){
				JOptionPane.showMessageDialog(null, "Até um salário");
			}else if(salario > 645 && salario <= 1935){
				JOptionPane.showMessageDialog(null, "Até três salários");
			}else if(salario > 1935 && salario <= 3225){
				JOptionPane.showMessageDialog(null, "Até cinco salários");
			}else{
				JOptionPane.showMessageDialog(null, "Acima de cinco salários");
			}
		}else{
			JOptionPane.showMessageDialog(null, "O salário tem que ser maior de 0");
		}
		
	}

}
