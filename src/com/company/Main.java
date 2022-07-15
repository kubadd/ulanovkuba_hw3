package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("какую сумму хотите вывести");
        bankAccount.deposit(scanner.nextDouble());
        while (true){
            try {
                System.out.println("у вас на счете" + bankAccount.getAmount());
                bankAccount.withDraw(6000);

                System.out.println("----------------");
            } catch (LimitException e) {
                System.out.println(e.getMessage());

                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                }catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                break;

            }
        }
    }
}
