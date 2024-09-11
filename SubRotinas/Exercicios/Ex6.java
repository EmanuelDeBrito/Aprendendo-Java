import javax.swing.JOptionPane;


public class Ex6 {

	public static void main(String[] args) {
	
		// Exercicio 6 -- Conversão de horario 
		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Digite os segundos: "));
		String horario = converterHorario(segundos);
		JOptionPane.showMessageDialog(null, "Horario é de: " + horario);

	}
	
	public static String converterHorario(int seg){
		
		int horas = 0;
		int minutos = 0;
		int segundos = seg;
		
		if(segundos >= 3600){
			horas = segundos / 3600;
			segundos = segundos - (horas * 3600);
			if(segundos >= 60){
				minutos = segundos / 60;
				segundos = segundos - (minutos * 60);
			}
		}else if(segundos >= 60){
			minutos = segundos / 60;
			segundos = segundos - (minutos * 60);
		}
		
		String horasf = String.format("%d", horas);
		String minutosf = String.format("%d", minutos);
		String segundosf = String.format("%d", segundos);
		
		if(horas < 10){
			horasf = String.format("0%d", horas); 
		}
		
		if(minutos < 10){
			minutosf = String.format("0%d", minutos);
		}
		
		if(segundos < 10){
			segundosf = String.format("0%d", segundos);
		}
		
		return String.format("%s:%s:%s", horasf, minutosf, segundosf);
		
	}

}
