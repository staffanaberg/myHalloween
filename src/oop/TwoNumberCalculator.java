package oop;

import java.text.NumberFormat;

public class TwoNumberCalculator {

    public static void main(String[] args) {

        //Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en 	main-metod
        //

        int num = 5;
        int num2 = 7;
        double div = ((double) num)/num2;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        String rounded = nf.format(div);
        System.out.println(rounded);
        System.out.println(div);


    }

}
