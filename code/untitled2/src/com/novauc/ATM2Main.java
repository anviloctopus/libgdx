package com.novauc;


import java.util.Scanner;


public class ATM2Main {

    public static void main(String[] args, Scanner scan) {


        System.out.println("Hello, what is your name?");

        Scanner input = new Scanner(System.in);


        String name = input.next();
        System.out.println("Welcome, " + name + " what would you like to do?");
        System.out.println("****************************************************");
        System.out.println("[ Options: 1 - New Account 2 - Delete Account ]");
        System.out.println("[       3 - Deposit    4 - Withdraw      ]");
        System.out.println("[           5 - Select Account 6 - Quit      ]");
        System.out.println("****************************************************");
        System.out.print("/ ");  // user input



        }

    }
