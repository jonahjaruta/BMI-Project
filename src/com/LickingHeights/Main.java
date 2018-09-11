package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //declare
        Scanner keyboard;
        String userName;
        float userWeight;
        float userHeight;
        float total;
        float numberOne;

        //initializing
        keyboard = new Scanner (System.in);
        numberOne = 703;

        System.out.println("Hi, we're gonna calculate your BMI. Lets start with your name, what is it?");
        userName = keyboard.nextLine();
        System.out.println("Hey " +userName+ ", to find your BMI I need to ask a few questions.");
        System.out.println("For starters, could you tell me what your weight is?");
        userWeight = keyboard.nextFloat();
        System.out.println("Next, could I get your height in inches?");
        userHeight = keyboard.nextFloat();
        System.out.println("Thanks! With that information I will calculate your BMI");
        total = userWeight/(userHeight*userHeight)*numberOne;
        System.out.println("Alright "+userName+ " your BMI is "+total+ ".");







    }
}
