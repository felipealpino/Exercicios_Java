package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.HeartRates;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Date nascimento = sdf.parse(sc.nextLine());
		HeartRates hr = new HeartRates("Felipe", "Gontijo", sdf.parse("07/02/1995"));
		
		long idade = hr.idadePessoa();
		System.out.println("A idade da pessoa é: "+ idade+" anos");
		long frMax = hr.frequenciaMaxima();
		System.out.println("A frequencia cardiaca máxima é: "+frMax+"bpm");
		hr.frequenciaAlvo();
		
		
		sc.close();
	}

}
