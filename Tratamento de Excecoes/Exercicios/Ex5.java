import javax.swing.JOptionPane;


public class Ex5 {
	
	// Exercicio 3
	
	public static void main(String[] args) {
		
		try{
			int[] res = teste();
			System.out.println(res[0] * 5);
		}catch(NullPointerException e){
			System.out.println("Valor nulo" + e);
		}
		
	}
	
	public static int[] teste(){
		int[] numeros = null;
		return numeros;
	}

}
