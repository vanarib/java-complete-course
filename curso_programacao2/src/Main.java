import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "MARIA";
		int idade = 31;
		double renda = 4000.0;
				
		
		//tenho que colocar essa declara��o no come�o(sempre?)
		System.out.println(y);
		
		System.out.print("Ol� Mundo!");
		System.out.println("Bom Dia!");
		
		System.out.println("Ol� Mundo!");
		System.out.println("Bom Dia!");
		// ln � a quebra de linha,onde o texto vai para a linha seguinte

		System.out.println("Ol� pessoal!");
		System.out.println("Boa tarde!");
		System.out.println("");
		//usar o comando normal e deixar a parte do texto em branco para "pular linha"
		System.out.println("Ol� povo!");
		System.out.println("Boa Noite!");
		
		System.out.println(y);
		
		//o texto n�o importa onde esteja(o comando),mas a declara��o com os valores deve estar l� no come�o, dependendo da linguagem de programa��o, nem sempre.
		
		System.out.println(x);
		// lembrar que a declara��o double para o x est� l� no come�o
		
		System.out.printf("%.2f%n",x); 
		//%.2f para a contagem de casas decimais // %n ou \n para a quebra de linha, se n�o a proxima linha vem com dados errados
		System.out.printf("%.3f\n",x);
		System.out.printf("%.2f",x);
		//sem o % ou / n
		System.out.printf("%.3f",x);
		// deu errado >>10,3610,358!!!!!pq n�o coloquei o \n acima
		Locale.setDefault(Locale.US);
		//para colocar separado por ponto(EUA) inv�s de v�rgula(BR)
		System.out.printf("%.2f\n",x);
		//pq n�o coloquei o %n ou \n acima no ante pen�ltimo
		System.out.printf("%.2f\n",x);
		System.out.println("");
		System.out.println("Resultado = " +x+ " METROS");
		
		System.out.println("");
		System.out.println("Resultado = "+ x +" METROS");
		System.out.printf("%.2f\n",x);
		System.out.printf("Resultado = %.2f metros\n",x);
		
		System.out.println("");
		
		System.out.printf("Com quatro casas decimais fica %.4f metros,\n"
				+ "mas como fica muito grande prefiro com duas casas decimais, assim %.2f metros\n",x ,x);
		System.out.println("");
		System.out.printf(" %s tem %d anos e ganha R$%.2f reais \n ",nome, idade, renda);


	}

}
