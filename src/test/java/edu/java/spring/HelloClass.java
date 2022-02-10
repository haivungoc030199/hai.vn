package edu.java.spring;

import java.time.Clock;

public class HelloClass {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void printMessage(){
        System.out.println("Your message: "+message);


    }


}
