import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		// Lanchonete
		JOptionPane.showMessageDialog(null, 
		"Cardapio Lanchonete: \n" +
		"1 --- Cachorro Quente --- R$4.00\n" +
		"2 --- X-Salada --- R$4.50\n" + 
		"3 --- X-Bacon --- R$5.00\n" + 
		"4 --- Torrada Simples --- R$2.00\n" + 
		"5 --- Refrigerante --- R$1.50\n"
		);
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
		
		double valor = 0;
		
		switch (cod) {
		case 1:
			valor = 4.00 * qtd;
			break;
		case 2:
			valor = 4.50 * qtd;
			break;
		case 3:
			valor = 5.00 * qtd;
			break;
		case 4:
			valor = 2.00 * qtd;
			break;
		case 5:
			valor = 1.00 * qtd;
			break;	
		default:
			valor = 0;
			break;
		}
		
		String res = valor == 0 ? "Produto inexistente" : String.format("O valor total é de: R$ %.2f", valor);
		
		JOptionPane.showMessageDialog(null, res);
		
	}
}