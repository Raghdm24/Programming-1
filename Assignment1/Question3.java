

package Assignment1;
//Converting from seconds into hours,minutes,seconds

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        
        System.out.println("Enter number of seconds: ");
        int seconds= input.nextInt();

        //The order DOES matter
        int hours = seconds/(3600);
        int minutes = (seconds % 3600)/ 60;
        seconds = seconds % 60;

        System.out.println(
            "Number of hours: " + hours + 
            "\n number of minutes: " + minutes + 
            "\n number of secondds: " + seconds);

        input.close();

        
    }
    
}
