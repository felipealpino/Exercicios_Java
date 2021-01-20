package entities;

public abstract class Pessoa {
	
	protected String name;
	protected int idade;
	protected char sexo;
	protected double experiencia;
	
	public Pessoa(String name, int idade, char sexo) {
		super();
		this.name = name;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
	
	protected void ganharExp() {
		this.experiencia++;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
	
	
	
	
}
