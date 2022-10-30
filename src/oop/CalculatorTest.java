package oop;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        //Arrange
        Calculator calc = new Calculator(2,3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDiv() {
        //Arrange
        Calculator calc = new Calculator(12,3);
        int expected = 4;

        //Act
        int actual = calc.div();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDivWithZero() {
        //Arrange
        Calculator calc = new Calculator(12,0);
        int expected = 4;

        //Act
        int actual = calc.div();

        //Assert
        assertEquals(expected, actual);
    }

}
