import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		
		float eixox = Float.parseFloat(JOptionPane.showInputDialog("Digite o eixo x: "));
		float eixoy = Float.parseFloat(JOptionPane.showInputDialog("Digite o eixo y: "));
		
		if(eixox > 0 && eixoy > 0){
			JOptionPane.showMessageDialog(null, "Está no quadrante Q1");
		}else if(eixox < 0 && eixoy > 0){
			JOptionPane.showMessageDialog(null, "Está no quadrante Q2");
		}else if(eixox > 0 && eixoy < 0){
			JOptionPane.showMessageDialog(null, "Está no quadrante Q4");
		}else if(eixox < 0 && eixoy < 0){
			JOptionPane.showMessageDialog(null, "Está no quadrante Q3");
		}else if(eixox == 0 && eixoy == 0){
			JOptionPane.showMessageDialog(null, "Origem");
		}else if(eixox == 0 && eixoy != 0){
			JOptionPane.showMessageDialog(null, "Está no eixo Y");
		}else if(eixox != 0 && eixoy == 0){
			JOptionPane.showMessageDialog(null, "Está no eixo X");
		}
	}

}