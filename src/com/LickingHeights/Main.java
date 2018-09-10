package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //declare
        Scanner keyboard;
        String userName;
        String userWeight;
        //initializing
        keyboard = new Scanner (System.in);

        System.out.println("Hi, we're gonna calculate your BMI. Lets start with your name, what is it?");
        userName = keyboard.nextLine();
        System.out.println("Hey " +userName+ ", to find your BMI I need to ask a few questions.");
        System.out.println("For starters, could you tell me what your weight is?");
        userWeight = keyboard.nextLine();






    }
}
