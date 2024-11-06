import java.io.File;

import javax.swing.JOptionPane;


public class Ex5 {

	public static void main(String[] args) {
		
		String caminhoArquivo = JOptionPane.showInputDialog("Digite o caminho do arquivo");
		
		File arquivo = new File(caminhoArquivo);
		
		if(arquivo.exists() && arquivo.isFile()){
			arquivo.delete();

			System.out.println("Arquivo deletado com sucesso");
		}else{
			System.out.println("Arquivo não encontrado");
		}
	}

}
