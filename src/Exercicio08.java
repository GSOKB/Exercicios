import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC;
		
		System.out.println("Informe a medida do primeiro lado do tri�ngulo: ");
		ladoA = leitor.nextDouble();
		System.out.println("Informe a medida do primeiro lado do tri�ngulo: ");
		ladoB = leitor.nextDouble();
		System.out.println("Informe a medida do primeiro lado do tri�ngulo: ");
		ladoC = leitor.nextDouble();
		
		if(ladoA == ladoB && ladoA == ladoC) 
		{
			System.out.println("O tri�angulo � equil�tero");
		}
		else if(ladoA != ladoB && ladoA != ladoC && ladoC != ladoB) 
		{
			System.out.println("O tri�ngulo � escaleno");
		}
		else 
		{
			System.out.println("O tri�ngulo � is�sceles");
		}
	}
}