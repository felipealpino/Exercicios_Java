package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;


	public double somaNotas() {
		return this.nota1 + this.nota2 + this.nota3;
	}

	public void passFailed() {
		double resultado = somaNotas();
		if (resultado>60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING "+(60-resultado)+" POINTS" );
		}
		
	}

}
