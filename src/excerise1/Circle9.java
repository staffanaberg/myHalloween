package excerise1;

import java.util.Scanner;

public class Circle9 {

    public static void main(String[] args) {
        //Skapa ett program där en cirkels radie läses in. r
        Scanner scan = new Scanner(System.in);
        int r = Integer.parseInt(scan.nextLine());


        //double r = 5;

        //pi = 3.14
        //type name = value;
        double pi = 3.14;


        //Cirkelns diameter beräknas - Alltså radien gånger 2
        //d = r * 2
        double d = r * 2;

        //Omkrets beräknas - π · diametern
        //o = d * pi
        double o = d * pi;
        //int myO = Math.round((long) o);

        //Area skall beräknas - A = pi * r * r
        //a = pi * r * r
        double a = pi * r * r;

        //Skriva ut Omkrets, Area, diameter

        System.out.println("Diameter: " +d);
        System.out.println("Omkrets: " +o);
        System.out.println("Area: " +a);

    }
}
