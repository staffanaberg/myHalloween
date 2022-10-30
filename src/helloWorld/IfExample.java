package helloWorld;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());

        if(length==width) {
            System.out.println("Length är lika med width");
        } else if(length>width) {
            System.out.println("Length är större än width");
        } else {
            System.out.println("Length är INTE lika med width");
        }



    }


}



