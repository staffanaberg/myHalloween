package exerciseA;

import java.util.Scanner;

public class Circle9 {

    public static void main(String[] args) {

        //Skapa ett program där en cirkels radie läses in.

        int r = 10;

        //Cirkelns diameter, omkrets och area
        //skall beräknas och skrivas ut. (pi = 3.14).

        double pi = 3.14;

        //Diametern är radien gånger 2
        //d = r * 2
        double d = r * 2;

        //Omkrets beräknas - π · diametern
        //o = pi * d
        double o = pi * d;

        //Area skall beräknas - Area = π · radien upphöjt med 2
        //a = pi * r * r
        double a = pi * r * r;

        //Skriv ut d, o, a (diameter, omkrets och area)

        System.out.println("Diametern är:" +d);

        System.out.println("Omkretsen är:" +o);

        System.out.println("Arean är:" +a);

    }
}
