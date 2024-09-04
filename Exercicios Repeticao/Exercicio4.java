import javax.swing.JOptionPane;


public class Exercicio4 {

	public static void main(String[] args) {
		
		// Exercicio 4
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de número a ser digitado: "));
		int num;
		
		for(int i = 1; i <= qtd; i++){
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
			
			if(num >= 10 && num <=20){
				System.out.println(num + " in -- Esta no intervalo");
			}else{
				System.out.println(num + " out -- Não esta no intervalo");
			}
		}
		
	}

}
