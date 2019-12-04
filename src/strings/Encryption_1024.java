package strings;

import java.util.Scanner;

public class Encryption_1024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamanho = 0;
		tamanho = Integer.parseInt(sc.nextLine());
		
		String vetor[] = new String[tamanho];
	
		try {

			int i = 0;
			while (i <= tamanho) {
				vetor[i] = sc.nextLine();
				i++;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
		String resultado = "";

		for (int i = 0; i < vetor.length; i++) {
		
			vetor[i] = inverter(vetor[i]);
			resultado = resultado + cifraDeCesar(vetor[i], 3) + "\n";
			
		}
		

		System.out.println(resultado);

		sc.close();
	}

	public static String inverterMeio(String texto) {

		String invertido = "";

		String[] palavras = texto.split(" ");

		for (int i = 0; i < palavras.length; i++) {
			int meio = palavras[i].length() / 2;
			String palavra = palavras[i].substring(meio, palavras[i].length() - 1) + palavras[i].substring(0, meio - 1);
			palavras[i] = palavra;
		}

		return invertido;

	}

	public static String inverter(String texto) {

		if(texto == null) {
			return texto;
		}
		
		if (texto.length() < 2) {
			return texto;
		}else {

		return texto.charAt(texto.length() - 1) + inverter(texto.substring(0, texto.length() - 1));
		}
	}

	public static String cifraDeCesar(String texto, int casas) {
		String novoCode = "";
		for (int i = 0; i < texto.length(); i++) {
			int a = (int) texto.charAt(i);
			if(a > 64 && a < 173) {
				a += casas;				
			}
			novoCode = novoCode + ((char) a);
		}

		return novoCode;
	}
}