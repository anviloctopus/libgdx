/*package com.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/12/17.
 */
public class Account {
    public Account( Double initialBalance) {
    }



    public String getAccountNumber() {
        return "accountNumber";
    }

    public void withdraw(double amount) {
    }

    public void deposit(double amount) {
    }

    public String getBalance() {
        return null;
    }

    /**
     * Created by ANVIL_OCTOPUS on 2/12/17.
     */
    public static class Customers {


        String name;
        String balance;


        int choice;


        int withdraw;
        int cancel;


        public void chooseName() throws Exception {
            //        if (favoriteNumber == 7) {
            //            System.out.println("That's a bad favorite number");
            //        } else {
            //            System.out.println("Cool, your favorite number is " + favoriteNumber);
            //        }


            System.out.println("What is your name!");



            if (name.equalsIgnoreCase("")) {
                throw new Exception("Invalid name.");

            } else {
                System.out.println("Welcome, " + name);


            }
        }

        public void chooseBalance() throws Exception {
            System.out.println("Would you like to 1. balance 2. withdraw 3. cancel ");

            if (balance.equalsIgnoreCase("1")) {
                System.out.println("1000");
            } else if (balance.equalsIgnoreCase("2")) {
                System.out.println("How much would you like");


            } else if (balance.equalsIgnoreCase("3")) {
                System.out.println("Thank you and please come again");
            }

        }


    }}

    /*