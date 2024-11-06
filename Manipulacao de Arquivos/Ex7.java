import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class Ex7 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String caminhoArquivo = JOptionPane.showInputDialog("Digite o caminho do arquivo");
		String tipo = JOptionPane.showInputDialog("Tipo de arquivo");
		
		BufferedReader input = null;
		PrintWriter output = null;
		
		try{
			input = new BufferedReader(new FileReader(caminhoArquivo + "." + tipo));
			output = new PrintWriter(caminhoArquivo + "_copy." + tipo);
			
			String linha;
			
			while((linha = input.readLine()) != null){
				output.println(linha);
			}
			
			System.out.println("Arquivo copiado com sucesso");
			
		}catch(FileNotFoundException e){
			System.out.println(e);
			
		}catch(IOException e){
			System.out.println(e);
			
		}finally{
			if (input != null) { input.close(); };
			if (output != null) { output.close(); }
		}
		
	}

}