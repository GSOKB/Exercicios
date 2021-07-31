import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int anoNascimento, idade;
		
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = leitor.nextInt();
		
		idade = 2021 - anoNascimento;
		
		System.out.println("Sua idade no dia 31 de Dezembro de 2021 será " + idade);
		leitor.close();
	}
}