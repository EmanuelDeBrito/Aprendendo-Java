import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Ex3 {

	public static void main(String[] args) {
		
		String caminhoPasta = JOptionPane.showInputDialog("Digite o caminho da pasta para listar os arquivos: ");
		String nomeArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo");
		
		File pasta = new File(caminhoPasta);
		
		if(pasta.exists() && pasta.isDirectory()){
			try{
				File arquivo = new File(caminhoPasta + nomeArquivo + ".txt");
				arquivo.createNewFile();
				System.out.println("Arquivo criado com sucesso");
			}catch(IOException e){
				System.out.println(e);
			}
		}
		
	}

}
