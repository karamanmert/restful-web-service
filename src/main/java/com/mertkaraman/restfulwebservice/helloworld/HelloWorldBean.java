package com.mertkaraman.restfulwebservice.helloworld;


public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() { //if you dont add getter method, the automatic converting will not work!
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}


