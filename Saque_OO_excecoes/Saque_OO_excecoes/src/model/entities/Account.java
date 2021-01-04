package model.entities;

import model.exceptions.DomainException;

public class Account {

	private int number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(int number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	
	public void withdraw(Double amount) throws DomainException {
		if(this.withdrawLimit < amount) {
			throw new DomainException("Limite não permitido");
		}
		if(this.balance < amount) {
			throw new DomainException("Valor não disponível");
		}
		
		this.balance = this.balance - amount;
	}
	
	@Override
	public String toString() {
		return "New balance: "+this.balance;
	}
	
}
