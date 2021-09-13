package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        String firstString = input.next();
        int age = Integer.parseInt(firstString);

        int legalAge = 16;
        String msg = "";

        if(age >= legalAge){
            msg= "You are old enough to legally drive.";

        }
        else{
            msg = "you are not old enough to legally drive.";

        }

        System.out.println(msg);

    }
}
