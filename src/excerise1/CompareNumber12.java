package excerise1;

import java.util.Scanner;

public class CompareNumber12 {

    public static void main(String[] args) {

        //Läs in två tal.
        Scanner scan = new Scanner(System.in);

        int number1 = Integer.parseInt(scan.nextLine()); //11
        int number2 = Integer.parseInt(scan.nextLine()); //5
        /*
        int number1 = 12;
        int number2 = 34;
        */

        // Testa om det första talet är åtminstone mer än dubbelt så stort
        // som det andra talet.
        //I så fall ska meddelandet “För stort“ skrivas ut.

        if(number1 > number2*2) {
            System.out.println("För stort");
        }

    }


}
