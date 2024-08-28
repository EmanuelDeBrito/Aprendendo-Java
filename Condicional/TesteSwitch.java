
public class TesteSwitch {

	public static void main(String[] args) {
		
		int diaDaSemana = 3; // CamelCase
		String nome_user = "Pedro"; // Snake_Case
		
		switch (diaDaSemana) {
		case 1:
			System.out.println("Hoje é Domingo");
			break;
		case 2:
			System.out.println("Hoje é Segunda Feira");
			break;
		case 3:
			System.out.println("Hoje é Terça Feira");
			break;
		case 4:
			System.out.println("Hoje é Quarta Feira");
			break;
		case 5:
			System.out.println("Hoje é Quinta Feira");
			break;
		case 6:
			System.out.println("Hoje é Sexta Feira");
			break;
		case 7:
			System.out.println("Hoje é Sábado");
			break;		
		default:
			System.out.println("Dia Inexistente -- De 1 a 7");
			break;
		}		
		
	}

}
