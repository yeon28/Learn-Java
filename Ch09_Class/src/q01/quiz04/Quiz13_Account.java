package q01.quiz04;

import p07.singleton_usage.Singleton;

public class Quiz13_Account {
	private String ano;
	private String owner;
	private double balance;

	
	public Quiz13_Account(String ano, String owner, double balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
//	-----------------------------------getter method 
	public String getAccount() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

//	-----------------------------------setter method 
	public void setAccount(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setDeposit(Double deposit) {
		balance += deposit;
	}

	public void setWithdraw(Double withdraw) {
		balance -= withdraw;
	}

}
