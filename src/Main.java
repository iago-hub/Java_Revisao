import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Entrada de Dados

		System.out.println("-------------------Exemplo 1--------------------");
		
		// Para Ler um texto até a QUEBRA DE LINHA

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		System.out.println("Digite 3 textos: ");

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Textos digitados: ");
		System.out.println("Texto 1: " + s1);
		System.out.println("Texto 2: " + s2);
		System.out.println("Texto 3: " + s3);

		

		System.out.println("-----------------Exemplo 2----------------------");
		
		// Atenção Exemplo de quebra de linha pendente
		
		int x;
		String x1, x2, x3;
		
		System.out.println("Digite um valor inteiro e três textos : ");
		
		x = sc.nextInt();
		sc.nextLine();
		x1 = sc.nextLine();
		x2 = sc.nextLine();
		x3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		
		System.out.println("Valor inteiro: " + x );
		System.out.println("Texto 1: " + x1);
		System.out.println("Texto 2: " + x2);
		System.out.println("Texto 3: " + x3);
				
		sc.close();
	}

}
