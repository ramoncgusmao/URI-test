package beginner;

import java.util.Scanner;

public class SalaryWithBonus_1009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salario = 0, vendas = 0;
		String nome = " "; 

		try {
			nome = sc.next();
			salario = sc.nextDouble();
			vendas = sc.nextDouble();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		System.out.println("TOTAL = R$ " + String.format("%.2f",(salario +(vendas*0.15))));
		
		sc.close();
	}

}
