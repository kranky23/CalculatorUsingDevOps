import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find factorial\nPress 2 to find Square root\nPress 3 to find power\nPress 4 to find natural logarithm\n" +

                    "Press 5 to find add\nPress 6 to find subtract\nPress 7 to find multiplication\nPress 8 to find division\nPress 9 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // do factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factoral(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.sqroot(number1));
                    System.out.println("\n");


                    break;
                case 3:
                    // find power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;
                case 4:
                    // find natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                    System.out.println("\n");
                    break;
                case 5:
                    // find addition
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Addition of these numbers is " + calculator.add(number1, number2));
                    System.out.println("\n");
                    break;
                case 6:
                    // find subtraction
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Subtraction of these numbers is " + calculator.sub(number1, number2));
                    System.out.println("\n");
                    break;
                case 7:
                    // find multiplication
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Multiplication of these numbers is " + calculator.mul(number1, number2));
                    System.out.println("\n");
                    break;
                case 8:
                    // find division
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Division of these numbers is " + calculator.div(number1, number2));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double div(double number1,double number2) {
        logger.info("[DIVISION OF - " + number1 + " AND ] - " + number2);
        double result = 0;
        try {

            if (number2 == 0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of Division by zero exception");
            }
            else {
                result = number1/number2;
            }
        } catch (ArithmeticException error) {
            System.out.println("[DIVISION EXCEPTION ] - Cannot divide when denominator is zero " + error.getLocalizedMessage());
        }
        logger.info("[DIVISION RESULT ] - " + result);
        return result;
    }

    double mul(double number1, double number2) {
        logger.info("[MULTIPLICATION OF - " + number1 + " AND ] - " + number2);
        double result = number1 * number2;
        logger.info("[MULTIPLICATION RESULT ] - " + result);
        return result;
    }

    double sub(double number1, double number2) {
        logger.info("[SUBTRACTION OF - " + number1 + " AND ] - " + number2 );
        double result = number1 - number2;
        logger.info("[SUBTRACTION RESULT ] - " + result);
        return result;
    }

    double add(double number1, double number2) {
        logger.info("[ADDITION OF " + number1 + " AND ] - " + number2);
        double result = number1 + number2;
        logger.info("[ADDITION RESULT ] - " + result);
        return result;
    }


    public double factoral(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[FACTORIAL RESULT ] - " + result);
        return result;
    }



    public double sqroot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[SQ ROOT RESULT ] - " + result);
        return result;
    }


    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] - " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[POWER RESULT ] - " + result);
        return result;
    }

    public double naturalLog(double number1) {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[NATURAL LOG RESULT ] - " + result);
        return result;
    }
    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}