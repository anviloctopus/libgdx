package com.novauc;

public class Main {

    public static void main(String[] args) {


        int sum =0;
        int item =0;
        System.out.println("Even Numbers From 1 To 10\n");
        do{
            if ((item % 2)== 1){}

            System.out.print(item);
            sum += item;
            System.out.println(" => " + sum );
            item++;

        }while (item <= 10);
        System.out.println("The sum of all even numbers up to 10 is" + sum);
	// write your code here
    }
}
