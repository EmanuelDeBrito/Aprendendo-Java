import javax.swing.JOptionPane;


//Exerc�cio 2 - verificar se n�mero � par ou �mpar

public class Ex2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		
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
