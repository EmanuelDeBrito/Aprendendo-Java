import java.io.File;

import javax.swing.JOptionPane;


public class Ex2 {

	public static void main(String[] args) {
		
		String caminhoPasta = JOptionPane.showInputDialog("Digite o caminho da pasta para listar os arquivos: ");

		File pasta = new File(caminhoPasta);
		
		if(pasta.exists() && pasta.isDirectory()){
			String[] arquivos = pasta.list();
			
			for(String arquivo: arquivos){
				System.out.println(arquivo);
			}
		}else{
			System.out.println("Diretório inexistente");
		}
	}

}
