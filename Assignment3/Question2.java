

package Assignment3;
//Check if a number is prime number

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String finish;
        
    do{
        System.out.println("Enter a number to check if it's a prime number, or type 'exit' to finish");
        int number= input.nextInt();
        int count = 0;

        for (int i = 1; i<= number; i++){
            if (number % i ==0){
                count ++;
            }
        }
        if (count == 2){                                   // 2 because the prime number is devided by only 2 numbers (itself and 1)
            System.out.println("Its a prime number");
        } else{
            System.out.println("It's not a prime number");
        }

        finish = input.nextLine(); //If the user types exit, th eprogram will end.
        if (finish.equalsIgnoreCase("exit")) {
            break;
        }
    
    } while (true);
    System.out.println( "The program ended");
    input.close();
    }
    
}
