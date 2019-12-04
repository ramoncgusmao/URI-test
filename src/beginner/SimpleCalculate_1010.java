package beginner;

import java.util.Scanner;

public class SimpleCalculate_1010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String entrada1 = "", entrada2 = "";
		String vetor1[] = new String[3];
		String vetor2[] = new String[3]; 

		try {
			entrada1 = sc.nextLine();
			entrada2 = sc.nextLine();
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		vetor1 = entrada1.split(" ");
		vetor2 = entrada2.split(" ");
		
		double total = Integer.parseInt(vetor1[1])*Double.parseDouble(vetor1[2]) 
				+ Integer.parseInt(vetor2[1])*Double.parseDouble(vetor2[2]) ;
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f",(total)));
		
		sc.close();
	}

}
