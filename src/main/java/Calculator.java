import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double sqrt(int n){
        logger.info("Calculating Square Root of : " + n + "\n Result : " + Math.sqrt(n));
        return Math.sqrt(n);
    }

    public static int factorial(int n){
        if(n < 0) {
            logger.info("Factorial of -ve number is not possible");
            return -1;
        } else {
            int num = 1;
            for (int i = 1; i <= n; i++) num *= i;
            logger.info("Calculating Factorial Root of : " + n + "\n Result : ");
            return num;
        }
    }

    public static double logarithm(double var){
        logger.info("Calculating Natural Logarithm of : " + var + "\n Result : " + Math.log(var));
        return Math.log(var);
    }

    public static double power(double var1, double var2){
        logger.info("Power : " + var1 + "^" + var2 + "\n Result : " + Math.pow(var1, var2));
        return Math.pow(var1, var2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("what you want to test\n" +
                    "Press 0 for exit\n" +
                    "Press 1 for Square root function\n" +
                    "Press 2 for Factorial function\n" +
                    "Press 3 for Natural logarithm\n" +
                    "Press 4 for Power function");

            int input = scanner.nextInt();

            switch (input){
                case 0:
                    return;
                case 1:
                    System.out.println("Enter a number for sqrt\n");
                    num = scanner.nextInt();
                    System.out.println(sqrt(num));
                    break;
                case 2:
                    System.out.println("Enter a number for factorial\n");
                    num = scanner.nextInt();
                    System.out.println(factorial(num));
                    break;
                case 3:
                    System.out.println("Enter a number for logarithm\n");
                    double num1 = scanner.nextDouble();
                    System.out.println(logarithm(num1));
                    break;
                case 4:
                    System.out.println("Enter a number for power\n");
                    double n1 = scanner.nextDouble();
                    double n2 = scanner.nextDouble();
                    System.out.println(power(n1, n2));
                    break;
            }
        }
    }
}
