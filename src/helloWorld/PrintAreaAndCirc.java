package helloWorld;

import java.util.Scanner;

public class PrintAreaAndCirc {

    public static void main(String[] args) {

        //Starta inläsningen
        Scanner scan = new Scanner(System.in);

        //Läs in sida1 och spara det inlästa värdet
        //typ variabelnamn = innehåll;
        int length = Integer.parseInt(scan.nextLine());

        //Läs in sida2 och spara det inlästa värdet
        int width = Integer.parseInt(scan.nextLine());

        //Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.

        //Beräkna arean (sida1 * sida2)
        int area = length * width;

        //Beräkna omkretsen (sida1*2 + sida2*2)
        int circ = length*2 + width*2;

        //Skriv ut arean och omkretsen
        System.out.println("Area is: " +area);
        System.out.println("Circumference is: " +circ);



    }


}
