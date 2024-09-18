import javax.swing.JOptionPane;


//Exercício 4 - Retornar o maior número entre 2

public class Ex4 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		int maior = verificarMaior(n1, n2);
		
		if(maior != 0){
			JOptionPane.showMessageDialog(null, String.format("O maior número entre %d e %d é %d", n1, n2, maior));
		}else{
			JOptionPane.showMessageDialog(null, String.format("%d e %d são iguais", n1, n2));
		}
		
		
	}
	
	public static int verificarMaior(int n1, int n2){
		
		int maior = 0;
		
		if(n1 > n2){
			maior = n1;
		}else if(n2 > n1){
			maior = n2;
		}else{
			maior = 0;
		}
		
		return maior;
		
	}
	

}
