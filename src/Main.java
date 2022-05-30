import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int y = 32;
	System.out.println(y);
	
	
	double x = 10.35784;
		
	System.out.println(x);
	
	/* Controlar a quantidade de casas decimais. */
	
	System.out.printf("%.10f%n", x);
	System.out.printf("%.1f\n",x);
	System.out.printf("%.4f%n", x);
	
	
	/* Considerar o separador de decimais como PONTO, antes da declaração do Scanner*/
	
	Locale.setDefault(Locale.US);
	System.out.printf("%.4f%n", x);
	
	
	/* Concatenar vários elementos em um mesmo comando de escrita */
	
	System.out.println("Resultado = " + x + " Metros");
	
	/* Concatenar vários elementros em uma mesmo comando de escrita usando printf*/
	
	System.out.printf("Resultado = %.2f metro%n", x);
	
	/* Concatenar vários elementos em um mesmo coamndo de escrita*/
	String nome = "Maria";
	int idade = 31;
	double renda = 4000.0;
	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);
		
	}

}
