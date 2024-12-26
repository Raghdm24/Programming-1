package Assignment8;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Person Raghd= new Person("Raghd", "Madhun",  2004);
        ArbTaker arb1= new ArbTaker(Raghd, 1, 2022, 30000, 20);

        System.out.println("Navn: " + arb1.getFullNavn() 
        + "\nAlder: " + arb1.getAlder()
        + "\nArbeidstakerNr: " + arb1.getArbeidsTakerNr()
        + "\nAntall år ansatt i bedriften: " + arb1.getAntallÅrAnsattenIBedriften()
        + "\nBruttoLønn per år: "+ arb1.getBruttoLønnPrÅr(20000)
        + "\nSkatt per måned: " + arb1.getKronerSkattPrMåned(arb1.getMandeslønn(), arb1.getSkatteProsent())
        + "\nTotalt skattetrekk per år: " + arb1.getSkatteTrekkPrÅr(arb1.getMandeslønn(), arb1.getSkatteProsent())
        + "\nAnsatt mer enn 5 år: " + arb1.getAnsattMerEnGittÅr(5) );

        System.out.println("\nAnsattens månedslønn: " + arb1.getMandeslønn()
        + "\nAnsattens skatteProsent: " + arb1.getSkatteProsent());

        String meny= "\n 1.månedsLønn\n 2.skatteKort\n 3.ingenting";
        boolean stopp= false;

        while (true) {
            System.out.println("Velg hva du vil endre: " + meny);
            int valg = input.nextInt();

            switch (valg){
                case 1:
                    System.out.println("Du valgte å endre månedslønn, skriv inn den nye månedsLønnen:");
                    int nyMånedsLønn= input.nextInt();
                    arb1.setManedsLønn(nyMånedsLønn);
                    System.out.println("Ansattens nye månedsLønn " + arb1.getMandeslønn());

                    break;
                case 2:
                    System.out.println("Du valgte å endre skatteProsenten, skriv inn den nye skatteprosenten:");
                    int nySkatteProsent = input.nextInt();
                    arb1.setSkatteProsent(nySkatteProsent);
                    System.out.println("Nye skatteProsent " + arb1.getSkatteProsent());

                    break;
                case 3:
                    stopp= true;
                    break;

                default:            //hvis brukeren gir et valg som ikke er 1, 2, eller 3 
                    System.out.println("Ugyldig valg. Vennligst velg 1, 2 eller 3.");
                    break;
            }

            if ( stopp == true){
                break;
            }
            
        }
        
        input.close();
        

    }
    
}
