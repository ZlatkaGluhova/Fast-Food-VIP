package test;

import com.oop.examples.junit.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        double sum = calculator.sum(5.5, 6);

        //Assert
        Assert.assertTrue(11.5 == sum);
    }
}
