package Ex2;

public class Circulo {
	// Crie uma classe Circulo com um atributo privado raio (double). 
	// Forneça métodos GET e SET para o raio. Adicione um método calcularArea que retorna a área do círculo 
	// (fórmula: π * raio^2). Crie uma instância da classe, defina o raio e exiba a área do círculo. 
	
	private double raio;
	
	public double getRaio(){
		return raio;
	}
	
	public void setRaio(double novoRaio){
		this.raio = novoRaio;
	}
	
	public double area(){
		return 3.14 * Math.pow(this.raio, 2);
	}
}
