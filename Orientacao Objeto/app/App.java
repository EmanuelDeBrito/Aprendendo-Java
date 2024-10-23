package app;

import utils.Utilidades;
import Geometric.Rectangle;
import Enterprise.Employee;

public class App {

	public static void main(String[] args) {
		
		Temperatura();
		Rectangle();
		Employee();
		
	}
	
	public static void Temperatura(){
		double celsius = Utilidades.fahrenheitToCelsius(100);
		Utilidades.showMessage("100F� � igual a " + celsius + " �C");
		
		double fahrenheit = Utilidades.celsiusToFahrenheit(37.7);
		Utilidades.showMessage("100�C � igual a " + fahrenheit + " F�");
	}
	
	public static void Rectangle(){
		// Ret�ngulo
		Rectangle rec = new Rectangle();
		
		// Atribuindo valor a inst�ncia
		rec.width = 100;
		rec.height = 100;
		
		// Area
		double area_rectangle = rec.area(rec.width, rec.height);
		
		// Perimetro
		double perimeter_rectangle = rec.perimeter(rec.width, rec.height);
		
		// Diagonal
		double diagonal_rectangle = rec.diagonal(rec.width, rec.height);
		
		// Exibindo resultados
		rec.showMessage("Area", area_rectangle);
		rec.showMessage("Perimetro", perimeter_rectangle);
		rec.showMessage("Diagonal", diagonal_rectangle);
	}
	
	public static void Employee(){
		
		// Inst�ncia
		Employee func = new Employee();
		
		// Setando atributos
		func.nome = "Emanuel";
		func.salarioBruto = 1500;
		func.descontos = 500;
		
		// Retornos de m�todos
		double salarioLiquido = func.liquidSalary(func.salarioBruto, func.descontos);
		double salarioAumentado = func.increaseSalary(func.salarioBruto, 500);
		
		// Exibindo resultados
		func.showMessage("Valor do sal�rio liqu�do: " + salarioLiquido);
		func.showMessage("Valor do sal�rio aumentado: " + salarioAumentado);
		
	}

}
