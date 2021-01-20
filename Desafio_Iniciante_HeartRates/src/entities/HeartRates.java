package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class HeartRates {

	// private static final SimpleDateFormat sdf = new
	// SimpleDateFormat("dd/MM/yyyy");

	private String nome;
	private String sobrenome;
	private Date dataNascimento;

	public HeartRates(String nome, String sobrenome, Date dataNascimento) {
		// super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long idadePessoa() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.dataNascimento);
		int dia = cal.get(Calendar.DATE);
		int mes = cal.get(Calendar.MONTH) + 1;
		int ano = cal.get(Calendar.YEAR);
		LocalDate start = LocalDate.of(ano, mes, dia);
		LocalDate end = LocalDate.now(); // use for age-calculation: LocalDate.now()
		long idade = ChronoUnit.YEARS.between(start, end);

		return idade;
	}

	public int frequenciaMaxima() {
		return (int) (220 - idadePessoa());
	}

	public void frequenciaAlvo() {
		int frMax = frequenciaMaxima();
		System.out.println("Frequancia Cardiada algo é entre:"+ String.format("%.0f",frMax*0.5)+"bpm e "+  String.format("%.0f", frMax*0.85) +"bpm");
	}

}
