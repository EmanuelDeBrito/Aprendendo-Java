import javax.swing.JOptionPane;


//Exerc�cio 10 - Divisores de um n�mero n

public class Ex10 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		
		divisores(n);
		
	}
	
	public static void divisores(int n){
		
		for(int i = n; i > 0; i--){
			if(n % i == 0){
				JOptionPane.showMessageDialog(null, "Divisor " + i);
			}
		}
		
	}
	

}
