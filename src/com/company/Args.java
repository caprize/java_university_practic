package com.company;

public class Args {
    private String[] body;


    public void printArgs(){
        for (String i:body){
            System.out.println(i);
        }
    }

    public void setBody(String[] body) {
        this.body = body;
    }

    public String[] getBody() {
        return body;
    }

    public Args(String[] body) {
        this.body = body;
    }
}
