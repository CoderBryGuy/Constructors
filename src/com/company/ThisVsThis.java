package com.company;

//this vs this()

class Person{
    private String firstName;
    private String lastName;

    public Person(){

        this("Eric", "Johnson");
    }

    public Person(String firstName, String name){

        String lastName = "myName";
        this.firstName = firstName;
        this.lastName = name;


    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
    return firstName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName; 
    }
}

public class ThisVsThis {

    public static void main(String[] args) {

    }
}
