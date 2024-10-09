import javax.swing.JOptionPane;


public class Ex6 {

	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas"));
		String[][] matriz = new String[qtd][2];
		String altura;
		String sexo;
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				if(j == 0){
					altura = JOptionPane.showInputDialog("Digite a altura");
					matriz[i][j] = altura;
				}else{
					sexo = JOptionPane.showInputDialog("Digite o sexo");
					matriz[i][j] = sexo.toUpperCase();
				}
			}
		}
		
		double maiorAlturaMasculino = maiorAlturaMasculino(matriz);
		double maiorAlturaFeminino = maiorAlturaFeminino(matriz);
		double menorAlturaMasculino = menorAlturaMasculino(matriz);
		double menorAlturaFeminino = menorAlturaFeminino(matriz);
		double mediaAlturaFeminino = mediaAlturaFeminino(matriz);
		double quantidadeHomens = quantidadeHomens(matriz);
		
		System.out.println("Maior altura masculino: " + maiorAlturaMasculino);
		System.out.println("Maior altura feminina: " + maiorAlturaFeminino);
		System.out.println("Menor altura masculino: " + menorAlturaMasculino);
		System.out.println("Menor altura feminina: " + menorAlturaFeminino);
		System.out.println("Media de altura feminina: " + mediaAlturaFeminino);
		System.out.println("Quantidade de Homens: " + quantidadeHomens);
		
	}
	
	public static double maiorAlturaMasculino(String[][] matriz){
		
		double maior = 0;
		
		for(int i = 0; i < matriz.length; i++){
			if(Double.parseDouble(matriz[i][0]) > maior && matriz[i][1] == "m"){
				maior = Double.parseDouble(matriz[i][0]);
			}
		}
		
		return maior;
	}
	
	public static double maiorAlturaFeminino(String[][] matriz){
		
		double maior = 0;
		
		for(int i = 0; i < matriz.length; i++){
			if(Double.parseDouble(matriz[i][0]) > maior && matriz[i][1] == "F"){
				maior = Double.parseDouble(matriz[i][0]);
			}
		}
		
		return maior;
	}
	
	public static double menorAlturaMasculino(String[][] matriz){
		
		double menor = 1000;
		
		for(int i = 0; i < matriz.length; i++){
			if(Double.parseDouble(matriz[i][0]) < menor && matriz[i][1] == "M"){
				menor = Double.parseDouble(matriz[i][0]);
			}
		}
		
		return menor;
	}
	
	public static double menorAlturaFeminino(String[][] matriz){
		
		double menor = 1000;
		
		for(int i = 0; i < matriz.length; i++){
			if(Double.parseDouble(matriz[i][0]) < menor && matriz[i][1] == "F"){
				menor = Double.parseDouble(matriz[i][0]);
			}
		}
		
		return menor;
	}
	
	public static double mediaAlturaFeminino(String[][] matriz){
		
		double somaAltura = 0;
		
		for(int i = 0; i < matriz.length; i++){
			if(matriz[i][1] == "F"){
				somaAltura += Double.parseDouble(matriz[i][0]);
			}
		}
		
		double media = somaAltura / matriz.length; 
		
		return media;
	}
	
	public static double quantidadeHomens(String[][] matriz){
		
		double qtd = 0;
		
		for(int i = 0; i < matriz.length; i++){
			if(matriz[i][1] == "M"){
				qtd += 1;
			}
		}
		
		return qtd;
	}
	

}
