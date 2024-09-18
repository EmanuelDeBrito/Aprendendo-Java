import javax.swing.JOptionPane;


//Exercício 5 - Fatorial de um número

public class Ex5 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		int fatorial = fatorial(n);
		
		if(fatorial != 0){
			JOptionPane.showMessageDialog(null, String.format("O fatorial de %d é igual a: %d", n, fatorial));
		}else{
			JOptionPane.showMessageDialog(null, "Digite um número válido");
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
