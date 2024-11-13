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
		
		// Inst�ncia
		Pessoa pessoa = new Pessoa();
		
		// Usando os setters para definir valores
		pessoa.setNome("Emanuel");
		pessoa.setIdade(19);
		
		// Usando os getters para acessar os valores
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
	}
	
	public static void exercicio1(){
		// Exerc�cio 1
		
		// Inst�ncia
		Livro novoLivro = new Livro();
		
		// Setters
		novoLivro.setTitulo("Volta ao mundo em 90 dias");
		novoLivro.setAutor("Julio Wegner");
		novoLivro.setAnoPublicado(1999);
		
		// Getters
		System.out.println("T�tulo do livro: " + novoLivro.getTitulo());
		System.out.println("Nome do autor: " + novoLivro.getAutor());
		System.out.println("Ano publicado: " + novoLivro.getAnoPublicado());
	}
	
	public static void exercicio2(){
		// Exercicio 2
		
		// Inst�ncia
		Circulo novoCirculo = new Circulo();
		
		// Setter
		novoCirculo.setRaio(2);
		
		// Getters
		System.out.println("Raio do c�rculo: " + novoCirculo.getRaio());
		
		// �rea
		double area = novoCirculo.area();
		System.out.println("�rea do circulo: " + area);
	}
	
	public static void exercicio3(){
		// Exerc�cio 3
		
		// Inst�ncia
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
