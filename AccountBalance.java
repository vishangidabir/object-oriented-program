package com.bridgelabz.oops;
import java.util.Scanner;
public class AccountBalance {

	static Scanner scanner = new Scanner (System.in);
	private double balance;
	
	public AccountBalance (double balance) {
		this.balance = balance;
	}
	
	public void debit(double balance) {
		System.out.println("Enter the account to withdraw :");
		double withdraw = scanner.nextDouble();
		if (withdraw >=balance) {
			System.out.println("Debit account exceed account balance!");
		}
		else
		{
			balance -= withdraw;
			System.out.println("Remaining Balance :"+balance);
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the account balance :");
		AccountBalance accountBalance = new AccountBalance(scanner.nextDouble());
		accountBalance.debit(accountBalance.balance);
	}

}
