package entities;

import java.time.LocalDate;
import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	private LocalDate dataDaLuta;
	
	private Random aleatorio = new Random();
	
	public Luta(Lutador desafiado, Lutador desafiante) {
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.aprovada = false;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
	public void marcarLuta() {
		if((desafiante.getCategoria() != null && desafiado.getCategoria() != null) && (desafiante.getCategoria() == desafiado.getCategoria()) && (desafiado != desafiante)) {
			int dias = aleatorio.nextInt(15);
			LocalDate date = LocalDate.now();
			this.dataDaLuta = date.plusDays(dias);
			this.aprovada = true;
			System.out.println("A luta foi marcada para o dia: "+ this.dataDaLuta.getDayOfMonth()+"/"+this.dataDaLuta.getMonthValue()+"/"+this.dataDaLuta.getYear());
		} else {
			System.out.println("A luta nao pode ser marcada! Categoria é nula ou Categorias não são as mesmas ou o Lutador é o mesmo" );
			System.exit(0);
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
			int vencedor = aleatorio.nextInt(3);
			//int vencedor = 0;
			switch (vencedor){
				case 0:
					desafiado.empatou();
					desafiante.empatou();
					System.out.println("===================");
					System.out.println("A luta empatou!");
					System.out.println("===================");
					break;
				case 1: 
					desafiante.venceu();
					desafiado.perdeu();
					System.out.println("===================");
					System.out.println("O lutador: "+desafiante.getName()+" venceu!");
					System.out.println("===================");
					break;
				case 2:
					desafiante.perdeu();
					desafiado.venceu();
					System.out.println("===================");
					System.out.println("O lutador: "+desafiado.getName()+" venceu!");
					System.out.println("===================");
					break;
			}
		} else {
			System.out.println("A luta não não pode acontecer! ");
			System.exit(0);
		}
	}
	
	
	
}
