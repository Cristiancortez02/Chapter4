package Chapter4Homework;

/**
 * Class: Computer
 * Author: Cristian Cortez
 * Course:ITEC 2150 section 03
 * Version: 1.0
 * Description: Create a simple addition calculator in Java. The program should prompt the user to enter 2 integers,
 * then adds the numbers and prints the result.Make sure the program includes appropriate exception handling
 * in case the user does not enter appropriate integer values.
 */

public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter a 2 numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                continueInput = false;
                int totalNum = num1 + num2;
                System.out.println(totalNum);
            }
            catch (Exception e){
                System.out.println(e + " Please try again. Enter two numbers.");
                input.nextLine();
            }
            }while(continueInput);
        }
    }

