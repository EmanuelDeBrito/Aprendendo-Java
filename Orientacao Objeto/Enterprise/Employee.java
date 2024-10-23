package Enterprise;

public class Employee {

	public String nome;
	public double salarioBruto;
	public double descontos;
	
	public static double liquidSalary(double salario, double descontos){
		return salario - descontos;
	}
	
	public static double increaseSalary(double salario, double aumento){
		return salario + aumento;
	}
	
	public static void showMessage(String mensagem){
		System.out.println(mensagem);
	}
	
}
