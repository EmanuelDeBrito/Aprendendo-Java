import javax.swing.JOptionPane;


public class Ex3 {
	
	public static void main(String[] args) {
		
		// Exercicio 3 -- Opera��es
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		JOptionPane.showMessageDialog(null, "Digite a opera��o \n 1 - SOMA \n 2 - SUBTRA��O \n 3 - MULTIPLICA��O \n 4 - DIVIS�O");
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a op��o: "));
		
		float res = calculo(n1, n2, opcao);
		JOptionPane.showMessageDialog(null, "O resultado � igual a: " + res);

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
