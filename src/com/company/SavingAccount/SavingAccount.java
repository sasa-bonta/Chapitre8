package com.company.SavingAccount;

public class SavingAccount {
    public static double annualInterestRate;
    private double savingBalance;

     public static void modifyInterestRate(double annual) {
        annualInterestRate = annual;
    }

    //Constructor
    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    //get set
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double calculateMonthlyInterest() {
         setSavingBalance(getSavingBalance() + getSavingBalance() * ((annualInterestRate / 100) / 12));
         return getSavingBalance() + getSavingBalance() * ((annualInterestRate / 100) / 12);
    }
}
