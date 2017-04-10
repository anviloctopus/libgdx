package com.novauc;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        String[] names = new String[3];

        names[0] = "Donald";
        names[1] = "Barack";
        names[2] = "George";


        for (String name : names) {
            System.out.println(name);


        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        int myint = Integer.valueOf("123");
        System.out.println("myint:" + myint);


        double mydouble = Double.valueOf("1.5");
        System.out.println("mydouble: " + mydouble);

        boolean mybool = Boolean.valueOf("true");
        System.out.println("mybool: " + mybool);

/*
        ArrayList friends = new ArrayList();

        friends.add("Alvin");
        friends.add("Alvaro");
        friends.add("Mike");
        friends.add("Prakash");

        System.out.println("Friend on left: " + friends.get(1));
        System.out.println("Friends on right: " + friends.get(0));
*/
        HashMap<String, String> presidents = new HashMap();
        presidents.put("George", "703-222-4456" );
        presidents.put("Abraham", "222-364-7655" );
        presidents.put("Herbert", "787-452-0000" );
        presidents.put("Barack", "212-222-9999" );
        presidents.put("Donald", "202-453-1111" );

        Object herbertsPhone = presidents.get("Herbert");

        System.out.println(herbertsPhone);
    }
}
/*
        / advanced int g = 0;
        while (g < 5) {
            System.out.println("Hello index, " + g );
            g++;
        }

    }
}








        int score = 0;

        System.out.println("Score is: " + score);

        score = score + 1;


        System.out.println("Score + 1 is: " + score);


        score += 1;

        System.out.println("Score + 1 is: " + score);

        double health =100.0;

        System.out.println("health is: " + health);

        health = health * 0.75;

        System.out.println("heath is: " + health);

        boolean didWin = false;

        System.out.println("didWin: " + didWin);

        didWin = score > 0;

        System.out.println("didWin: " + didWin);


        double[] position = {1.0, 1.5};

         position = new double [2];

         position[0] = 1.0;

         position[1] = 1.5;


        System.out.println("position[0]: " + position[0]);
        System.out.println("position[1]: " + position[1]);

        Person me = new Person();

        me.name = "Alvin";
        me.age = 34;
        me.isAlive = true;

        Person president = new Person();

        president.name = "Donald Trump";
        president.age = 70;
        president.isAlive = true;


        System.out.println("President's name is: " + president.name);
        System.out.println("age is: " + me.age);
        System.out.println("isAlive: " + me.isAlive);


        me.setAge(25);
        me.setAge(225);
        me.setIsAlive(false);

        System.out.println("Me age: " + me.getAge());
        System.out.println("Me isAlive: " + me.isAlive());

 */








