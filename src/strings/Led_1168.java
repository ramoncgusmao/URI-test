package strings;

import java.util.Scanner;

public class Led_1168 {

public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int tamanho = 0;
		String vetor[] = null;

		int i = 0;

		try {
			while(sc.hasNext()) {
				if(tamanho == 0) {
					tamanho = Integer.parseInt(sc.nextLine());
					if(tamanho >= 1 && tamanho <= 2000) {
						
						vetor = new String[tamanho];
					}else {
						break;
					}
					
				}
				
				if(vetor != null) {
					vetor[i] = sc.next();
					System.out.println(mensagem(vetor[i]) + " leds");
					i++;
					if(i == tamanho) {
						break;
					}
				}
				
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		sc.close();
	}


	public static int mensagem(String msg) {
		int total = 0;
		for (int i = 0; i < msg.length(); i++) {
			total += quantidadeLed(msg.charAt(i));
		}
		
		return total;
	}
	
	public static int quantidadeLed(char ch) {
		
		int valor = 0;
		int numero = Character.getNumericValue(ch);
		switch(numero) {
		case 1:
			valor = 2;
			break;
		case 2: case 3: case 5: 
			valor = 5;
			break;
		case 4: 
			valor = 4;
			break;
		case 6: case 0: case 9:
			valor = 6;
			break;
		case 7:
			valor = 3;
			break;
		case 8:
			valor = 7;
			break;
		}
		
		return valor;
	}
}
