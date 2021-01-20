package application;

import entities.Luta;
import entities.Lutador;

public class Program {

	public static void main(String[] args) {
		
		Lutador lutador1 = new Lutador(	"Felipe G", "Canada", 25, 1.80, 85.5, 0, 0, 0);
		Lutador lutador2 = new Lutador(	"Ronald Been", "Frace", 30, 1.9, 86.5, 0, 0, 0);
		
		System.out.println(lutador1);
		System.out.println(lutador2);
		
		Luta luta1 = new Luta(lutador1, lutador2);
		luta1.marcarLuta();
		luta1.lutar();
		
		System.out.println(lutador1);
		System.out.println(lutador2);
		
	}

}
