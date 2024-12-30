package Assignment7;

//For Question 2
public class TekstBehandling {
    private String tekst;


    public TekstBehandling(String tekst) {                    
        this.tekst = tekst;
    }

    public int getAntallOrd(){
        String[] ord= tekst.split(" ");
        return ord.length;  
    }

    public double getGjennomsnittigligOrdLegnde(){           
        String[] words= tekst.split("[\\s.,!?:;]+");
        int antallOrd= words.length;
        int sumAntallBokstaver=0;
        for(String word : words){      
            sumAntallBokstaver+= word.length();
        }

        double gjennomsnittligOrdLengde = (double) sumAntallBokstaver/antallOrd;
        return gjennomsnittligOrdLengde;

    }

    public double getGjennomsnittOrdPrPeriode(){

        String[] setninger= tekst.split("[.!?:]+");
        int periode = setninger.length;     
        int totalOrd=0;

        for(String setning: setninger){
            totalOrd+= setning.split("\\s+").length;
        }

        if(periode==0){
            return 0;
        }
        return (double) totalOrd/periode;          
    }

    public String SkifteOrd(String fra, String til){
        tekst= tekst.replaceAll(fra, til);         
        return tekst;
    }

    public String getOrginalTekst(){
        return tekst;
    }

    public String getTekstIStoreBokstaver(){
        return tekst.toUpperCase();
    }

}
