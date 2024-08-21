import javax.swing.JOptionPane;


public class cls_SaidaEntradaDadosJO {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " e você tem " + idade + " anos de idade.", "Apresentação", JOptionPane.QUESTION_MESSAGE);

	}

}
