package Assignment5;

import java.util.Scanner;
public class Question1 {
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            
            System.out.println("This program will help you with calculating with Fraction");
            System.out.println("Enter the numerator and denominator for the first fraction in order: ");
            int firstNum= input.nextInt();
            int firstDen= input.nextInt();
            System.out.println("Enter the numerator and denominator for the second fraction in order: ");
            int secondNum= input.nextInt();
            int secondDen= input.nextInt();

            Fraction fraction1= new Fraction(firstNum,firstDen);  
            Fraction fraction2= new Fraction(secondNum,secondDen);

            System.out.println("\nSummation: ");
            fraction1.Summation(fraction2);
            System.out.println("\nSubstraction: ");
            fraction1.Substraction(fraction2);
            System.out.println("\nMultiplication: ");
            fraction1.Multiply(fraction2);
            System.out.println("\nDividion: ");
            fraction1.Divide(fraction2);

            input.close();
            
        }
}
