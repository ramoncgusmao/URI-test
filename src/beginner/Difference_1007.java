package beginner;

import java.util.Scanner;

public class Difference_1007 {



		public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			int a = 0, b = 0, c = 0, d = 0;
			
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			int diferenca = ((a*b)-(c*d));
		
			System.out.println("DIFERENCA = " + diferenca);
			
			sc.close();
		}

}


