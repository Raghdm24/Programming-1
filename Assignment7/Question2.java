package Assignment7;

public class Question2 {
    public static void main(String[] args) {

        TekstBehandling tb = new TekstBehandling("Dette er en test. Er det mulig å finne ut hva som finnes her? Kanskje!");

        // Tester metodene og viser resultatene
        System.out.println("Original tekst: " + tb.getOrginalTekst());
        System.out.println("Antall ord: " + tb.getAntallOrd());
        System.out.println("Gjennomsnittlig ordlengde: " + tb.getGjennomsnittigligOrdLegnde());
        System.out.println("Gjennomsnittlig antall ord per periode: " + tb.getGjennomsnittOrdPrPeriode());

        // Skifter ut ordet "finnes" med "er her"
        System.out.println("Tekst etter ordskifte: " + tb.SkifteOrd("finnes", "er her"));

        // Viser teksten i store bokstaver
        System.out.println("Tekst i store bokstaver: " + tb.getTekstIStoreBokstaver());

    }
}
