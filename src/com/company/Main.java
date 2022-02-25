package com.company;
import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);

    public void greet(){
        System.out.println("Velkommen");
        System.out.println("Test 1");
        System.out.println("Tast ind dit navn: ");
        String navnBruger=  input.nextLine();
        System.out.println("Hej " + navnBruger);
    }

    public void askAboutAge(){
        System.out.println("Hvor gammel er du? ");
        int alderBruger = input.nextInt();
        System.out.println(alderBruger);
    }

    public static void main(String[] args) {
	// Prøveprojekt for at arbejde med git og github
        System.out.println("It works");

        Main obj = new Main();
        obj.greet();
        obj.askAboutAge();
    }
}
