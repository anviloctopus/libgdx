package com.novauc;


import java.util.HashMap;


public class Main {
    public static Customer custclass = new Customer();


    public static void main(String[] args) throws Exception {
        HashMap<String, Double> Cust = new HashMap();

        Cust.put("Al Simmons", 3000.0);
        Cust.put("Peter Parker", 1000.0);
        Cust.put("Frank Castle", 3000.0);

        custclass.prompt(Cust);
        custclass.menu();



    }











    }





