

public class Main {

	public static void main(String[] args) {

		// Entrada de Dados

		System.out.println("-------------------Exemplo 1--------------------");
		
		// Funções Matemáticas do Java
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C, D ;
		
		
		
		A =  Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		D = A;
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 é " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " Elevado a " + y + " = " + A);
		System.out.println(x + " Elevado ao quadrado = " + B);
		System.out.println("5 Elevado ao quadrado = " + C );
		
		
		A = Math.abs(y);
		B = Math.abs(z);
		C = Math.abs(D);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		System.out.println("Valor absoluto de " + D + " = " + C);
				
		System.out.println("---------------------Exemplo 2-----------------------");
		
		// Equação do Segundo Grau
		
		double delta, a, b, c, x1, x2;
		
		a = 2.0;
		b = -16.0;
		c = -18.0;
		
		delta = (Math.pow(b, 2.0)) - (4*a*c);
		
		x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		
		System.out.println("Valor de Delta é: " + delta);
		
		System.out.printf("Portando, as raizes da equação: +(%.0fx^2) + (%.0fx) + (%.0f), são: x1 = %.2f e x2 = %.2f; ",a,b,c,x1,x2);  
				
		
		
	}

}
