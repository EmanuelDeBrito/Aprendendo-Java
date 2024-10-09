import javax.swing.JOptionPane;


public class Ex5 {

	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
		
		String[] nomes = new String[qtd];
		int[][] notas = new int[qtd][2];
		String nome;
		int nota;
		
		for(int i = 0; i < nomes.length; i++){
			nome = JOptionPane.showInputDialog("Digite o nome: ");
			nomes[i] = nome;
		}
		
		for(int i = 0; i < notas.length; i++){
			for(int j = 0; j < notas[i].length; j++){
				if(j == 0){
					nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota do aluno " + i + ": "));
				}else{
					nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota do aluno: " + i + ": "));
				}
				notas[i][j] = nota;
			}
		}
		
		alunosAprovados(notas, nomes);
		
	}
	
	public static void alunosAprovados(int[][] notas, String[] nomes){
		
		int soma = 0;
		int media = 0;
		
		for(int i = 0; i < notas.length; i++){
			for(int j = 0; j < notas[i].length; j++){
				soma += notas[i][j];
			}
			media = soma / notas[i].length;
			if(media >= 6){
				System.out.println(nomes[i] + " Aprovado");
			}
			soma = 0;
			media = 0;
		}
		
	}
	

}
