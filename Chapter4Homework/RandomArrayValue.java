package Chapter4Homework;
import java.util.*;
/**
 * Class: RandomArrayValue
 * Author: Cristian Cortez
 * Course:ITEC 2150 section 03
 * Version: 1.0
 * Description: Write a Java program to randomly create an array of 50 double values.
 * Prompt the user to enter an index and prints the corresponding array value.
 * Include exception handling that prevents the program
 * from terminating if an out of range index is entered by the user.
 */

public class RandomArrayValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                int n = 50;
                ArrayList<Double> list = new ArrayList<>(n);
                for (int i = 0; i < n; i++) {
                    list.add(Math.random());
                }
                System.out.println(list);
                System.out.println("Enter an index value ");
                int num = input.nextInt();
                System.out.println("You entered the last index number " + num);
                System.out.println("The number of the index " + num + " is " + list.get(num));
                continueInput = false;
            }catch(Exception e){
                System.out.println("Index out of bounds. Please Try again. ");
                input.nextLine();
            }
        }while(continueInput);
    }
}