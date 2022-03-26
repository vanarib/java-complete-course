import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "MARIA";
		int idade = 31;
		double renda = 4000.0;
				
		
		//tenho que colocar essa declaração no começo(sempre?)
		System.out.println(y);
		
		System.out.print("Olá Mundo!");
		System.out.println("Bom Dia!");
		
		System.out.println("Olá Mundo!");
		System.out.println("Bom Dia!");
		// ln é a quebra de linha,onde o texto vai para a linha seguinte

		System.out.println("Olá pessoal!");
		System.out.println("Boa tarde!");
		System.out.println("");
		//usar o comando normal e deixar a parte do texto em branco para "pular linha"
		System.out.println("Olá povo!");
		System.out.println("Boa Noite!");
		
		System.out.println(y);
		
		//o texto não importa onde esteja(o comando),mas a declaração com os valores deve estar lá no começo, dependendo da linguagem de programação, nem sempre.
		
		System.out.println(x);
		// lembrar que a declaração double para o x está lá no começo
		
		System.out.printf("%.2f%n",x); 
		//%.2f para a contagem de casas decimais // %n ou \n para a quebra de linha, se não a proxima linha vem com dados errados
		System.out.printf("%.3f\n",x);
		System.out.printf("%.2f",x);
		//sem o % ou / n
		System.out.printf("%.3f",x);
		// deu errado >>10,3610,358!!!!!pq não coloquei o \n acima
		Locale.setDefault(Locale.US);
		//para colocar separado por ponto(EUA) invés de vírgula(BR)
		System.out.printf("%.2f\n",x);
		//pq não coloquei o %n ou \n acima no ante penúltimo
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
