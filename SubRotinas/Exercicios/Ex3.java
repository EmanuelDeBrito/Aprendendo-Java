import javax.swing.JOptionPane;


public class Ex3 {
	
	public static void main(String[] args) {
		
		// Exercicio 3 -- Operações
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
		JOptionPane.showMessageDialog(null, "Digite a operação \n 1 - SOMA \n 2 - SUBTRAÇÃO \n 3 - MULTIPLICAÇÃO \n 4 - DIVISÃO");
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: "));
		
		float res = calculo(n1, n2, opcao);
		JOptionPane.showMessageDialog(null, "O resultado é igual a: " + res);

	}
	
	public static float calculo(float n1, float n2, int opcao){
		
		if(opcao == 1){
			return n1 + n2;
		}else if(opcao == 2){
			return n1 - n2;
		}else if(opcao == 3){
			return n1 * n2;
		}else if(opcao == 4){
			return n1 / n2;
		}
		
		return 0;
		
	}

}
