import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		
		System.out.println("Informe a medida do primeiro lado do tri�ngulo: ");
		ladoA = leitor.nextInt();
		System.out.println("Informe a medida do primeiro lado do tri�ngulo: ");
		ladoB = leitor.nextInt();
		System.out.println("Informe a medida do primeiro lado do tri�ngulo: ");
		ladoC = leitor.nextInt();
		
		if((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA ) 
		{
			System.out.println("O tri�ngulo existe");
		}
		else 
		{
			System.out.println("O tri�ngulo n�o existe");
		}
		
		leitor.close();
	}
}