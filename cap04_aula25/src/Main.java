
public class Main {

	public static void main(String[] args) {

		int x, y;
		//ambos são números inteiros
		x = 5;

		y = 2 * x;

		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		
		exemplo2();
		exemplo3();
		exemplo4();
		resolução4();
		exemplo5();
	}

	static void exemplo2() {
		
		int x;
		double y;
		//aqui o tipo das variáveis são diferentes,
		//a segunda já é do tipo double, ou seja,ele imprimirá um número com "ponto", 
		//indicando que é um n com ponto flutuante (10.0)
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
	
	static void exemplo3() {
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B)/2*h;
		
		System.out.println(area);
		
		System.out.println();
	}
	
	
	static void exemplo4() {
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a/b;
		
		System.out.println(resultado);
		//o resultado, apesar de ser 2,5, será impresso 2.0, pois as duas variáveis a e b acima
		//são do tipo inteiro(int), entendendo que se "quer" um resultado inteiro também...
		//portanto, preciso que se entenda que eu quero que se aceite o resultado real que é um número double
		// então acrescento double ao resultado
		
		System.out.println();
		//então entro com a seguinte resolução		
	}
	
	static void resolução4() {
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a/b;
		
		System.out.println(resultado);
		
		System.out.println();
	}
	
	static void exemplo5() {
		
		double a;
		int b;
		a = 5.0;
		b = (int)a;
		//quando o compilador acha que vai perder informação,pois a pricipio,
		//como está, não posso converter de double pra int, então devo colocar que aceito
		//um número inteiro em b, especificando (int)a
		
		System.out.println(b);
		
	}
}
