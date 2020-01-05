package test;

import java.util.Scanner;

class Account{
	int id;
	double balance;
	double interestRate;
	
	public Account(int id, double balance, double interestRate) { //constructor
		this.id = id;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

	
}

public class Solution {
	
	private int noOfyears;
	double interestRate;

	void calculateInterest(int yrs, double intr) {
		this.interestRate = interestRate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter id");
		int id = obj.nextInt();
		System.out.println("Enter Balance");
		double balance = obj.nextDouble();
		System.out.println("Interest rate");
		double itr = obj.nextDouble();
		Account acc = new Account(id,balance,itr);



	}

}
