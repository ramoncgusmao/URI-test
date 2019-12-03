package beginner;

import java.util.Scanner;

public class Average1_1005 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		try {
			a = Double.parseDouble(sc.nextLine());
			b = Double.parseDouble(sc.nextLine());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		double media = ((a*3.5)+(b*7.5))/(11);
	
		System.out.println("MEDIA = " + String.format("%.5f", media));
		
		sc.close();
	}

}
