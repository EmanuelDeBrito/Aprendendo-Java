public class Pessoa {
	// Alt shift s r -- Atalho para criação de getters e setters
	public String nome;
	private int idade;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		if(idade >= 18){
			this.idade = idade;
		}else{
			System.out.println("Idade tem que ser maior ou igual a 18");
		}
	}
	
}
