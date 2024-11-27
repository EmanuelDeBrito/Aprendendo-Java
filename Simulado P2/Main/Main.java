import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

import Ex1.Produto;
import Ex2.Aluno;


public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		int[] lista = {1, 2, 3, 4};
		
		// Eercício 1 - Le o arquivo por linha e manda para o metodo exercicio 1 para criar a instância do produto
		lerArquivo();
		
		// Exercicio 2 - Cria a instância do aluno com seus atributos e mostra a média
		exercicio2();
		
		// Exercicio 3 - Conta as linhas do arquivo e a média de palavras por linha
		exercicio3();
		
		// Exercicio 4 - Verifica se o array está em ordem crescente, senão estiver coloca ele em ordem crescente
		exercicio4(lista);

	}
	
	public static void exercicio1(String produto){
		String[] array = produto.split(",");
		
		Produto p = new Produto();
		
		p.setNome(array[0]);
		p.setQuantidade(array[1]);
		p.setPreco(array[2]);
		
		String nome = p.getNome();
		String quantidade = p.getQuantidade();
		String preco = p.getPreco();
		
		System.out.println("Nome: " + nome);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço: " + preco);
	}
	
	public static void exercicio2(){
		Aluno a = new Aluno();
		int[] notas = new int[3];
		
		// Setando nome
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		a.setNome(nome);
		
		// Setando notas
		for(int i = 0; i < notas.length; i++){
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i + 1) + " nota do aluno"));
			notas[i] = nota;
		}
		a.setNotas(notas);
		
		// Pegando nome
		String resultadoNome = a.getNome();
		System.out.println(resultadoNome);
		
		// Pegando notas
		String resultadoNotas = a.getNotas();
		System.out.println(resultadoNotas);
		
		// Vendo a média
		float resultadoMedia = a.calcularMedia();
		System.out.println("Média igual a: " + resultadoMedia);
		
	}
	
	public static void exercicio3() throws FileNotFoundException, IOException{
		
		String caminhoArquivo = JOptionPane.showInputDialog("Digite o caminho do arquivo");
		int contadorLinhas = 0;
		int contadorPalavras = 0;
		
		BufferedReader input = null;
		
		try{
			input = new BufferedReader(new FileReader(caminhoArquivo));
			
			String linha;
			
			while((linha = input.readLine()) != null){
				contadorLinhas += 1;
				String[] arrayLinha = linha.split(" ");
				contadorPalavras += arrayLinha.length;
			}
			
			System.out.println("Linhas: " + contadorLinhas);
			System.out.println("Palavra em media por linha: " + contadorPalavras / contadorLinhas);
			
		}catch(FileNotFoundException e){
			System.out.println(e);
			
		}catch(IOException e){
			System.out.println(e);
			
		}finally{
			if (input != null) { input.close(); };
		}
	}
	
	public static void exercicio4(int lista[]){
		boolean isOk = true;
		
		for(int i = 0; i < lista.length; i++){
			if(i != lista.length - 1){
				if(lista[i] > lista[i + 1]){
					isOk = false;
				}	
			}
		}
		
		if(isOk == false){
			System.out.println("A lista não está em ordem crescente");
			Arrays.sort(lista);
			mostrarListaCrescente(lista);
		}else{
			System.out.println("A lista está em ordem crescente");
		}
	}
	
	public static void mostrarListaCrescente(int lista[]){
		System.out.println("Em ordem crescente");
		System.out.println(Arrays.toString(lista));
	}
	
	public static void lerArquivo() throws FileNotFoundException, IOException{
		String caminhoArquivo = JOptionPane.showInputDialog("Digite o caminho do arquivo");
		
		BufferedReader input = null;
		
		try{
			input = new BufferedReader(new FileReader(caminhoArquivo));
			
			String linha;
			
			while((linha = input.readLine()) != null){
				exercicio1(linha);
			}
			
		}catch(FileNotFoundException e){
			System.out.println(e);
			
		}catch(IOException e){
			System.out.println(e);
			
		}finally{
			if (input != null) { input.close(); };
		}
	}

}
