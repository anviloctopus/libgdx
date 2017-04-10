//package com.novauc;

//import com.sun.tools.internal.ws.processor.model.Model;
import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Spark.init();


        Spark.get("/", ((request, response) -> {

            HashMap m = new HashMap();
            m.put("name", "Alice");
            return new ModelAndView(m, "home.html");


        }), new MustacheTemplateEngine()

        );



    }

}
