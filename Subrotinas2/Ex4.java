import javax.swing.JOptionPane;


//Exerc�cio 4 - Retornar o maior n�mero entre 2

public class Ex4 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		int maior = verificarMaior(n1, n2);
		
		if(maior != 0){
			JOptionPane.showMessageDialog(null, String.format("O maior n�mero entre %d e %d � %d", n1, n2, maior));
		}else{
			JOptionPane.showMessageDialog(null, String.format("%d e %d s�o iguais", n1, n2));
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
