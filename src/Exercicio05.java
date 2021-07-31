import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int pesoUm, pesoDois, pesoTres;
		
		System.out.println("Informe o primeiro peso de lixo: ");
		pesoUm = leitor.nextInt();
		
		System.out.println("Informe o segundo peso de lixo: ");
		pesoDois = leitor.nextInt();
		
		System.out.println("Informe o terceiro peso de lixo: ");
		pesoTres = leitor.nextInt();
		
		if(pesoUm < pesoDois && pesoUm < pesoTres) 
		{
			System.out.println("O lixo a ser carregado será o que pesa: " + pesoUm);
		}
		else if(pesoDois < pesoUm && pesoDois < pesoTres) 
		{
			System.out.println("O lixo a ser carregado será o que pesa: " + pesoDois);
		}
		else 
		{
			System.out.println("O lixo a ser carregado será o que pesa: " + pesoTres);
		}
		
		leitor.close();
	}
}