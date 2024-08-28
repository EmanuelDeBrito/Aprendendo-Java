import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		
		int horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
		int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final"));
		
		if((horaInicial >= 0 && horaInicial <= 23) && (horaFinal >= 0 && horaFinal <= 23)){
			if(horaInicial == horaFinal){
				JOptionPane.showMessageDialog(null, "O jogo durou 24 horas");
			}else if(horaInicial < horaFinal ){
				int valor = horaFinal - horaInicial;
				JOptionPane.showMessageDialog(null, "O jogo durou " + valor + " horas");
			}else if(horaInicial > horaFinal){
				int novaHora = (24 - horaInicial) + horaFinal;
				JOptionPane.showMessageDialog(null, "O jogo durou " + novaHora + " horas");
			}
		}else{
			JOptionPane.showMessageDialog(null, "Digite horas válidas -- Entre 0 e 23");
		}
		
	}

}