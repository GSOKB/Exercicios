import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double duracaoMinutos, duracaoHoras, duracaoSegundos;
		
		System.out.println("Informe a duração do filme: ");
		duracaoMinutos = leitor.nextFloat();
		
		duracaoSegundos = duracaoMinutos * 60.0;
		duracaoHoras = duracaoMinutos / 60.0;
		
		DecimalFormat formatador = new DecimalFormat("#.00");
		
		System.out.print("O tempo do filme em horas é " + formatador.format(duracaoHoras) + " e " + duracaoSegundos + " em segundos");
		leitor.close();
	}
}