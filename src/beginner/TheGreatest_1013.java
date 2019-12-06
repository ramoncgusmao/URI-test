package beginner;

import java.util.Scanner;

public class TheGreatest_1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String valores = " ";

		try {
			valores = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}

		String vetor[] = valores.split(" ");
		int maior = 0;
		if (vetor.length == 3) {
			maior = maiorDos3(Integer.parseInt(vetor[0]), Integer.parseInt(vetor[1]),
					Integer.parseInt(vetor[2]));
		}

		System.out.print(maior + " eh o maior\n");

		sc.close();
	}

	private static int maiorDos3(int a, int b, int c) {
		int x = maior(a,b);
		
		return maior(x,c);
	}

	public static int maior(int a, int b) {
		return (a + b + Math.abs(a-b))/2;
	}

}
