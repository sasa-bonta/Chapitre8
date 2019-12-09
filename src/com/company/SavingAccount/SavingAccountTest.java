package com.company.SavingAccount;

import static com.company.SavingAccount.SavingAccount.modifyInterestRate;

public class SavingAccountTest {

    public static void main(String[] args) {
        modifyInterestRate(4);


        SavingAccount savingAccount1 = new SavingAccount(2000);
        SavingAccount savingAccount2 = new SavingAccount(3000);

        modifyInterestRate(4);

        System.out.println("Annual Interest Rate = 4");
        System.out.println("Account 1");

        for (int i = 0; i < 12; i++){
            System.out.printf("Mounth %2d MonthlyInterest == %3.2f%n", i+1, savingAccount1.calculateMonthlyInterest());
        }

        System.out.println("Account 2");

        for (int i = 0; i < 12; i++){
            System.out.printf("Mounth %2d MonthlyInterest == %3.2f%n", i+1, savingAccount2.calculateMonthlyInterest());
        }

        modifyInterestRate(5);

        System.out.println();
        System.out.println("Annual Interest Rate = 5");
        System.out.println("Account 1");

        for (int i = 0; i < 12; i++){
            System.out.printf("Mounth %2d MonthlyInterest == %.2f%n", i+1, savingAccount1.calculateMonthlyInterest());
        }

        System.out.println("Account 2");

        for (int i = 0; i < 12; i++){
            System.out.printf("Mounth %2d MonthlyInterest == %.2f%n", i+1, savingAccount2.calculateMonthlyInterest());
        }
    }

}

