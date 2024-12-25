

package Assignment3;
// Program for multiplication table

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("This program gives the multiplication table");

        System.out.println("Write the start table: ");
        int startTable = input.nextInt();

        System.out.println("Write the endTable: ");
        int endTable= input.nextInt();

        for ( int number = startTable; number <= endTable; number++) {
            System.out.println("\n" + number + "-Table: \n");
            for (int i =1; i <=10; i ++){
                System.out.println(number + "*" + i + "=" + number*i);
            }
        }

        input.close();

    }
    
}
