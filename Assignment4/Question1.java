

package Assignment4;

//Exchange currency prograam
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Exchange currency program \nDo you want to change 'from' or 'to' Norwegian Kr ? ");
        String choice = input.next();
        String meny= "\n 1:dollar \n 2:euro \n 3:swedishKroner \n 4:exit";
        System.out.println("Enter the amount: ");
        double amount = input.nextDouble();

        Valuta1 one =  new Valuta1(amount);

        //From Kr to (dollar,euro,swedish)
        if ( choice.equalsIgnoreCase("from")) {
            System.out.println("Exchanging norwegian kr to one of the following: " + meny);
            int choosenMeny= input.nextInt();

            switch (choosenMeny){
                case 1:
                    System.out.println("You chose exchaning from norwegian Kr to dollar: " + amount + " Kr equals " + one.getNorwegianToDollar() + " dollars" );
                    break;
                case 2:
                    System.out.println("You chose exchaning from norwegian Kr to euro: " + amount + " Kr equals " + one.getNorwegianToEuro() + " euro" );
                    break;
                case 3:
                    System.out.println("You chose exchaning from norwegian Kr to swedish kr: " + amount+ " Kr equals " + one.getNorwegianToSwedishKroner() + " Swedish Kroner" );
                    break;
                case 4:
                    break;
            }
        }
        
        //From (dollar,euro,swedish) to Kr
        else if (choice.equalsIgnoreCase("to")) {
            System.out.println("Choose one of the following: " + meny + "to exchange to Norwegian Kr");
            int choosenMeny = input.nextInt();

            switch (choosenMeny){
                case 1:
                    System.out.println("You chose from dollar to norwegian Kr: " + amount + " dollar equals " +  one.getDollarToNorwegian() + " norwegian kroner");
                    break;
                case 2:
                    System.out.println("You chose from euro to norwegian Kr: "  + amount + " euro equals "+  one.getEuroToNorwegian() + " norwegian kroner");
                    break;
                case 3:
                    System.out.println("You chose from swedish kroner to norwegian Kr: " + amount + " swedish kroner equals " + one.getSwedishKronerToNorwegian() + " norwegian kroner");
                    break;
                case 4:
                    break;
            }
        }  
        
        input.close();
    }
}
