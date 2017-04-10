package com.novauc;


import java.util.HashMap;

/**
 * Created by ANVIL_OCTOPUS on 2/13/17.
 */
public class People {

    HashMap<String, Double> atmNames = new HashMap<String, Double>();



    //populate HashMap
    atmNames.put("al", new Double(22.33));
    atmNames.put("bill", new Double(256.33));
    atmNames.put("collin", new Double(100.33));

    //showing keys
    for (String str: atmNames.keySet()) {
        System.out.println(str);


}
    //show values
    for (Double dbl: atmNames.value()) {
        System.out.println(dbl);


}


