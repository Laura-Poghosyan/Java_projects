import java.util.Arrays;
public class Homework2{
    public static <string> void main(String[] args) {

//Arrays:
// Exercise 1. Write a program that finds the minimum and the maximum values of an integer array.

    int[] arr = {28, 104, 4, 9, 4};
    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {

        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);


    //Exercise 2: Remove an element from the array

    int myArr[] = {56, 24, 198, 624};
    int shortenedArr[] = new int[myArr.length - 1];

    int j = 2;
    for (int i = 0, k = 0; i < myArr.length; i++) {

        if (i != j) {
            shortenedArr[k] = myArr[i];
            k++;
        }
    }
    System.out.println("Array after deletion: " + Arrays.toString(shortenedArr));

    //Exercise  Method Calculating two integers or  concating strings
    int calc=sum(5, 6);
    System.out.println("The sum is " + calc);
        System.out.println(sum("5", "10"));            // Output: 15
        System.out.println(sum("Hello, ", "world!"));  // Output: "Hello, world!"
        System.out.println(sum("5", " apples"));        // Output: "5 apples"

    }
// Methods Calculate the sum of two integers
    public static int sum (int a, int b){
        return (a+b);
    }

//    Calculates or concats two arguments based on their type
    public static String sum(String a, String b) {
        try {
            // Try to parse both inputs as numbers
            double num1 = Double.parseDouble(a);
            double num2 = Double.parseDouble(b);
            return String.valueOf(num1 + num2); // Return their sum
        } catch (NumberFormatException e) {
            // If parsing fails, concatenate as strings
            return a + b;
        }
    }
}





