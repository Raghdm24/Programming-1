package Assignment5;

import java.util.Random;

public class MyRandom {
    Random random;          

    public MyRandom() {                       
        this.random = new Random();  
    }

    public int nesteHeltall(int nedre, int ovre){
        int nesteHeltall= random.nextInt(ovre-nedre) + nedre;
        return nesteHeltall;
    }

    public double nesteDesimaltall(double nedre, double ovre){
        double nesteDesimaltall= random.nextDouble() * (ovre - nedre) + nedre;      
        return nesteDesimaltall;                                                    
    }
}
