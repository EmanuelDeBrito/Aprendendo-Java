import javax.swing.JOptionPane;


public class Ex4 {

	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros"));
		double numero = 0;
		double[] numeros = new double[qtd];
		
		for(int i = 0; i < numeros.length; i++){
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número"));
			numeros[i] = numero;
		}
		
		double[] resultado = maiorValor(numeros);
		
		System.out.println("Maior valor: " + resultado[0]);
		System.out.println("Indice do maior valor: " + resultado[1]);
		
	}
	
	public static double[] maiorValor(double[] numeros){
		double maior = 0;
		double indice = 0;
		
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i] > maior){
				maior = numeros[i];
				indice = i;
			}
		}
		
		double[] vetor = new double[2];
		vetor[0] = maior;
		vetor[1] = indice;
		
		return vetor;
	}
	

}
