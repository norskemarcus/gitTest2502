package com.company;
import java.util.Scanner;

public class Main {

    public void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tast ind dit navn: ");
        String navnBruger=  input.nextLine();
        System.out.println("Hej " + navnBruger);
    }


    public static void main(String[] args) {
	// Prøveprojekt for at arbejde med git og github
        System.out.println("It works");

        Main obj = new Main();
        obj.greet();
    }
}
