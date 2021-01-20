package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase:  ");
		String frase = sc.nextLine();
		
		String[] arrStr = frase.split(" ");
		int maiorPalindromo = 0;
		String maiorPalindromoString = "";
		for(int c=0; c<arrStr.length; c++) {
			int palavraSize = arrStr[c].length();
			int nOperacoes = palavraSize/2;
			int aux = 0;
			for (int i=0; i<nOperacoes; i++) {
				if(!arrStr[c].substring(i, i+1).equals(arrStr[c].substring(palavraSize - (i+1), palavraSize - i))) {
					aux += 1;
				}
			}
			
			if(aux == 0) {
				if(arrStr[c].length() > maiorPalindromo) {
					maiorPalindromo = arrStr[c].length();
					maiorPalindromoString = arrStr[c];
				}
			}
		}
		
		if(maiorPalindromo > 0 || maiorPalindromoString != "") {
			System.out.println("Resposta: "+maiorPalindromoString+" com "+maiorPalindromo+" caracteres");
		} else {
			System.out.println("Não existe nenhum palindromo na frase digitada");
		}
		
	

		
		sc.close();
	}

}
