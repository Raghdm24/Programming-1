

package Assignment2;
// Program to determine if a year is a leap year

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check if it's a leap year: ");
        int year = input.nextInt();

        // Check if the year is divisible by 4 and is NOT a century year (regular year/not divisible by 100)
        if (year % 4 == 0 && year % 100 != 0)
            System.out.println("The year " + year + " is a leap year.");
        else if (year % 4 != 0)
            System.out.println("The year " + year + " is not a leap year.");
        else if (year % 100 == 0) { // Check if the year is a century year
            // Check if it is divisible by 400
            if (year % 400 == 0)
                System.out.println("The year " + year + " is a leap year.");
            else
                System.out.println("The year " + year + " is not a leap year.");
        }

        input.close();
    }
}

    

