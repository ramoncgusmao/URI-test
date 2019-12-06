package beginner;

import java.util.Scanner;

public class Area_1012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String valores = " ";

		try {
			valores = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}

		String vetor[] = valores.split(" ");
		String mensagem = "";
		if (vetor.length == 3) {
			mensagem = agregador(Double.parseDouble(vetor[0]), Double.parseDouble(vetor[1]),
					Double.parseDouble(vetor[2]));
		}

		System.out.print(mensagem);

		sc.close();
	}

	private static String agregador(double a, double b, double c) {
		String texto;
		texto = "TRIANGULO: " + formatador(triangulo(a, c));
		texto = texto + "CIRCULO: " + formatador(circulo(c));
		texto = texto + "TRAPEZIO: " + formatador(trapezio(a, b, c));
		texto = texto + "QUADRADO: " + formatador(quadrado(b));
		texto = texto + "RETANGULO: " + formatador(retangulo(a, b));
		return texto;
	}

	public static String formatador(double b) {
		return String.format("%.3f", (b)) + "\n";
	}

	public static double triangulo(double base, double altura) {

		return base * altura / 2;

	}

	public static double circulo(double raio) {
		double pi = 3.14159;
		return pi * raio * raio;

	}

	public static double trapezio(double base1, double base2, double altura) {

		return (base1 + base2) * altura / 2;

	}

	public static double quadrado(double lado) {

		return retangulo(lado, lado);

	}

	public static double retangulo(double base, double altura) {

		return base * altura;

	}
}
