package exerciseA;

import java.util.Scanner;

public class Equation6 {

    public static void main(String[] args) {


        //Variablerna
        //a och x ska läsas in
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());


        //Skapa ett program som beräknar funktionen ax3 + 7 och skriver ut resultatet.
        //ax3+7, a*x*3+7
        int equation = a*x*3+7;

        //Skriva ut beräkningen
        System.out.println(equation);


    }


}
