
public class SubRotinasExample {

	public static void main(String[] args) {
		
		// Chamando Subrotinas
		saudacao();
		saudacaoPersonalizada("Emanuel", "Brito");
		int res = somar(10, 10);
		int aleatorio = gerarNumeroAleatorio();
		double media = calcularMedia(8.5, 9, 9.1);
		System.out.println("O resultado da soma � de: " + res);
		System.out.println("N�mero aletorio: " + aleatorio);
		System.out.println("M�dia das notas: " + media);
		
	}
	
	// Procedimento sem par�metros
	public static void saudacao(){
		
		System.out.println("Ola meu nome � Emanuel de Brito");
		System.out.println("Isso � uma subrotina de procedimento, ou seja, onde n�o h� retorno");
		
	}
	
	// Procedimento com par�metros
	public static void saudacaoPersonalizada(String nome, String sobrenome){
		
		System.out.println("Ola " + nome + " " + sobrenome + " muito prazer em conhece-lo");
		
	}
	
	// Fun��o que soma dois n�meros 
	public static int somar(int a, int b){
		
		return a + b;
		
	}
	
	// Fun��o para gerar n�mero aleat�rio
	public static int gerarNumeroAleatorio(){
		
		return (int) (Math.random() * 100);
		
	}
	
	// Fun��o para calcular a m�dia
	public static double calcularMedia(double n1, double n2, double n3){
		
		return (n1 + n2 + n3) / 3;
		
	}

}