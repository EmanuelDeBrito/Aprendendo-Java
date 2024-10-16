import javax.swing.JOptionPane;


public class Ex3 {
	
	// Exercicio 3
	
	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		
		acessarIndice(numeros, 13);
	}
	
	public static void acessarIndice(int numeros[], int indice){
		try{
			System.out.println("Valor do indice pedido: " + numeros[indice]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Índice fora do arranjo" + e);
		}
	}

}
