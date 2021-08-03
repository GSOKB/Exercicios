import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double alunos = 0, media, nota = 0, i = 1;
		
		System.out.println("Digite a média: ");
		media = leitor.nextDouble();
		
		while(i < 51) 
		{
			System.out.println("Digite a " + i + "º nota");
			nota = leitor.nextDouble();
			i = i + 1;
			
			while(nota > media) 
			{
				alunos = alunos + 1;
			}
		}
		
		System.out.println(alunos + " alunos estão acima da média");
		leitor.close();
	}
}