package entities;

public class Livro implements Publicacao{

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	
	//agregando pessoa
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor + "]";
	}


	// IMPLEMENTING INTERFACE CONTRATO METHODS 
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		if(this.aberto == false) {
			this.aberto = true;
		} else {
			System.out.println("O livro já está aberto");
		}
	}

	@Override
	public void fechar() {
		if(this.aberto == true) {
			this.aberto = false;
		} else {
			System.out.println("O livro já está fechado");
		}
	}

	@Override
	public void folhear(int p) {
		if(p > this.totPaginas) {
			System.out.println("Não é possivel ir até a página "+p+",o livro contem somente "+this.totPaginas);
		} else {
			this.pagAtual = p;
		}
	}

	@Override
	public void avançarPag() {
		if((this.pagAtual + 1) >= this.totPaginas) {
			System.out.println("Não é possivel avançar uma pagina, livro contem somente "+this.totPaginas);
		} else{
			this.pagAtual++;		
		}
	}

	@Override
	public void voltarPag() {
		if((this.pagAtual - 1) <= 0) {
			System.out.println("Não é possivel voltar uma pagina, já está localizado no inicio");
		} else { 
			this.pagAtual--;
		}
	}

}
