/*package com.novauc;

import java.util.HashMap;
import java.util.Scanner;
// main class
class BankAccount {

    public static void main(String[] args) {
// all the new stuff


        Scanner input = new Scanner(System.in);
        HashMap<String, Double> accountMap = new HashMap<String, Double>();

        //Options
        while (true) {
            People people = new People();
            System.out.println("Welcome customer,");
            System.out.println();
            System.out.println("Please enter name: ");
            int People = input.nextInt();
            System.out.print(people);

        //new stuff
            accountMap.put("Jon", 333.33);
            accountMap.put("Steve", 735.00);
            accountMap.put("Tim", 1000.00);
            accountMap.put("Donald", 3000.00);




            System.out.println("Enter the option for the operation you need:");
            System.out.println("****************************************************");
            System.out.println("[ Options: 1 - New Account 2 - Delete Account ]");
            System.out.println("[       3 - Deposit    4 - Withdraw      ]");
            System.out.println("[           5 - Select Account 6 - Quit      ]");
            System.out.println("****************************************************");
            System.out.print("/ ");  //indicator for user input

            String choice = input.next();
            System.out.println("Your choice: " + choice);

            if (choice.equals("1")) {
                Integer newAccountNumber;
                Double initialBalance;
                Account newAccount;

                // Array for account and balance
                System.out.print("Hello, what's your name: ");
                System.out.print("Insert account number: ");
                newAccountNumber = input.nextInt(); //-- Input nr for array insertion
                System.out.print("Enter initial balance: ");
                initialBalance = input.nextDouble(); //-- Input nr for array insertion
                newAccount = new Account(newAccountNumber, initialBalance);
                accountMap.put(newAccountNumber, newAccount);
                System.out.println("New Account " + newAccountNumber + " created with balance: " + initialBalance);
            }
            //select account
            else if (choice.equals("5")) {
                System.out.println("Enter number of account to be selected: ");
                Integer accountToGetNumber = input.nextInt();
                Account returnedAccount = accountMap.get(accountToGetNumber);
                if (returnedAccount != null) {
                    System.out.println("Account open. Current balance: " + returnedAccount.getBalance());
                } else {
                    //user input for account nr from array
                    System.out.println("Account does not exist.");
                }
            }
            //close account
            else if (choice.equals("2")) {
                System.out.println("Enter number of account to be selected: ");
                Integer accountToDeleteNumber = input.nextInt();
                Account removedAccount = accountMap.remove(accountToDeleteNumber);
                if (removedAccount != null) {
                    System.out.println("Account " + removedAccount.getAccountNumber() + " has been closed with balance: " + removedAccount.getBalance());
                } else {
                    //user input for account nr from array
                    System.out.println("Account does not exist.");
                }
            }
            // deposit
            else if (choice.equals("3")) {
                System.out.println("Enter number of account to deposit: ");
                Integer accountToDeposit = input.nextInt();
                System.out.print("Enter amount to deposit:  ");
                double amount = input.nextDouble();
                if (amount <= 0) {
                    System.out.println("You must deposit an amount greater than 0.");
                } else {
                    accountMap.get(accountToDeposit).deposit(amount);
                    System.out.println("You have deposited " + (amount));
                    System.out.println("Current balance " + accountMap.get(accountToDeposit).getBalance());
                }
            }
            // withdrawal
            else if (choice.equals("4")) {
                System.out.println("Enter number of account to withdraw: ");
                Integer accountToWithdraw = input.nextInt();
                System.out.print("Enter amount to withdraw:  ");
                double amount = input.nextDouble();
                if (amount <= 0) {
                    System.out.println("You must deposit an amount greater than 0.");
                } else {
                    accountMap.get(accountToWithdraw).withdraw(amount);
                    System.out.println("You have deposited " + (amount));
                    System.out.println("Current balance " + accountMap.get(accountToWithdraw).getBalance());
                }
            }
            //quit
            else if (choice.equals("6")) {
                break;
            } else {
                System.out.println("Wrong option.");
            } //end of if
        } //end of loop

        input.close();
    } //end of mai
}
*/