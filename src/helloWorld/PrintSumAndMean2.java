package helloWorld;

import java.util.Scanner;

public class PrintSumAndMean2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Mata in 3 tal");
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int number3 = Integer.parseInt(scan.nextLine());

        int numberTotal = number1 + number2 + number3;

        int numberAverage = numberTotal / 3;

        System.out.println("summan av talen är: " + numberTotal);
        System.out.println("medelvärdet av talen är: " + numberAverage);
    }


}
