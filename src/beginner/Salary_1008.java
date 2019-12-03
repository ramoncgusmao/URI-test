package beginner;


import java.util.Scanner;

public class Salary_1008 {


	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int number = 0, horas = 0;
		double valorHora = 0;
		
		try {
			number = sc.nextInt();
			horas = sc.nextInt();
			valorHora = sc.nextDouble();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f",(valorHora * horas)));
		
		sc.close();
	}
	
}

