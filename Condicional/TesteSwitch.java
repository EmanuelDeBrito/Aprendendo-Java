
public class TesteSwitch {

	public static void main(String[] args) {
		
		int diaDaSemana = 3; // CamelCase
		String nome_user = "Pedro"; // Snake_Case
		
		switch (diaDaSemana) {
		case 1:
			System.out.println("Hoje � Domingo");
			break;
		case 2:
			System.out.println("Hoje � Segunda Feira");
			break;
		case 3:
			System.out.println("Hoje � Ter�a Feira");
			break;
		case 4:
			System.out.println("Hoje � Quarta Feira");
			break;
		case 5:
			System.out.println("Hoje � Quinta Feira");
			break;
		case 6:
			System.out.println("Hoje � Sexta Feira");
			break;
		case 7:
			System.out.println("Hoje � S�bado");
			break;		
		default:
			System.out.println("Dia Inexistente -- De 1 a 7");
			break;
		}		
		
	}

}
