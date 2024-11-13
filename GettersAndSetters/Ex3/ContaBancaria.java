package Ex3;

public class ContaBancaria {
	/* Crie uma classe ContaBancaria com atributos privados saldo (double) e titular (String). 
	 * Forne�a m�todos GET e SET para ambos os atributos. Adicione um m�todo realizarDeposito que 
	 * recebe um valor e adiciona ao saldo. Adicione um m�todo realizarSaque que recebe um valor e 
	 * subtrai do saldo, verificando se h� saldo suficiente. Crie uma inst�ncia da classe, realize 
	 * algumas opera��es e exiba o saldo final. 
	 */
	
	private double saldo;
	private String titular;
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double valor){
		this.saldo = valor;
	}
	
	public String getTitular(){
		return titular;
	}
	
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public void realizarDeposito(double valor){
		this.saldo += valor;
		System.out.println("Dep�sito de " + valor + " realizado com sucesso");
	}
	
	public void realizarSaque(double valor){
		if(saldo >= valor){
			this.saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			System.out.println("Saldo atual depois do saque: " + saldo);
		}else{
			System.out.println("Saldo insuficiente para realizar saque");
		}
	}
	
	
}
