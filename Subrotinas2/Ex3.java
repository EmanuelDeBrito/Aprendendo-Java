import javax.swing.JOptionPane;


//Exerc�cio 3 - Sauda��o personalizada

public class Ex3 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		saudacao(nome);
		
	}
	
	public static void saudacao(String nome){
		
		JOptionPane.showMessageDialog(null, "Prazer em te conhecer " + nome);
		
	}
	

}
