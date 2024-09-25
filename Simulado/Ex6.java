import javax.swing.JOptionPane;


public class Ex6 {
	
	// Exercício 6
	
	
	public static void main(String[] args) {
		
		int resposta = somaNumerosPares();
		
		JOptionPane.showMessageDialog(null, "A soma dos números pares de 1 a 100 é de: " + resposta);
		
	}
	
	public static int somaNumerosPares(){
		
		int resposta = 0;
		
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				resposta = resposta + i;
			}
		}
			
		return resposta;	
		
	}

}
