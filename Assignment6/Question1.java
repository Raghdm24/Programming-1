package Assignment6;

import java.util.Random;
public class Question1 {
    public static void main(String[] args) {

        Random random = new Random();                       
        int[] antall= new int[10];                          

        for( int i=0; i<1000; i++){
            int tallet = random.nextInt(10); //(0,9)
            antall[tallet]++;                               //For eksempel, hvis random.nextInt(10) genererer tallet 3, økes verdien i antall[3] med 1. (tallet brukes som indeks)
        }
                    
/*
        for( int i=0; i<5000; i++){
            int tallet = random.nextInt(10); //(0,9)
            antall[tallet]++;
        }

        for( int i=0; i<10000; i++){
            int tallet = random.nextInt(10); //(0,9)
            antall[tallet]++;
        }
*/
        for (int i =0; i<antall.length; i++)                 
        {
            System.out.println("Tallet " + i + " ble hentet ut " + antall[i] + " ganger");
        }

    }
}
