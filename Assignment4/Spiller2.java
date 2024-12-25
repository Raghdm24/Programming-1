package Assignment4;


import java.util.Random;
public class Spiller2 {
    private int sumPoeng;

    public Spiller2(){               //Constructor
        sumPoeng = 0;
    }

    // Metode som simulerer kast av terning og oppdaterer poengsummen
    public void kastTerningen(){              

        Random terning= new Random();
        int kastResultat= terning.nextInt(6) + 1; //(6) -->(0-5) , (6)+1 -->(0-5)+1 -->> (1,2,3,4,5,6) -->(0+1, 1+1, 2+1, 3+1..)
        System.out.println("Resultatet er " + kastResultat);

        if (kastResultat == 1){
            sumPoeng+=0;
        }
        else {
            sumPoeng+=kastResultat;
        }
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public boolean erFerdig(){
        return sumPoeng >=100;  

    }
}
