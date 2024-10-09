import javax.swing.JOptionPane;


public class Ex3 {

	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números: "));
		int[] numeros = new int[qtd];
		int numero = 0;
		
		for(int i = 0; i < numeros.length; i++){
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
			numeros[i] = numero;
		}
		
		numerosPares(numeros);
		int quantidadePares = quantidadePares(numeros);
		System.out.println("Quantidade de pares: " + quantidadePares);

	}
	
	public static void numerosPares(int[] numeros){
		System.out.println("Pares:");
		
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i] % 2 == 0){
				System.out.println(numeros[i]);
			}
		}
	}
	
	public static int quantidadePares(int[] numeros){
		int qtd = 0;
		
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i] % 2 == 0){
				qtd += 1;
			}
		}
		
		return qtd;
	}

}
