import javax.swing.JOptionPane;


public class Ex1 {

	public static void main(String[] args) {
		
		int[] numeros = new int[1];
		int numero = 0;
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n�meros que voc� ir� receber -- MAXIMO 10"));
		
		if(qtd <= 10){
			numeros = new int[qtd];
			
			for(int i = 0; i < numeros.length; i++){
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
				numeros[i] = numero;
			}
			
			for(int j = 0; j < numeros.length; j++){
				if(numeros[j] < 0){
					JOptionPane.showMessageDialog(null, "N�mero negativo: " + numeros[j]);
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "Digite uma quantidade de n�meros menor ou igual a 10");
		}

	}

}
