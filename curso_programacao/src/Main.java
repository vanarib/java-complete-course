import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá Mundo!");
		
		int y = 32;
		System.out.println(y);
		
		int idade = 40;
		String nome = "Maria";
		System.out.println("meu nome é " + nome);
		System.out.println("tenho " + idade + " anos");
		
		double x = 10.35784;
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		// %n é para quebra de linha
		
		System.out.printf("%.4f%n", x);
		
		System.out.printf("%.3f%n", x);
		
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		//vai adequar o sistema para casa decimais local
		
	
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e aganha R$ %.2f reais%n", nome, idade, renda);
	}

}
