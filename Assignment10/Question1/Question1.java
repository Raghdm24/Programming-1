package Assignment10.Question1;

public class Question1 {
    public static void main(String[] args) {

        Arrangement arrangement1 = new Arrangement(1, "Konsert med Stjernene", "Oslo Konserthus", "Oslo Musikkforening", "Konsert", 202310301900L);
        Arrangement arrangement2 = new Arrangement(2, "Barneteater: Eventyret", "Oslo Teater", "Teater for Barn", "Barneteater", 202310251500L);
        Arrangement arrangement3 = new Arrangement(3, "Foredrag om Bærekraft", "Kulturhuset", "Miljøforeningen", "Foredrag", 202310201800L);
        Arrangement arrangement4 = new Arrangement(4, "Jazzkveld", "Nasjonal Jazzscene", "Jazzklubben", "Konsert", 202311051900L);
        Arrangement arrangement5 = new Arrangement(5, "Folkefest i Parken", "Frognerparken", "Oslo Kommune", "Festival", 202311151200L);

        ArrangementRegister arrangementRegister= new ArrangementRegister();
        arrangementRegister.setArrangement(arrangement1);
        arrangementRegister.setArrangement(arrangement2);
        arrangementRegister.setArrangement(arrangement3);
        arrangementRegister.setArrangement(arrangement4);
        arrangementRegister.setArrangement(arrangement5);

        System.out.println(arrangementRegister);
        System.out.println("-------------------------");
        System.out.println(arrangementRegister.getArrangementsVedGittSted("Oslo Teater"));
        System.out.println(arrangementRegister.getArrangementsVedGittDato(202311151200L));
        System.out.println(arrangementRegister.getArrangementsInnenGitt2Datoer(202311101000L, 202311201000L));
        System.out.println(arrangementRegister.getArrangementsSortertSted());
        System.out.println(arrangementRegister.getArrangementsSortertDato());
        System.out.println(arrangementRegister.getArrangementsSortertType());
        System.out.println("--------------------------");
        System.out.println(arrangement1);          //Her brukes to-String som er i klassen Arrangement
        System.out.println(arrangementRegister);   //Her brukes to-String som er i klassen ArrangementRegister

    }
}
