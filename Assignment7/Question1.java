package Assignment7;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Skriv inn et setning");
        String tekstFraUsern= input.nextLine();

        NewString str1= new NewString(tekstFraUsern);

        String forkort= str1.getForkortning();
        String fjern= str1.getFjernTegn();

        System.out.println(forkort);
        System.out.println(fjern);

        input.close();
    }
}
