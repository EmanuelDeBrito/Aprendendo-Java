import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Ex6 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String caminhoArquivo = JOptionPane.showInputDialog("Digite o caminho do arquivo");
		int contador = 0;
		
		BufferedReader input = null;
		
		try{
			input = new BufferedReader(new FileReader(caminhoArquivo));
			
			String linha;
			
			while((linha = input.readLine()) != null){
				contador += 1;
			}
			
			System.out.println("Linhas: " + contador);
			
		}catch(FileNotFoundException e){
			System.out.println(e);
			
		}catch(IOException e){
			System.out.println(e);
			
		}finally{
			if (input != null) { input.close(); };
		}
		
	}

}