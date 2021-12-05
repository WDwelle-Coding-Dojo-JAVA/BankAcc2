import java.util.*;
public class BankAccount {
	
		private double checkingBalance;
		private double savingsBalance;
		private static int numAcc = 0;
		private static double totalAmount = 0;


        //---Constructor---
        public BankAccount(){
			totalAmount = checkingBalance + savingsBalance;
            numAcc++; 
        }

        public BankAccount(double checking, double saving){
            this.checkingBalance = checking;
            this.savingsBalance = saving;
			totalAmount = checkingBalance + savingsBalance;
            numAcc++;
        }
	//---Getters and Setters---
		private double getCheckingBalance() {
			return this.checkingBalance;
		}
		private double getSavingsBalance() {
			return this.savingsBalance;
		}

	//---Methods---
		public void deposit(String accountType, double amount) {
			if (accountType == "checking") {
				this.checkingBalance += amount;
			} else if (accountType == "savings") {
				this.savingsBalance += amount;
			} else {
				System.out.println("Incorrect account type.");
			}
			totalAmount += amount;
		}

		public void withdraw(String accountType, double amount) {
			if (accountType == "checking") {
				this.checkingBalance -= amount;
			} else if (accountType == "savings") {
				this.savingsBalance -= amount;
			} else {
				System.out.println("Incorrect account type.");
			}
			totalAmount -= amount;
		}

		public void showTotal(){
			System.out.println("Your total is: " + totalAmount);
		}		
}			