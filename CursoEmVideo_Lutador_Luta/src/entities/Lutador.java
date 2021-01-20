package entities;

public class Lutador {
	private String name;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public Lutador(String name, String nacionalidade, int idade, double altura, double peso,
			int vitorias, int derrotas, int empates) {
		this.name = name;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria(peso);
		
	}


	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(double peso) {
		if(peso <=50.2) {
			System.out.println("Não existe uma categoria para um peso tão leve");
		} else if (peso <= 70.2) {
			this.categoria = "Leve";
		} else if (peso <= 90.2) {
			this.categoria = "Médio";
		} else if (peso <= 110.2) {
			this.categoria = "Pesado";
		} else {
			System.out.println("Não existe uma categoria para um peso tão pesado");
		}
	}


	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}


	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void empatou() {
		this.empates++;
	}
	public void venceu() {
		this.vitorias++;
	}
	public void perdeu() {
		this.derrotas++;
	}
	

	@Override
	public String toString() {
		return "Lutador [name=" + name + ", nacionalidade=" + nacionalidade + ", categoria=" + categoria + ", vitorias="
				+ vitorias + ", derrotas=" + derrotas + ", empates=" + empates + "]";
	}


	
	
	
}
