import javax.swing.JOptionPane;


public class Ex5 {
	public static void main(String[] args) {

		int p1_num = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da primeira peça"));
		int p1_qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da primeira peça"));
		float p1_price = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço da primeira peça"));
		
		int p2_num = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da segunda peça"));
		int p2_qt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da segunda peça"));
		float p2_price = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço da segunda peça"));
		
		float preco_total = (p1_price * p1_qt) + (p2_price * p2_qt);
		
		JOptionPane.showMessageDialog(null, "IDs -- Primeira: " + p1_num + " Segunda: " + p2_num);
		JOptionPane.showMessageDialog(null, "Quantidade -- Primeira: " + p1_qt + " Segunda: " + p2_qt);
		JOptionPane.showMessageDialog(null, "Preços -- Primeira: " + p1_price + " Segunda: " + p2_price);
		
		JOptionPane.showMessageDialog(null, String.format("Peço total: R$ %.2f", preco_total));
		
	}

}
