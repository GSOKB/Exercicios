import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int A,B;
		
		System.out.println("Digite um valor para A: ");
		A = leitor.nextInt();
		
		System.out.println("Digite um valor para B: ");
		B = leitor.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("O valor de A é " + A + " e o valor de B é " + B);
		leitor.close();
	}
}