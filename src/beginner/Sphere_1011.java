package beginner;

import java.util.Scanner;

public class Sphere_1011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double resultado = 0; 
		int raio = 0; 
		double pi = 3.14159;
		try {
			raio = sc.nextInt();
		
			resultado = (4.0/3) *pi * Math.pow(raio, 3);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		System.out.println("VOLUME = " + String.format("%.3f",(resultado)));
		
		sc.close();
	}
}
