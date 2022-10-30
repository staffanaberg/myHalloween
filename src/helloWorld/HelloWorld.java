package helloWorld;

import java.util.Scanner;

public class HelloWorld {

    //Här börjar ett Java-program
    //snabbkomando psvm
    public static void main(String[] args) {
        //Starta Scanner
        Scanner scan = new Scanner(System.in);

        //Läs in ett tal
        //Integer.parseInt(scan.nextLine());


        int number1 = Integer.parseInt(scan.nextLine());

        int number2 = Integer.parseInt(scan.nextLine());

        int number3 = Integer.parseInt(scan.nextLine());

        System.out.println(number1 + number2 + number3);

    }

}

