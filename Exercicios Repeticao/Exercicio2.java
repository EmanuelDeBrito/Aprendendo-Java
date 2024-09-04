import javax.swing.JOptionPane;


public class Exercicio2 {

	public static void main(String[] args) {
		
		// Exercicio 2
		
		int x;
		int y;
		
		while(true){
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite o ponto x: "));
			y = Integer.parseInt(JOptionPane.showInputDialog("Digite o ponto y: "));
			
			if(x > 0 && y > 0){
				JOptionPane.showMessageDialog(null, "Primeirio setor");
			}else if(x > 0 && y < 0){
				JOptionPane.showMessageDialog(null, "Quarto setor");
			}else if(x < 0 && y < 0){
				JOptionPane.showMessageDialog(null, "Terceiro setor");
			}else if(x < 0 && y > 0){
				JOptionPane.showMessageDialog(null, "Segundo setor");
			}else if(x == 0 || y == 0){
				break;
			}
		}
		
	}

}
