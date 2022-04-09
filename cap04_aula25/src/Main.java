
public class Main {

	public static void main(String[] args) {

		int x, y;
		//ambos s�o n�meros inteiros
		x = 5;

		y = 2 * x;

		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		
		exemplo2();
		exemplo3();
		exemplo4();
		resolucao4();
		exemplo5();
	}

	static void exemplo2() {
		
		int x;
		double y;
		//aqui o tipo das vari�veis s�o diferentes,
		//a segunda j� � do tipo double, ou seja,ele imprimir� um n�mero com "ponto", 
		//indicando que � um n com ponto flutuante (10.0)
		
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
		//o resultado, apesar de ser 2,5, ser� impresso 2.0, pois as duas vari�veis a e b acima
		//s�o do tipo inteiro(int), entendendo que se "quer" um resultado inteiro tamb�m...
		//portanto, preciso que se entenda que eu quero que se aceite o resultado real que � um n�mero double
		// ent�o acrescento double ao resultado
		
		System.out.println();
		//ent�o entro com a seguinte resolu��o		
	}
	
	static void resolucao4() {
		
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
		//quando o compilador acha que vai perder informa��o,pois a pricipio,
		//como est�, n�o posso converter de double pra int, ent�o devo colocar que aceito
		//um n�mero inteiro em b, especificando (int)a
		
		System.out.println(b);
		
	}
}
