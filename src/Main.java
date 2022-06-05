import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Entrada de Dados

		System.out.println("-------------------Exemplo 1--------------------");
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;

		System.out.print("Digite uma palavra: ");

		x = sc.next();

		System.out.println("Você digitou: " + x);

		System.out.println("--------------------Exemplo 2-------------------");

		int a;

		System.out.print("Digite um número inteiro: ");

		a = sc.nextInt();

		System.out.println("Você digitou: " + a);

		// System.out.println("teste " + (b = sc.next()));

		System.out.println("---------------------Exemplo 3-------------------");

		Double b;
		
		System.out.print("Digite um número fracionado: ");
		
		b = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n", b); 
				
		
		System.out.println("----------------------Exemplo 4------------------");
		
		
		System.out.println("Você digitou: "+b);
		
		System.out.println("----------------------Exemplo 5-------------------");
		
		Locale.setDefault(Locale.US);
		
		Double c;
		
		System.out.print("Digite um número fracionado: ");
		
		c = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f\n", c);
		
		System.out.println("----------------------Exemplo 6-------------------");
		
		char d;
		
		System.out.print("Digite um caracter: ");
		
		d = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + d);
		
		
		
		System.out.println("-----------------------Exemplo 7------------------");
		
		System.out.println("Digite um texto, inteiro, fracional e caracter: ");
		
		x = sc.next();
		a = sc.nextInt();
		b = sc.nextDouble();
		d = sc.next().charAt(0);
		
		System.out.println("Dados digitados: ");
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + a);
		System.out.printf("Você digitou: %.2f%n", b);
		System.out.println("Você digitou: " + d);
		
		sc.close();
	}

}
