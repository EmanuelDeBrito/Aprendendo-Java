import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;


//Exercício 9 - Sort

public class Ex9 {

	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos"));
		
		ordenar(qtd);
		
	}
	
	public static void ordenar(int qtd){
		
		int numeros[] = new int[qtd];
		
		for(int i = 0; i < qtd; i++){
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		}
		
		Arrays.sort(numeros);
	
		
		System.out.println("Sort: " + Arrays.toString(numeros));
		
		
	}
	

}
