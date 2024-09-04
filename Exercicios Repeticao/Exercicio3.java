import javax.swing.JOptionPane;


public class Exercicio3 {

	public static void main(String[] args) {
		
		// Exercicio 3
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		for(int i = 1; i <= num; i++){
			if(i % 2 != 0){
				System.out.println("Valores ímpar de 1 até " + num + " : " + i);
			}
		}
		
	}

}
