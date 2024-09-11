import javax.swing.JOptionPane;


public class Ex2 {

	public static void main(String[] args) {
		
		// Exercicio 2 -- calculo de varia medias
		
		float res = 0;
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas notas até cinco: "));
		
		switch(op){
			case 2:
				res = calcularMedia2();
				break;
			case 3:
				res = calcularMedia3();
				break;
			case 4:
				res = calcularMedia4();
				break;
			case 5:
				res = calcularMedia5();
				break;
		}
		
		JOptionPane.showMessageDialog(null, String.format("O valor da média é de %.2f", res));

	}
	
	public static float calcularMedia2(){
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		return (n1 + n2) / 2;
		
	}
	
	public static float calcularMedia3(){
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
		return (n1 + n2 + n3) / 3;
		
	}
	
	public static float calcularMedia4(){
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
		float n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota: "));
		return (n1 + n2 + n3 + n4) / 4;
		
	}
	
	public static float calcularMedia5(){
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
		float n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota: "));
		float n5 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quinta nota: "));
		return (n1 + n2 + n3 + n4 + n5) / 5;
		
	}

}
