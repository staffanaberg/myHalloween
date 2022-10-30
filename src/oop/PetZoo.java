package oop;

import java.util.Scanner;

public class PetZoo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pet dog = new Pet("Kurt");
        Pet cat = new Pet("Sven");
        Pet rabbit = new Pet("Lurven");

       /* String dogName = dog.getName();
        String catName;
        String rabbitName;

        catName = cat.getName();
        rabbitName = rabbit.getName();
*/
        rabbit.setName("Lovis");

        if(rabbit.getName().equals("Lurven")) {
            System.out.println("Hade vi inte bytt namn på kaninen?");
        }

        //Window mywindow = new Window(rabbit.getName());
/*
        for(int i=0; i<10; i++) {
            dog.printName();
            cat.printName();
            rabbit.printName();
        }
*/
    }

}
