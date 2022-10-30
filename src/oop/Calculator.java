package oop;

public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int first, int second) {
        number1 = first;
        number2 = second;
    }

    public int add() {
        return number1 + number2;
    }

    public int div() {
        return number1 / number2;
    }

}
