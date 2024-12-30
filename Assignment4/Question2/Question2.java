package Assignment4;


public class Question2 {
    public static void main(String[] args) {

        Spiller A= new Spiller();
        Spiller B= new Spiller();

        int rundeNummer=1;

        while(!A.erFerdig() && !B.erFerdig()){         //hvis en av dem blir ferdig, brytes denne while
            //spiller a sin tur
            System.out.println("Runde nr: " + rundeNummer + " til spiller A");
            A.kastTerningen();
            System.out.println("Spiller A sin poengSum "+ A.getSumPoeng());

            if(A.erFerdig()){
                System.out.println("Spiller A har vunnet");
                break;
            }

            //spiller b sin tur
            System.out.println("Runde nr: " + rundeNummer + " til spiller B");
            B.kastTerningen();
            System.out.println("Spiller B sin poengSum "+ B.getSumPoeng());

            if(B.erFerdig()){
                System.out.println("Spiller B har vunnet");
                break;
            }

            rundeNummer++;
        }


    }
}
