package entities;

public class Account {

	private int numConta;
	private String nomeTitular;
	private double valorNaConta;
	
	
	
	public Account(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public Account(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		//this.valorNaConta = valorNaConta;
		novoDeposito(depositoInicial);
	}


	public static final double TAXA = 5.0;

	
	public int getNumConta() {
		return numConta;
	}
	/*public void setNumConta(int numConta) {
		this.numConta = numConta;
	}*/


	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getValorNaConta() {
		return valorNaConta;
	}
	/*public void setValorDepositado(double valorDepositado) {
		this.valorDepositado = valorDepositado;
	}*/
	

	
	public void novoDeposito(double valorDepositado) {
		this.valorNaConta += valorDepositado;
	}
	
	public void novoSaque(double valorSacado) {
		this.valorNaConta -= valorSacado + TAXA;
	}
	
	public void accountData() {
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",numConta,nomeTitular,valorNaConta);
	}
	
	
	
	
}
