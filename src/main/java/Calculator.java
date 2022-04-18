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
        double num1, num2;
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
                    System.out.print("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial of "+num1+" is : " + calculator.factorial(num1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find square root
                    System.out.print("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root of "+num1+" is : " + calculator.squareRoot(num1));
                    System.out.println("\n");


                    break;
                case 3:
                    // find power
                    System.out.print("Enter first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " power "+num2+" is : " + calculator.power(num1, num2));
                    System.out.println("\n");
                    break;
                case 4:
                    // find natural log
                    System.out.print("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural logarithm of "+num1+" is : " + calculator.naturalLog(num1));
                    System.out.println("\n");
                    break;
                case 5:
                    // find addition
                    System.out.print("Enter first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println("Addition of these numbers is " + calculator.add(num1, num2));
                    System.out.println("\n");
                    break;
                case 6:
                    // find subtraction
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println("Subtraction of these numbers is " + calculator.sub(num1, num2));
                    System.out.println("\n");
                    break;
                case 7:
                    // find multiplication
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println("Multiplication of these numbers is " + calculator.mul(num1, num2));
                    System.out.println("\n");
                    break;
                case 8:
                    // find division
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println("Division of these numbers is " + calculator.div(num1, num2));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double div(double num1,double num2) {
        logger.info("[DIVISION OF - " + num1 + " AND ] - " + num2);
        double answer = 0;
        try {

            if (num2 == 0 ) {
                answer = Double.NaN;
                throw new ArithmeticException("Case of Division by zero exception");
            }
            else {
                answer = num1/num2;
            }
        } catch (ArithmeticException error) {
            System.out.println("[DIVISION EXCEPTION ] - Cannot divide when denominator is zero " + error.getLocalizedMessage());
        }
        logger.info("[DIVISION RESULT ] - " + answer);
        return answer;
    }

    double mul(double num1, double num2) {
        logger.info("[MULTIPLICATION OF - " + num1 + " AND ] - " + num2);
        double answer = num1 * num2;
        logger.info("[MULTIPLICATION RESULT ] - " + answer);
        return answer;
    }

    double sub(double num1, double num2) {
        logger.info("[SUBTRACTION OF - " + num1 + " AND ] - " + num2 );
        double answer = num1 - num2;
        logger.info("[SUBTRACTION RESULT ] - " + answer);
        return answer;
    }

    double add(double num1, double num2) {
        logger.info("[ADDITION OF " + num1 + " AND ] - " + num2);
        double answer = num1 + num2;
        logger.info("[ADDITION RESULT ] - " + answer);
        return answer;
    }


    public double factorial(double num1) {
        logger.info("[FACTORIAL] - " + num1);
        double answer = fact(num1);
        logger.info("[FACTORIAL RESULT ] - " + answer);
        return answer;
    }



    public double squareRoot(double num1) {
        logger.info("[SQ ROOT] - " + num1);
        double answer = Math.sqrt(num1);
        logger.info("[SQ ROOT RESULT ] - " + answer);
        return answer;
    }


    public double power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] - " + num2);
        double answer = Math.pow(num1,num2);
        logger.info("[POWER RESULT ] - " + answer);
        return answer;
    }

    public double naturalLog(double num1) {
        logger.info("[NATURAL LOG] - " + num1);
        double answer = 0;
        try {

            if (num1 <0 ) {
                answer = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                answer = Math.log(num1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[NATURAL LOG RESULT ] - " + answer);
        return answer;
    }
    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}