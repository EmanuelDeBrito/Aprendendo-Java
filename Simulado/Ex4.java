import javax.swing.JOptionPane;


public class Ex4 {
	
	// Exerc�cio 4
	
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero para o c�lculo do fatorial"));
		
		int fatorial = fatorial(numero);
		
		if(fatorial == 0){
			JOptionPane.showMessageDialog(null, "Digite um n�mero positivo");
		}else{
			JOptionPane.showMessageDialog(null, "O valor do fatorial � de: " + fatorial);
		}
		
	}
	
	public static int fatorial(int numero){
		
		int res = 0;
		
		if(numero <= 0) return 0;
		
		res = 1;
		
		for(int i = numero; i > 1; i--){
			res = res * i;
		}
		
		return res;
		
	}

}
