package com.altun.HelloWorldLuckyNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// met sout + tab heb je een methode body sneller geschreven
        System.out.println("Hello World");

        int number = 0;

        System.out.println("Geef invoer op:");

        Scanner userInteraction = new Scanner(System.in);
        number = userInteraction.nextInt();

        System.out.println("U heeft " + number + " ingevoerd!");
        System.out.println("Geef naam op:");
        String userName = userInteraction.next();
        //cause .next can catch every datatype
	    
	    // CONCATENATION EXAMPLE

        System.out.println("Uw naam is " + userName + " en uw geluksnummer is " + number + ".");

    }
}
