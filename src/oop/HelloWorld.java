package oop;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("How many times do you want to write Hello World?");

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        //Skapa ett nytt objekt av typen HelloWorldPrinter
        HelloWorldPrinter printer = new HelloWorldPrinter();


        printer.printManyTimes(number);


    }


}
