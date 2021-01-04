package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[][] matriz = new int[n][n];
		List <Integer> diagonal = new ArrayList<>();
		List <Integer> negativos = new ArrayList<>();
		
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz[x].length; y++) {
				System.out.println("Digite o valor para ["+y+"]["+x+"]");
				matriz[x][y] = sc.nextInt();
				sc.nextLine();
			}
		}
		
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz[x].length; y++) {
				if(x == y) {
					diagonal.add(matriz[x][y]);
				}
				if(matriz[x][y] <0) {
					negativos.add(matriz[x][y]);
				}
			}
		}
		
		System.out.println("Diagonal Main: ");
		for (int x : diagonal) {
			System.out.print(x+" ");
			System.out.println();
		}
		System.out.println("Negative numbers:");
		for (int x : negativos) {
			System.out.print(x+" ");
		}
		
		sc.close();
	}

}
