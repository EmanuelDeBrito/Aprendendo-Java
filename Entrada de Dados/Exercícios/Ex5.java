import javax.swing.JOptionPane;


public class Ex5 {
	public static void main(String[] args) {

		int p1_num = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da primeira pe�a"));
		int p1_qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da primeira pe�a"));
		float p1_price = Float.parseFloat(JOptionPane.showInputDialog("Digite o pre�o da primeira pe�a"));
		
		int p2_num = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da segunda pe�a"));
		int p2_qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da segunda pe�a"));
		float p2_price = Float.parseFloat(JOptionPane.showInputDialog("Digite o pre�o da segunda pe�a"));
		
		float preco_total = (p1_price * p1_qt) + (p2_price * p2_qt);
		
		JOptionPane.showMessageDialog(null, "IDs -- Primeira: " + p1_num + " Segunda: " + p2_num);
		JOptionPane.showMessageDialog(null, "Quantidade -- Primeira: " + p1_qt + " Segunda: " + p2_qt);
		JOptionPane.showMessageDialog(null, "Pre�os -- Primeira: " + p1_price + " Segunda: " + p2_price);
		
		JOptionPane.showMessageDialog(null, String.format("Pe�o total: R$ %.2f", preco_total));
		
	}

}
