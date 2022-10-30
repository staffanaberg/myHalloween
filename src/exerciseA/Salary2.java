package exerciseA;

import java.util.Scanner;

public class Salary2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sales = Integer.parseInt(scan.nextLine());
        //Försäljningssumman ska läsas in.
        //Försäljningssumman "hårdkodad" (sales)
        //type name = value;
        //int sales = 1000000;

        //En försäljare har delvis prestationslön.
        //Han får 8000 kr per månad i grundlön
        //Spara 8000 som grundlön (baseSalary)
        int baseSalary = 8000;

        //Och 9% av försäljningssumman är hans prestationsdel
        //Prestationsdel = 9% av försäljningssumman (sales)
        //commission = sales * 0.09 eller sales* 9 / 100
        int commission = sales * 9 / 100;
        double percentage = 0.09;

        //Skapa ett program som beräknar lönesumman under en period.
        //salary = commission + baseSalary
        int salary = commission + baseSalary;


        //skriva ut lönesumma (salary)
        System.out.println(salary);



    }


}
