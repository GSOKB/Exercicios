import java.util.Scanner;
public class Exercicio09 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor = 0;
		
		while(valor != 1238) 
		{
			System.out.println("Quantos feij�es est�o no jarro? ");
			valor = leitor.nextInt();
		}
		
		System.out.print("Voc� acertou!");

		leitor.close();
	}
}