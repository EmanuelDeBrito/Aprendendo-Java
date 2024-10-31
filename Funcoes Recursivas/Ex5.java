import java.util.Arrays;

import javax.swing.JOptionPane;

import Helpers.Calculos;


public class Ex5 {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite a palavra para ser invertida: ");
		
		String[] arrayPalavra = new String[palavra.length() - 1];
		
		arrayPalavra = palavra.split(" ");
		
		String res = Calculos.inverterString(arrayPalavra, arrayPalavra.clone(), arrayPalavra.length - 1, 0, "");
		
		System.out.println(res);
	}

}
