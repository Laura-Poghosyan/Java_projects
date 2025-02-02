package Package2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
           System.out.println("Enter the first number");
           double number1=scanner.nextDouble();
           System.out.println("Enter the second number");
           double number2=scanner.nextDouble();
           double result = number1/number2;
           System.out.println(result);

       } catch (ArithmeticException exception) {
       System.out.println("You can't devided a number by zero");
       }
       catch (InputMismatchException exception) {
           System.out.println("invalid input");
       }
       finally {
           System.out.println("Execution is ended");
       }

    }



}