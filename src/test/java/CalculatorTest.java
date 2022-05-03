import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator obj;

    public CalculatorTest() {
        obj = new Calculator();
    }

    @Test
    public void sqrt(){
        int num = 4;
        double expectedResult = 2.0;
        double result = obj.sqrt(num);
        Assert.assertEquals(expectedResult, result,0);
    }

    @Test
    public void factorial(){
        int num = 5;
        int expectedResult = 120;
        int result = obj.factorial(num);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void logarithm(){
        double num = 10.0;
        double expectedResult = 2.302585092994046;
        double result = obj.logarithm(num);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void power(){
        double num1 = 2.0;
        double num2 = 3.0;
        double expectedResult = 8.0;
        double result = obj.power(num1, num2);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void add(){
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;
        int result = obj.add(num1, num2);
        Assert.assertEquals(expectedResult, result, 0);
    }
}
