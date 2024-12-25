

package Assignment1;
//converting inches to centimeters

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter inches: ");
        double inches= input.nextDouble();

        double cm= inches * 2.54;
        System.out.println("The inches entered equals " + cm + " in centimeters");

        input.close();
    }

    
    
}
