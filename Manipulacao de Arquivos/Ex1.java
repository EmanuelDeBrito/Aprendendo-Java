import java.io.File;

import javax.swing.JOptionPane;


public class Ex1 {

	public static void main(String[] args) {
		
		String caminhoPasta = JOptionPane.showInputDialog("Digite o caminho da pasta: ");
		
		File pasta = new File(caminhoPasta);
		
		if(pasta.exists() && pasta.isDirectory()){
			System.out.println("Diretorio existente");
		}else{
			System.out.println("Diretorio inexistente");
		}

	}

}
