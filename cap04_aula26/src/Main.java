import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String x;
			int y;
			double z;
			char w;
			
			x = sc.next();
			y = sc.nextInt();
			z = sc.nextDouble();
			w = sc.next().charAt(0);
			
			System.out.println("Voc� digitou:" + x);
			System.out.println("Voc� digitou:" + y);
			System.out.println("Voc� digitou:" + z);
			System.out.printf("Voc� digitou:%.2f\n", z);
			System.out.println("Voc� digitou:" + w);
		
			System.out.println("Dados digitados:");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			//para digitar v�rios dados na mesma linha
			
			//Digitar para teste: Maria 35 15,5 TRE
			
			sc.close();

	}

}
