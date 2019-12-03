package beginner;

import java.util.Scanner;

public class AreaOfACircle_1002 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	double raio = 0;
		try {
			 raio = sc.nextDouble();

		} catch (Exception e) {
		
		}
		
		double pi = 3.14159;
		String area = String.format("%.4f", pi*raio*raio);
		System.out.println("A="+area );
		
		sc.close();
	}
}
