package excerise1;

import java.util.Scanner;

public class Salary2 {

    public static void main(String[] args) {

        //Försäljningssumman ska läsas in.
        //Försäljningssumma - Spara försäljningssumman - 80 000 kr
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int salesAmount = Integer.parseInt(scan.nextLine());

        int salesAmount2 = Integer.parseInt(scan.nextLine());
        int salesAmount3 = Integer.parseInt(scan.nextLine());
        //int salesAmount = 400000;


        //En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.


        //Grundlön - Spara grundlön 8000 kr
        int baseSalary = 8000;



        //Lönesumma - Grundlön + Försäljningssumman * 9%
        //Grundlön + (Försäljningssumman * 9 / 100)
        int salary = baseSalary + (salesAmount*9/100);

        //Skriv ut lönesumma
        System.out.println(salary);




    }

}
