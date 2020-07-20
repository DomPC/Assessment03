package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String Weird = "Weird";
        if (input % 2 != 0){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
        return Weird;
    }
}
