import java.util.Scanner;
public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor = 0;
		
		while(valor != 1238) 
		{
			System.out.println("Quantos feijões estão no jarro? ");
			valor = leitor.nextInt();
		}
		
		System.out.print("Você acertou!");

		leitor.close();
	}
}