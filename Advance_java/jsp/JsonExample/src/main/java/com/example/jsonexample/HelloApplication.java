package com.example.jsonexample;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.json.simple.JSONObject;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    public static void main(String[] args) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","piya");
        jsonObject.put("age",18);
        jsonObject.put("salary", 50000);
        System.out.println(jsonObject);




    }

}