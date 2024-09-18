import javax.swing.JOptionPane;


//Exerc�cio 7 - Mediana

public class Ex7 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));
		
		double res = medio(n1, n2, n3);
		
		if(res != 0){
			JOptionPane.showMessageDialog(null, "O valor do meio �: " + res);
		}else{
			JOptionPane.showMessageDialog(null, "H� n�mero iguais");
		}
		
	}
	
	public static double medio(double n1, double n2, double n3){
		
		double res = 0;
		
		if( (n1 > n2 && n1 < n3) || (n1 > n3 && n1 < n2) ){
			res = n1;
		}else if( (n2 > n1 && n2 < n3) || (n2 > n3 && n2 < n1) ){
			res = n2;
		}else if( (n3 > n1 && n3 < n2) || (n3 > n2 && n3 < n1) ){
			res = n3;
		}
		
		return res;
		
	}
	

}
