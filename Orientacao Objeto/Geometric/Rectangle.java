package Geometric;

public class Rectangle {

	public double height;
	public double width;
	
	public static double area(double width, double height){
		return width * height;
	}
	
	public static double perimeter(double width, double height){
		return (width * 2) + (height * 2);
	}
	
	public static double diagonal(double width, double height){
		double d = Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
		
		return d;
	}
	
	public static void showMessage(String nome_calculo, double resultado){
		System.out.println(nome_calculo + " do rectangulo igual a: " + resultado);
	}
	
}
