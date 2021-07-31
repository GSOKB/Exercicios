import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int distancia;
		
		System.out.println("Distância do inimigo: ");
		distancia = leitor.nextInt();
		
		if(distancia < 70) 
		{
			System.out.println("ATIVADO");
		}
		else 
		{
			System.out.println("DESTIVADO");
		}
		
		leitor.close();
	}
}