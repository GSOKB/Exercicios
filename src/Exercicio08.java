import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC;
		
		System.out.println("Informe a medida do primeiro lado do triângulo: ");
		ladoA = leitor.nextDouble();
		System.out.println("Informe a medida do primeiro lado do triângulo: ");
		ladoB = leitor.nextDouble();
		System.out.println("Informe a medida do primeiro lado do triângulo: ");
		ladoC = leitor.nextDouble();
		
		if(ladoA == ladoB && ladoA == ladoC) 
		{
			System.out.println("O triÇangulo é equilátero");
		}
		else if(ladoA != ladoB && ladoA != ladoC && ladoC != ladoB) 
		{
			System.out.println("O triângulo é escaleno");
		}
		else 
		{
			System.out.println("O triângulo é isósceles");
		}
	}
}