import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		
		double salario = horas * valorPorHora;
		
		System.out.println("NUMBER" + funcionario);
		System.out.printf("SALARY= %.2f%n",salario);
		
		sc.close();

		//entrada(digitar):25,100,5.50
		//sairá: NUMBER25,SALARY= 550.00
		
		// entrada(digitar):1,200,20.50
		///sairá: NUMBER1 , SALARY= 4100.00
		
		// etc
		
	}

}
