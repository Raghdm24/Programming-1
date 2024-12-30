package Assignment6;


import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        while (true){

            System.out.println("Skriv inn en tekst, eller trykk enter for å avslutte");
            String tekstFraUsern= input.nextLine();

            //sjekk om teksten er tom for å avslutte programmet  (etter å ha skrevet tekst trykkr man enter, men hvis man trykker enter med engng, da er det ingen tekst som er skrever)
            if(tekstFraUsern.isEmpty()){
                System.out.println("Avslutter programmet");
                break;
            }
            System.out.println("Skriv inn en bokstav for å finne antall forekomster");
            char bokstav= input.next().toLowerCase().charAt(0); //basically som om vi spør om string og tar den første char i stringen

            TekstAnalyse tekst= new TekstAnalyse(tekstFraUsern);

            int forskjelligeBokstaver= tekst.getAntallForskjelligeBokstaver();
            int totalAntallBokstaver= tekst.getTotalAntallBokstaver();
            double prosentIkkeBokstaver= tekst.getTotalProsentIkkeBokstaver();
            int antallForkomster= tekst.getAntallForekomsterTilBestemtBokstav(bokstav);
            char mestForekommendeBokstav= tekst.getMestForekommendeBokstav();

            System.out.println("Antall forskjellige bokstaver: " + forskjelligeBokstaver);
            System.out.println("Totalt antall bokstaver: " + totalAntallBokstaver);
            System.out.printf("Prosent som ikke er bokstaver: " + prosentIkkeBokstaver);
            System.out.println("Antall forekomster av bokstaven '" + bokstav + "' : " + antallForkomster);
            System.out.println("Mest forekommende bokstav: " + mestForekommendeBokstav);

        }

        input.close();
    }

}
