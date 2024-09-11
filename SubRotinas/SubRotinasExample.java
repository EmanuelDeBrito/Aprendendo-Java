
public class SubRotinasExample {

	public static void main(String[] args) {
		
		// Chamando Subrotinas
		saudacao();
		saudacaoPersonalizada("Emanuel", "Brito");
		int res = somar(10, 10);
		int aleatorio = gerarNumeroAleatorio();
		double media = calcularMedia(8.5, 9, 9.1);
		System.out.println("O resultado da soma é de: " + res);
		System.out.println("Número aletorio: " + aleatorio);
		System.out.println("Média das notas: " + media);
		
	}
	
	// Procedimento sem parâmetros
	public static void saudacao(){
		
		System.out.println("Ola meu nome é Emanuel de Brito");
		System.out.println("Isso é uma subrotina de procedimento, ou seja, onde não há retorno");
		
	}
	
	// Procedimento com parâmetros
	public static void saudacaoPersonalizada(String nome, String sobrenome){
		
		System.out.println("Ola " + nome + " " + sobrenome + " muito prazer em conhece-lo");
		
	}
	
	// Função que soma dois números 
	public static int somar(int a, int b){
		
		return a + b;
		
	}
	
	// Função para gerar número aleatório
	public static int gerarNumeroAleatorio(){
		
		return (int) (Math.random() * 100);
		
	}
	
	// Função para calcular a média
	public static double calcularMedia(double n1, double n2, double n3){
		
		return (n1 + n2 + n3) / 3;
		
	}

}