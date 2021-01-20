package application;

import entities.Gafanhoto;
import entities.Video;
import entities.Visualizacao;

public class Program {

	public static void main(String[] args) {
		
		Gafanhoto g1 = new Gafanhoto("Felipe", 25, 'M', "felipealpino1@gmail.com");
		Video v1 = new Video("Java avançado");
		Visualizacao video1 = new Visualizacao(g1, v1);
		
		video1.avaliar(7);
		System.out.println(video1);
		
		
	}

}
