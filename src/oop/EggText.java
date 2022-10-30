package oop;

import java.util.Scanner;

public class EggText {

    public static void main(String[] args) {

        //Läs in en String (scan.nextLine())

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        //System.out.println(text);

        //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen

        //int numberOfIterations = text.length();
        if(text.equals("ägg")) {
            System.out.println("ägg är knasigt");
        } else {
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));
            }
        }

        //Om man skriver ordet "ägg" så skrivs meningen "ägg är knasigt" ut


    }

}
