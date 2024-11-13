import Ex1.Livro;
import Ex2.Circulo;
import Ex3.ContaBancaria;


public class Main {

	public static void main(String[] args) {
		
		exemplo();
		exercicio1();
		exercicio2();
		exercicio3();
		
	}
	
	public static void exemplo(){
		// Exemplo
		
		// Instância
		Pessoa pessoa = new Pessoa();
		
		// Usando os setters para definir valores
		pessoa.setNome("Emanuel");
		pessoa.setIdade(19);
		
		// Usando os getters para acessar os valores
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
	}
	
	public static void exercicio1(){
		// Exercício 1
		
		// Instância
		Livro novoLivro = new Livro();
		
		// Setters
		novoLivro.setTitulo("Volta ao mundo em 90 dias");
		novoLivro.setAutor("Julio Wegner");
		novoLivro.setAnoPublicado(1999);
		
		// Getters
		System.out.println("Título do livro: " + novoLivro.getTitulo());
		System.out.println("Nome do autor: " + novoLivro.getAutor());
		System.out.println("Ano publicado: " + novoLivro.getAnoPublicado());
	}
	
	public static void exercicio2(){
		// Exercicio 2
		
		// Instância
		Circulo novoCirculo = new Circulo();
		
		// Setter
		novoCirculo.setRaio(2);
		
		// Getters
		System.out.println("Raio do círculo: " + novoCirculo.getRaio());
		
		// Área
		double area = novoCirculo.area();
		System.out.println("Área do circulo: " + area);
	}
	
	public static void exercicio3(){
		// Exercício 3
		
		// Instância
		ContaBancaria conta = new ContaBancaria();
		
		// Setters
		conta.setTitular("Emanuel");
		conta.realizarDeposito(1000);
		conta.realizarSaque(1000);
		
		// Getters
		System.out.println("Nome do titular da conta: " + conta.getTitular());
		System.out.println("Saldo da conta: " + conta.getSaldo());
	}

}
