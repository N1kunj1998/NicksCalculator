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
}
