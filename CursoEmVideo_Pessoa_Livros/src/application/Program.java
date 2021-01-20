package application;

import entities.Livro;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, 'M');
		p[1] = new Pessoa("Felipe", 25, 'M');

		
		
		l[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 600, p[1]);
		l[1] = new Livro("POO", "Maria Candido", 300, p[0]);
		l[2] = new Livro("Java Avançado", "Fred Antony", 500, p[1]);
		
		l[1].abrir();
		l[1].voltarPag();
		System.out.println(l[1]);
		
		
	}

}
