import javax.swing.JOptionPane;


public class Ex2 {
	
	// Exercicio 2
	
	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("Digite um numero inteiro");
		
		converterStringParaInteiro(n);
	}
	
	public static void converterStringParaInteiro(String n){
		int res;
		
		try{
			res = Integer.parseInt(n);
			System.out.println("String convertida para inteiro: " + res);
		}catch(NumberFormatException e){
			System.out.println("A conversão da String para Inteiro não foi possível :(" + e);
		}
		
	}

}
