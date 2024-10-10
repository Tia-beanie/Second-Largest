/**
 * Midterm Question: write a program, ask user to enter 10 numbers, find out the second largest number and display it.
 */

import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int inputNum, secondLargest = 0, largestNum = 0;
     
        for(int i = 0; i < 10; i++){
            System.out.println("Enter a poivitive integer: ");
            inputNum = input.nextInt();

            if(inputNum > largestNum){
                secondLargest = largestNum;
                largestNum = inputNum;
            }
        }

        System.out.println("The second largest number is: " +  secondLargest);

    }
}
