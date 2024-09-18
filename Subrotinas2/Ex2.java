import javax.swing.JOptionPane;


//Exercício 2 - verificar se número é par ou ímpar

public class Ex2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		boolean resultado = verificaParImpar(n);
		
		if(resultado){
			JOptionPane.showMessageDialog(null, "Verdadeiro");
		}else{
			JOptionPane.showMessageDialog(null, "Falso");
		}
	}
	
	public static boolean verificaParImpar(int n){
		return n % 2 == 0 ? true : false;
	}
	

}
