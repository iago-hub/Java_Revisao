
public class Main {

	public static void main(String[] args) {
		
	//   Processamento de Dados
		
	System.out.println("-------------------Exemplo 1--------------------");
		int x, y;
		
		x = 5;
		
		y= 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("--------------------Exemplo 2--------------------");
		
		int w;
		
		double z;
		
		w = 5;
		z = 2 * w;
		
		System.out.println(w);
		System.out.println(z);
		
		System.out.println("---------------------Exemplo 3----------------");
		
		double b, B, h, area;
		
		b=6.0;
		B=8.0;
		h=5.0;
		
		area = (b+B)/ 2.0 * h;
		
		System.out.println(area);
		
		
		System.out.println("-------------------Exemplo 4------------------");
		
		int c, d;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = c / d;
		
		System.out.println(resultado);
		
		//Avisar o compilador que quero receber o resultado da divisão um double
		System.out.println("-- Casting = fundição --"); 
		
		resultado = (double) c / d;
		
		System.out.println(resultado);
		
		System.out.println("------------------Exemplo 5 (Casting)-------------------");
		
		double e;
		int f;
		
		e = 5.0;
		f = (int) e;
		
		System.out.println(f);
		
	
		
	}

}
