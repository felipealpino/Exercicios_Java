package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rectangle ret;
		ret = new Rectangle();
		
		System.out.println("Digite o valor do lado do retangulo: ");
		ret.width  = sc.nextDouble();
		System.out.println("Digite o valor da base do retangulo: ");
		ret.height = sc.nextDouble();
		
		System.out.println("AREA "+ String.format("%.2f", ret.area()));
		System.out.println("PERIMETER "+String.format("%.2f", ret.perimeter()));
		System.out.println("DIAGONAL "+String.format("%.2f", ret.diagonal()));
		
		
		
		sc.close();
	}

}
