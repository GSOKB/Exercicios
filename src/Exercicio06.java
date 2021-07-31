import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String cupom;
		double valor, valorFinal;
		
		System.out.println("Informe o valor de compra: ");
		valor = leitor.nextDouble();
		
		System.out.println("Informe o cupom de desconto: ");
		cupom = leitor.next();
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		if(cupom.equalsIgnoreCase("DIADEFESTA")) 
		{
			valorFinal = valor * 0.97;
			System.out.println("O valor final de sua compra é de: " + formatador.format(valorFinal));
		}
		else 
		{
			System.out.println("O cupom digitado está incorreto");
		}
		
		leitor.close();
	}
}