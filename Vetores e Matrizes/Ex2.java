import javax.swing.JOptionPane;


public class Ex2 {

	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números: "));
		double numero = 0;
		double[] numeros = new double[qtd];
		
		for(int i = 0; i < numeros.length; i++){
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero: "));
			numeros[i] = numero;
		}
		
		mostrarNumeros(numeros);
		double soma = soma(numeros);
		double media = media(numeros);
		
		JOptionPane.showMessageDialog(null, "Soma dos números: " + soma);
		JOptionPane.showMessageDialog(null, "Media dos números: " + media);

	}
	
	public static void mostrarNumeros(double[] vetor){
		
		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i] + " ");
		}
	
	}
	
	public static double soma(double[] vetor){
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++){
			soma += vetor[i];
		}
		
		return soma;
	}
	
	public static double media(double[] vetor){
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++){
			soma += vetor[i];
		}
		
		double media = soma / vetor.length;
		
		return media;
	}

}
