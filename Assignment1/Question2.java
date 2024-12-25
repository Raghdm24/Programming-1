

package Assignment1;
//Converting hours, minutes, seconds to total seconds.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hours = input.nextInt();

        System.out.println("Enter minutes: ");
        int minutes= input.nextInt();

        System.out.println("Enter seconds");
        int seconds=  input.nextInt();

        int TotalSeconds= hours*60*60 + minutes*60 + seconds;
        System.out.println("Your total seconds: " + TotalSeconds);

        input.close();
    }
    
}
