package beginner;

import java.util.Scanner;

public class Average2_1006 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		try {
			a = Double.parseDouble(sc.nextLine());
			b = Double.parseDouble(sc.nextLine());
			c = Double.parseDouble(sc.nextLine());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		double media = ((a*2)+(b*3)+(c*5))/(10);
	
		System.out.println("MEDIA = " + String.format("%.1f", media));
		
		sc.close();
	}

}
