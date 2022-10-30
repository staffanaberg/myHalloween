package excerise1;

import java.util.Scanner;

public class Farenheit10 {

    public static void main(String[] args) {


        //Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9C / 5 + 32.
        //Skapa ett program där en temperatur i Fahrenheit läses in och motsvarande temperatur
        //i Celsius skrivs ut.

        //Läsa in Fahrenheit

        Scanner scan = new Scanner(System.in);



        int F = Integer.parseInt(scan.nextLine());


        //Omvandla till Celsius
        //F= (9*C / 5) + 32
        //F - 32 = 9*C/5
        //5*(F - 32) = 9*C
        //5*(F - 32)/9 = C

        double C = 5 * (F - 32) / 9;


        //Skriv ut Celsius
        System.out.println("Blir i Celcius: " +C);
    }

}
