import javax.swing.JOptionPane;


public class Ex5 {

	public static void main(String[] args) {
	
		// Exercicio 5 -- soma dos numeros no intervalo
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		int somaIntervalos = somaNumerosNoIntervalo(n1, n2);
		
		if(n1 < n2){
			JOptionPane.showMessageDialog(null, "A soma dos intervalos entre " + n1 + " e " + n2 + " é igual a: " + somaIntervalos);
		}else{
			JOptionPane.showMessageDialog(null, "A soma dos intervalos entre " + n2 + " e " + n1 + " é igual a: " + somaIntervalos);
		}

	}
	
	public static int somaNumerosNoIntervalo(int n1, int n2){
		
		int soma = 0;
		
		if(n1 < n2){
			for(int i = n1; i <= n2; i++){
				soma += i;
			}
		}else{
			for(int i = n2; i <= n1; i++){
				soma += i;
			}
		}
		
		return soma;
		
	}

}
