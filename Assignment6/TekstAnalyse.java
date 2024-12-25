package Assignment6;

public class TekstAnalyse {
    int [] antallTegn= new int[30];     
    private String teksten;

    public TekstAnalyse(String teskten) {
        this.teksten = teskten;
        for( int i=0; i<teskten.length(); i++){
            char tegn= Character.toLowerCase(teskten.charAt(i));
            if (tegn >= 'a' && tegn<='å'){
                int indeks = tegn - 'a'; //indeksen fra 0-28 for 'a' til 'å'
                antallTegn[indeks]++;    //(den er null i starten) hvis tegn er= a --> a-a--> 97-97=0 (indeks nr.0 oppdateres)/ b-a-->98-97=1 (indeks nr.1 oppdateres)
            }else{
                antallTegn[29]++;
            }
        }
    }

    public int getAntallForskjelligeBokstaver(){  
        int antallForskejlligeTegn=0;
        for(int i=0; i<=28; i++){
            if(antallTegn[i]>0){
                antallForskejlligeTegn++;
            }
        }
        return antallForskejlligeTegn;
    }

    public int getTotalAntallBokstaver(){   
        int totalAntallBokstaver=0;
        for(int i=0; i<=28; i++){
            totalAntallBokstaver+=antallTegn[i];
        }
        return totalAntallBokstaver;
    }

    public double getTotalProsentIkkeBokstaver(){
        double prosenIkkeBokstaver= ((double)antallTegn[29]/teksten.length())*100;  //må gjøre en av dem double (fordi begge er int) int/int= int-->feil, trengs double.
        System.out.println("Prosent som ikke er bokstaver: " + prosenIkkeBokstaver + "%");
        return prosenIkkeBokstaver;
    }

    public int getAntallForekomsterTilBestemtBokstav(char bokstav){
        int indeksTilBokstaven= bokstav - 'a';
        int antallForekomster= antallTegn[indeksTilBokstaven];
        return antallForekomster;
    }

    public char getMestForekommendeBokstav(){
        int maxForekomster=0;
        int indexTilMestForekommende=0;
        for(int i=0; i<=28; i ++){
            if(antallTegn[i]>maxForekomster){
                maxForekomster=antallTegn[i];
                indexTilMestForekommende=i;
            }
        }
        // Returner bokstaven som forekommer mest
        return (char)(indexTilMestForekommende+'a');


    }



}
