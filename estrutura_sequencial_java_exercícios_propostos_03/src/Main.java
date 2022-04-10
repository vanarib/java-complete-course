import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = A*B - C*D;
		
		System.out.println("DIFERENCA = "+ diferenca );
		
		
		sc.close();

		//digitar:5,6,7,8
		//sairá na tela:DIFERENCA = -26
		
		//digitar: 5,6,-7,8
		//sairá na tela: DIFERENCA = 86
		
		
	}

}
