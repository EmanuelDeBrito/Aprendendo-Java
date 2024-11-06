import java.io.File;

import javax.swing.JOptionPane;


public class Ex4 {

	public static void main(String[] args) {
		
		String caminhoArquivo = JOptionPane.showInputDialog("Digite o diretorio do arquivo");
		String nomeArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo");
		
		File arquivo = new File(caminhoArquivo + nomeArquivo + ".txt");
		
		if(arquivo.exists() && arquivo.isFile()){
			String newName = JOptionPane.showInputDialog("Digite o novo nome do arquivo");
			
			arquivo.renameTo(new File(caminhoArquivo + newName + ".txt"));
			System.out.println("Arquivo renomeado com sucesso");
		}else{
			System.out.println("Arquivo não encontrado");
		}
	}

}
