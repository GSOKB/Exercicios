import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		
		System.out.println("Informe a medida do primeiro lado do triângulo: ");
		ladoA = leitor.nextInt();
		System.out.println("Informe a medida do primeiro lado do triângulo: ");
		ladoB = leitor.nextInt();
		System.out.println("Informe a medida do primeiro lado do triângulo: ");
		ladoC = leitor.nextInt();
		
		if((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA ) 
		{
			System.out.println("O triângulo existe");
		}
		else 
		{
			System.out.println("O triângulo não existe");
		}
		
		leitor.close();
	}
}