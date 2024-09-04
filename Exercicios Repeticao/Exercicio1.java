import javax.swing.JOptionPane;


public class Exercicio1 {

	public static void main(String[] args) {
		
		// Exercicio 1
		int senha;
		
		while(true){
			senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
			
			if(senha == 2002){
				System.out.println("Acesso permitido, senha correta");
				break;
			}
			else{
				System.out.println("Acesso negado, a senha " + senha + " não é a correta");
			}
		}
		
	}

}
