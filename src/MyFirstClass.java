public class MyFirstClass {
    public static <string> void main(String[] args) {

//Branching
//Exercise 1: Write a program that takes as an input three numbers and prints "increasing"
// if the numbers are in increasing orders and "decreasing" if in decreasing order,and
// "neither" otherwise (use conditional operators).

        int e = 85, g = 175, s = 6; // I know it would be better to rename the variable names, however I didn't spend time on it this time :)

        if (e < g && g < s) {
            System.out.println("The numbers are increasing: " + e + ", " + g + ", " + s);
        } else if (e > g && g > s) {
            System.out.println("The numbers are decreasing: " + e + ", " + g + ", " + s);
        } else {
            System.out.println("Neither: " + e + ", " + g + ", " + s);
        }

//Exercise 1: Second version

        if (e < g) {
            if (g < s) {
                System.out.println("The numbers are increasing: " + e + ", " + g + ", " + s);
            } else {
                System.out.println("Neither: " + e + ", " + g + ", " + s);
            }
        } else if (e > g) {
            if (g > s) {
                System.out.println("The numbers are decreasing: " + e + ", " + g + ", " + s);
            } else {
                System.out.println("Neither: " + e + ", " + g + ", " + s);
            }
        } else {
            System.out.println("Neither: " + e + ", " + g + ", " + s);
        }

        //Exercise 2: Leap Year
        int leapYear = 2028;
        if (leapYear % 400 == 0 || (leapYear % 4 == 0 && leapYear % 100 != 0)) {
            System.out.println(leapYear + " " + " is a leap year");
        } else {
            System.out.println(leapYear + " " + " is not a leap year");
        }


//Exercise 3: calculating numbers using different operators by switch case

        double numberOne = 15, numberTwo = 25;
        char operator = '%';
        double $result = 0;

        switch (operator) {
            case '+': {
                $result = numberOne + numberTwo;
                System.out.println("The operator is addition(+)" + " and the result is: " + $result);
            }
            break;
            case '-': {
                $result = numberOne - numberTwo;
                System.out.println("The operator is subtraction(-) " + "and the result is: " + $result);
            }
            break;
            case '*': {
                $result = numberOne * numberTwo;
                System.out.println("The operator is multiplication" + " and the result is: " + $result);
            }
            break;
            case '/': {
                $result = numberOne / numberTwo;
            }
            System.out.println("The operator is devision " + " and the result is: " + $result);
            break;
            case '%': {
                $result = numberOne % numberTwo;
                System.out.println("The operator is modulus " + " and the result is: " + $result);
            }
            break;
            default:
                System.out.println("User doesn't enter any valid operator ");


        }

// Exercise 4: Printing respective course based on the semester and the program

        String semester = "Fall";
        String program = "CS";
        switch (semester) {                //merged version
            case "Fall", "Spring":
                switch (program) {
                    case "CS":
                        System.out.println("The semester is " + semester + " and it includes 'Introduction to computer science' subject");
                        break;
                    case "EC":
                        System.out.println("The semester is " + semester + " and it includes 'English literature' subject");
                        break;
                    default:
                        System.out.println("No specific subject for this program in " + semester);
                }
                break;
            default:
                System.out.println("No specific semester defined.");
        }

      /* Long version
       switch (semester) {
            case "Fall":
                switch (program) {
                    case "CS":
                        System.out.println("The semester is " + semester + " and it includes introduction to computer science subject");
                        break;
                    case "EC":
                        System.out.println("The semester is " + semester + " and it includes English literature subject");
                        break;
                    default:
                        System.out.println("No specific subject for this program in " + semester);
                }
                break;
            case "Spring":
                switch (program) {
                    case "CS":
                        System.out.println("The semester is " + semester + " and it includes introduction to computer science subject");
                        break;
                    case "EC":
                        System.out.println("The semester is " + semester + " and it includes English literature subject");
                        break;
                    default:
                        System.out.println("No specific subject for this program in " + semester);
                }
                break;
            default:
                System.out.println("No specific semester defined.");

       */

     // Looping
     // Exercise 1: Counting digits of any positive integer number.

        int positiveNumber = 12489;
        int count = 0;

        while (positiveNumber > 0) {
            positiveNumber = positiveNumber / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        //Exercise 2: Write a program that allows user to enter as many numbers as
        // they want and at the end of the program should display the largest and the smallest numbers entered

        //...........?



        //Exercise 3:Asking a user to enter numbers and displaying the calculated sum

        boolean continueLoop; //I know that this will not work in real life case,
                              // however I got familiar with the syntax of do while loop while writing the exercise
        int numberFirst = 5;
        int numberSecond = 6;
        do {
            System.out.println("Enter the first number: " + numberFirst);
            System.out.println("Enter the second number: " + numberSecond);

            int sum = numberFirst + numberSecond;
            System.out.println("The sum is: " + sum);

            // Ask the user if they want to continue
            System.out.print("Do you want to enter more numbers? (y/n): ");
            String answer = "no";
            if (answer.equals("yes") ) continueLoop = true;
            else {

               System.out.println("Program ended.");
                break;

            }
        } while(continueLoop);


        //Exercise 4:...................?

        //Exercise 5: Determining Armstrong numbers

        int[] armstrongNumbers = new int[500];
        int index = 0;

        for (int armstrongNumber = 1; armstrongNumber <= 500; armstrongNumber++) {

            if (armstrongNumber >= 1 && armstrongNumber <= 9) {
                // Single-digit numbers are always Armstrong numbers
                armstrongNumbers[index++] = armstrongNumber;
            } else if (armstrongNumber >= 10 && armstrongNumber <= 99) {
                // Two-digit numbers
                int digit1 = armstrongNumber / 10;
                int digit2 = armstrongNumber % 10;
                if (digit1 * digit1 + digit2 * digit2 == armstrongNumber) {
                    armstrongNumbers[index++] = armstrongNumber;
                }
            } else if (armstrongNumber >= 100 && armstrongNumber <= 500) {
                // Three-digit numbers
                int digit1 = armstrongNumber / 100;
                int digit2 = (armstrongNumber / 10) % 10;
                int digit3 = armstrongNumber % 10;
                if (digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit3 * digit3 * digit3 == armstrongNumber) {
                    armstrongNumbers[index++] = armstrongNumber;
                }
            }
        }
        System.out.print("There are " + index + " Armstrong Numbers between 1 and 500: ");
        for (int i = 0; i < index; i++) {
            System.out.print(armstrongNumbers[i] + ",");

        }
        System.out.println();


        //Exercise 6: Printing n numbers of Fibonacci sequence

        int n = 11;
        int first = 0, second = 1, next;
        if (n <= 0) {

            System.out.println("Please enter a positive number.");
        } else if (n == 1) {
            System.out.print(first + " ");

        } else if (n > 1) {
            System.out.print("Fibonacci sequence: ");

            System.out.print(first + " ");
            System.out.print(second + " ");

            for (int i = 3; i <= n; i++) {

                next = first + second;
                first = second;
                second = next;

                System.out.print(next + " ");

            }
            System.out.println();

        }

      // Exercise 7: Logarithm.

        int n1 = 365;
        double naturalLogOf2 = 0.0;

        for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0) {
                // Subtracting terms for even indices
                naturalLogOf2 -= 1.0 / i;
            } else {
                // Adding terms for odd indices
                naturalLogOf2 += 1.0 / i;
            }
        }

        // Exercise 8: Displaying dimond-like patterns.

        int size=3;                 // not finished
        int asterisks=1;
        for(int i=0; i<size; i++) {
            for (int
                 n2 = 1; n2 <= size - i; n2++) {
                System.out.print(" ");

            }
            for(int j=0; j<asterisks; j++) {

                System.out.print('*');

            }
            System.out.println();
            asterisks+=2;

        }


    }

}
