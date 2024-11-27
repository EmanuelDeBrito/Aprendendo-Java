package Ex2;

public class Aluno {
	
	private String nome;
	private int[] notas = new int[3];
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNotas(){
		String palavra = "";
		
		for(int i = 0; i < notas.length; i++){
			palavra += ("Nota " + (i + 1) + ": " + notas[i] + "\n");
		}
		
		return palavra;
	}
	
	public void setNotas(int n[]){
		for(int i = 0; i < notas.length; i++){
			this.notas[i] = n[i];
		}
	}
	
	public float calcularMedia(){
		float total = 0;
		for(int i = 0; i < notas.length; i++){
			total += notas[i];
		}
		
		float media = total / notas.length;
		
		return media;
	}
}
