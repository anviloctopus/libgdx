package com.novauc;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ANVIL_OCTOPUS on 2/11/17.
 */
public class Customer {
    String name;
    double balance = 0.0;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    Scanner input = new Scanner(System.in);
    Scanner inputDbl = new Scanner(System.in);

    public Customer() {

    }


    void prompt(HashMap<String, Double> accounts) throws Exception {
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("Hello, " + name);

        if (accounts.containsKey(name)) {
            // We already have an account
            return;
        } else {
            // Need to make an account
            System.out.println("Welcome, " + name + ". Your new account has $10 in it!");
            accounts.put(name, 10.0);
            balance = 10.0;
            accounts.putIfAbsent(name, balance);
        }
    }

    void menu() throws Exception{
        while (true) {
            System.out.println("Check balance, Deposit funds, Withdraw funds, Cancel, Delete account");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("Check balance")) {
                //checkBalance (); check balance
                System.out.println("Your balacne is  " + balance);

            } else if (choice.equalsIgnoreCase("Deposit funds")) {
                System.out.println("How much do you want to deposit");
                balance = balance + inputDbl.nextDouble();

            } else if (choice.equalsIgnoreCase("Withdraw funds")) {
                //withdraw funds here
                withdraw();

            } else if (choice.equalsIgnoreCase("Delete account")){
                System.out.println("Your account has been deleted, have a great day");
                System.exit(0);


                System.out.println("This is withdraw funds");
            } else if (choice.equalsIgnoreCase("Cancel")) {
                //withdraw funds here
                System.out.println("Thank you have a nice day!");
                System.exit(0);

            } else
                return;

        }
    }

    public void withdraw() throws Exception{

        System.out.println("how much would you like?");
        double withdraw = inputDbl.nextDouble();
        if (withdraw> balance) {
            throw new Exception("Wrong");
        } else {
            balance = balance - withdraw;
            System.out.println("Please take your money. Your new balance is " +  balance );
        }

    }
}

