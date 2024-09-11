import javax.swing.JOptionPane;


public class Ex7 {

	public static void main(String[] args) {
	
		// Exercicio 7 - Produto antigo e atual
		float oldValue = Float.parseFloat(JOptionPane.showInputDialog("Valor antigo do produto: "));
		float newValue = Float.parseFloat(JOptionPane.showInputDialog("Valor novo do produto: "));
		
		float res = calcularAcrescimo(oldValue, newValue);
		
		if(oldValue < newValue){
			JOptionPane.showMessageDialog(null, "O valor do acrescimo é de: " + res);
		}else{
			JOptionPane.showMessageDialog(null, "O valor de decrescimo é de: " + res);
		}

	}
	
	public static float calcularAcrescimo(float oldValue, float newValue){
		
		float res = 0;
		
	
		if(oldValue < newValue){
			res = (newValue / oldValue - 1) * 100; 
		}else{
			res = (oldValue / newValue - 1) * 100; 
		}
		
		return res;
	}

}
