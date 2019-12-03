package beginner;


import java.io.IOException;
import java.util.Scanner;


public class ExtremelyBasic_1001 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("X = " + (a + b));
		
		sc.close();
	}
}
