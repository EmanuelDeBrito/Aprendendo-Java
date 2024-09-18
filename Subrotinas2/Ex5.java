import javax.swing.JOptionPane;


//Exerc�cio 5 - Fatorial de um n�mero

public class Ex5 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		
		int fatorial = fatorial(n);
		
		if(fatorial != 0){
			JOptionPane.showMessageDialog(null, String.format("O fatorial de %d � igual a: %d", n, fatorial));
		}else{
			JOptionPane.showMessageDialog(null, "Digite um n�mero v�lido");
		}
		
		
	}
	
	public static int fatorial(int n){
		
		int fatorial = 1;
		
		if(n > 0){
			for(int i = n; i > 0; i--){
				fatorial *= i;
			}
		}else{
			return 0;
		}
		
		return fatorial;
		
	}
	

}
