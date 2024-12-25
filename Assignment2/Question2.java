

package Assignment2;
//Find the cheapest meat

public class Question2 {
    public static void main(String[] args) {
        
        double costA= 35.90;
        double costB= 39.50;

        int weightA= 450;
        int weightB= 500;

        double meatA= costA/weightA;
        double meatB= costB/weightB;

        if (meatA > meatB){
            System.out.println("Meat B is cheaper than meat A");
        } else if (meatA < meatB) {
            System.out.println("Meat A is cheaper than meat B");
        } else {
            System.out.println("Both meats costs the same");
        }
    }
    
}
