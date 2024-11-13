package Ex1;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicado;
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public int getAnoPublicado(){
		return anoPublicado;
	}
	
	public void setAnoPublicado(int novoAnoPublicado){
		this.anoPublicado = novoAnoPublicado;
	}
}
